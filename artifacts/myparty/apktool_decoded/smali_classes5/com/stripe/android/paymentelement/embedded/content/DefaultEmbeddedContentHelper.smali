.class public final Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;
.super Ljava/lang/Object;
.source "EmbeddedContentHelper.kt"

# interfaces
.implements Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContentHelper;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$Companion;,
        Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$State;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEmbeddedContentHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmbeddedContentHelper.kt\ncom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,316:1\n1755#2,3:317\n*S KotlinDebug\n*F\n+ 1 EmbeddedContentHelper.kt\ncom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper\n*L\n231#1:317,3\n*E\n"
.end annotation

.annotation runtime Ljavax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00de\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u0000 Q2\u00020\u0001:\u0002PQB\u00b3\u0001\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0001\u0010\n\u001a\u00020\u000b\u0012\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u001a\u0010\u0015\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017j\u0004\u0018\u0001`\u00190\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020\'\u00a2\u0006\u0004\u0008(\u0010)J \u00109\u001a\u00020\u00182\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0016J\u0008\u0010@\u001a\u00020\u0018H\u0016J\u0010\u0010A\u001a\u00020\u00182\u0006\u00107\u001a\u000208H\u0016J\u0008\u0010B\u001a\u00020\u0018H\u0016J\u0010\u0010C\u001a\u00020D2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J8\u0010E\u001a\u00020F2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010:\u001a\u00020;2\u000e\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010H0+2\u0006\u0010I\u001a\u00020?2\u0006\u0010>\u001a\u00020?H\u0002J \u0010J\u001a\u00020K2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010:\u001a\u00020;2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0008\u0010L\u001a\u00020\u0018H\u0002J\u0012\u0010M\u001a\u00020\u00182\u0008\u0010N\u001a\u0004\u0018\u00010OH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0015\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017j\u0004\u0018\u0001`\u00190\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0+X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u00102R\u0016\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040+X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u00102R\u0010\u00107\u001a\u0004\u0018\u000108X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006R"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContentHelper;",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "eventReporter",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "errorReporter",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "uiContext",
        "customerRepository",
        "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
        "selectionHolder",
        "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;",
        "embeddedLinkHelper",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedLinkHelper;",
        "rowSelectionImmediateActionHandler",
        "Lcom/stripe/android/paymentelement/embedded/EmbeddedRowSelectionImmediateActionHandler;",
        "internalRowSelectionCallback",
        "Ljavax/inject/Provider;",
        "Lkotlin/Function0;",
        "",
        "Lcom/stripe/android/paymentelement/embedded/InternalRowSelectionCallback;",
        "embeddedWalletsHelper",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedWalletsHelper;",
        "customerStateHolder",
        "Lcom/stripe/android/paymentsheet/CustomerStateHolder;",
        "embeddedFormHelperFactory",
        "Lcom/stripe/android/paymentelement/embedded/EmbeddedFormHelperFactory;",
        "confirmationHandler",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;",
        "confirmationStateHolder",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;",
        "linkPaymentLauncher",
        "Lcom/stripe/android/link/LinkPaymentLauncher;",
        "linkAccountHolder",
        "Lcom/stripe/android/link/account/LinkAccountHolder;",
        "<init>",
        "(Lkotlinx/coroutines/CoroutineScope;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedLinkHelper;Lcom/stripe/android/paymentelement/embedded/EmbeddedRowSelectionImmediateActionHandler;Ljavax/inject/Provider;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedWalletsHelper;Lcom/stripe/android/paymentsheet/CustomerStateHolder;Lcom/stripe/android/paymentelement/embedded/EmbeddedFormHelperFactory;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;Lcom/stripe/android/link/LinkPaymentLauncher;Lcom/stripe/android/link/account/LinkAccountHolder;)V",
        "state",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$State;",
        "_embeddedContent",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContent;",
        "embeddedContent",
        "getEmbeddedContent",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "_walletButtonsContent",
        "Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;",
        "walletButtonsContent",
        "getWalletButtonsContent",
        "sheetLauncher",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedSheetLauncher;",
        "dataLoaded",
        "paymentMethodMetadata",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
        "appearance",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;",
        "embeddedViewDisplaysMandateText",
        "",
        "clearEmbeddedContent",
        "setSheetLauncher",
        "clearSheetLauncher",
        "createWalletButtonsInteractor",
        "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;",
        "createInteractor",
        "Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor;",
        "walletsState",
        "Lcom/stripe/android/paymentsheet/state/WalletsState;",
        "isImmediateAction",
        "createSavedPaymentMethodMutator",
        "Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;",
        "invokeRowSelectionCallback",
        "setSelection",
        "paymentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "State",
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

.field public static final Companion:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$Companion;

.field public static final STATE_KEY_EMBEDDED_CONTENT:Ljava/lang/String; = "STATE_KEY_EMBEDDED_CONTENT"


# instance fields
.field private final _embeddedContent:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContent;",
            ">;"
        }
    .end annotation
.end field

.field private final _walletButtonsContent:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;",
            ">;"
        }
    .end annotation
.end field

.field private final confirmationHandler:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;

.field private final confirmationStateHolder:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;

.field private final coroutineScope:Lkotlinx/coroutines/CoroutineScope;

.field private final customerRepository:Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

.field private final customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

.field private final embeddedContent:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContent;",
            ">;"
        }
    .end annotation
.end field

.field private final embeddedFormHelperFactory:Lcom/stripe/android/paymentelement/embedded/EmbeddedFormHelperFactory;

.field private final embeddedLinkHelper:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedLinkHelper;

.field private final embeddedWalletsHelper:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedWalletsHelper;

.field private final errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

.field private final eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

.field private final internalRowSelectionCallback:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field private final linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

.field private final linkPaymentLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

.field private final rowSelectionImmediateActionHandler:Lcom/stripe/android/paymentelement/embedded/EmbeddedRowSelectionImmediateActionHandler;

.field private final savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

.field private final selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

.field private sheetLauncher:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedSheetLauncher;

.field private final state:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$State;",
            ">;"
        }
    .end annotation
.end field

.field private final uiContext:Lkotlin/coroutines/CoroutineContext;

.field private final walletButtonsContent:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;",
            ">;"
        }
    .end annotation
.end field

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public static synthetic $r8$lambda$0FvMWh3jxseXOm52ty1Ik5Q16OU(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->createInteractor$lambda$1(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$2lNaiys64yH7HDXTdp6j0Fg4ogM(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lcom/stripe/android/paymentsheet/FormHelper;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->createInteractor$lambda$9(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lcom/stripe/android/paymentsheet/FormHelper;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$3J-JKvjhSt7_5JLc20XQ8rKmYNY(Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->createInteractor$lambda$2(Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$AF3TmDdm_0pS9MwcMHrA6SrzD-c(Lcom/stripe/android/paymentsheet/FormHelper;Ljava/lang/String;)Lcom/stripe/android/paymentsheet/FormHelper$FormType;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->createInteractor$lambda$4(Lcom/stripe/android/paymentsheet/FormHelper;Ljava/lang/String;)Lcom/stripe/android/paymentsheet/FormHelper$FormType;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$D3tWF0SheNOuSxQUruPhNfg4Nto()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->createSavedPaymentMethodMutator$lambda$10()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$T2vcuXWKFSH7cwmsEGZZVnwwjTg(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/CustomerStateHolder;Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p7}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->createSavedPaymentMethodMutator$lambda$11(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/CustomerStateHolder;Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$TlyFNfs4NKZdqHaVG12PnrFj8A4(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->createInteractor$lambda$0(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$WdwZU0Y5NvKMW64RweP5aAfVy-0(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->createInteractor$lambda$5(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$aPZ-c41oFLXtIqT3IzCIlVJzg3g(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->createInteractor$lambda$7(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$dkz00EoZCs1_TsWz3TIgNM-tSdY(ZZ)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->createInteractor$lambda$3(ZZ)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$tSgSQG6YrifSB17O7EXu_yg8-0U(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->createInteractor$lambda$8(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->Companion:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->$stable:I

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/CoroutineScope;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedLinkHelper;Lcom/stripe/android/paymentelement/embedded/EmbeddedRowSelectionImmediateActionHandler;Ljavax/inject/Provider;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedWalletsHelper;Lcom/stripe/android/paymentsheet/CustomerStateHolder;Lcom/stripe/android/paymentelement/embedded/EmbeddedFormHelperFactory;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;Lcom/stripe/android/link/LinkPaymentLauncher;Lcom/stripe/android/link/account/LinkAccountHolder;)V
    .locals 16
    .param p1    # Lkotlinx/coroutines/CoroutineScope;
        .annotation runtime Lcom/stripe/android/core/injection/ViewModelScope;
        .end annotation
    .end param
    .param p5    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param
    .param p6    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/UIContext;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Landroidx/lifecycle/SavedStateHandle;",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
            "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedLinkHelper;",
            "Lcom/stripe/android/paymentelement/embedded/EmbeddedRowSelectionImmediateActionHandler;",
            "Ljavax/inject/Provider<",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;>;",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedWalletsHelper;",
            "Lcom/stripe/android/paymentsheet/CustomerStateHolder;",
            "Lcom/stripe/android/paymentelement/embedded/EmbeddedFormHelperFactory;",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;",
            "Lcom/stripe/android/link/LinkPaymentLauncher;",
            "Lcom/stripe/android/link/account/LinkAccountHolder;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    const-string v0, "coroutineScope"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiContext"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerRepository"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectionHolder"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "embeddedLinkHelper"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rowSelectionImmediateActionHandler"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "internalRowSelectionCallback"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "embeddedWalletsHelper"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerStateHolder"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "embeddedFormHelperFactory"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationHandler"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationStateHolder"

    move-object/from16 v15, p16

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkPaymentLauncher"

    move-object/from16 v15, p17

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccountHolder"

    move-object/from16 v15, p18

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    .line 67
    iput-object v1, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    .line 68
    iput-object v2, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    .line 69
    iput-object v3, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    .line 70
    iput-object v4, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 71
    iput-object v5, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->workContext:Lkotlin/coroutines/CoroutineContext;

    .line 72
    iput-object v6, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->uiContext:Lkotlin/coroutines/CoroutineContext;

    .line 73
    iput-object v7, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->customerRepository:Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

    .line 74
    iput-object v8, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    .line 75
    iput-object v9, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->embeddedLinkHelper:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedLinkHelper;

    .line 76
    iput-object v10, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->rowSelectionImmediateActionHandler:Lcom/stripe/android/paymentelement/embedded/EmbeddedRowSelectionImmediateActionHandler;

    .line 77
    iput-object v11, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->internalRowSelectionCallback:Ljavax/inject/Provider;

    .line 78
    iput-object v12, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->embeddedWalletsHelper:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedWalletsHelper;

    .line 79
    iput-object v13, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    .line 80
    iput-object v14, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->embeddedFormHelperFactory:Lcom/stripe/android/paymentelement/embedded/EmbeddedFormHelperFactory;

    move-object/from16 v3, p15

    .line 81
    iput-object v3, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->confirmationHandler:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;

    move-object/from16 v3, p16

    .line 82
    iput-object v3, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->confirmationStateHolder:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;

    move-object/from16 v3, p17

    .line 83
    iput-object v3, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->linkPaymentLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

    .line 84
    iput-object v15, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    .line 87
    const-string v3, "STATE_KEY_EMBEDDED_CONTENT"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    iput-object v2, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->state:Lkotlinx/coroutines/flow/StateFlow;

    .line 92
    invoke-static {v4}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v2

    iput-object v2, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->_embeddedContent:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 93
    invoke-static {v2}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    iput-object v2, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->embeddedContent:Lkotlinx/coroutines/flow/StateFlow;

    .line 95
    invoke-static {v4}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v2

    iput-object v2, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->_walletButtonsContent:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 96
    invoke-static {v2}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    iput-object v2, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->walletButtonsContent:Lkotlinx/coroutines/flow/StateFlow;

    .line 101
    new-instance v2, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$1;

    invoke-direct {v2, v0, v4}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$1;-><init>(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    const/4 v3, 0x3

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 p2, v1

    move-object/from16 p5, v2

    move/from16 p6, v3

    move-object/from16 p7, v5

    move-object/from16 p3, v6

    move-object/from16 p4, v7

    invoke-static/range {p2 .. p7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 123
    new-instance v1, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$2;

    invoke-direct {v1, v0, v4}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$2;-><init>(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    const/4 v2, 0x3

    const/4 v3, 0x0

    move-object/from16 p2, p1

    move-object/from16 p5, v1

    move/from16 p6, v2

    move-object/from16 p7, v3

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    invoke-static/range {p2 .. p7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public static final synthetic access$createInteractor(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lkotlinx/coroutines/flow/StateFlow;ZZ)Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor;
    .locals 0

    .line 65
    invoke-direct/range {p0 .. p5}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->createInteractor(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lkotlinx/coroutines/flow/StateFlow;ZZ)Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$createWalletButtonsInteractor(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lkotlinx/coroutines/CoroutineScope;)Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;
    .locals 0

    .line 65
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->createWalletButtonsInteractor(Lkotlinx/coroutines/CoroutineScope;)Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCoroutineScope$p(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;)Lkotlinx/coroutines/CoroutineScope;
    .locals 0

    .line 65
    iget-object p0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    return-object p0
.end method

.method public static final synthetic access$getEmbeddedWalletsHelper$p(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;)Lcom/stripe/android/paymentelement/embedded/content/EmbeddedWalletsHelper;
    .locals 0

    .line 65
    iget-object p0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->embeddedWalletsHelper:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedWalletsHelper;

    return-object p0
.end method

.method public static final synthetic access$getInternalRowSelectionCallback$p(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;)Ljavax/inject/Provider;
    .locals 0

    .line 65
    iget-object p0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->internalRowSelectionCallback:Ljavax/inject/Provider;

    return-object p0
.end method

.method public static final synthetic access$getState$p(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    .line 65
    iget-object p0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->state:Lkotlinx/coroutines/flow/StateFlow;

    return-object p0
.end method

.method public static final synthetic access$get_embeddedContent$p(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 65
    iget-object p0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->_embeddedContent:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method public static final synthetic access$get_walletButtonsContent$p(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 65
    iget-object p0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->_walletButtonsContent:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method public static final synthetic access$invokeRowSelectionCallback(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->invokeRowSelectionCallback()V

    return-void
.end method

.method public static final synthetic access$setSelection(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V
    .locals 0

    .line 65
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->setSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    return-void
.end method

.method private final createInteractor(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lkotlinx/coroutines/flow/StateFlow;ZZ)Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor;
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/state/WalletsState;",
            ">;ZZ)",
            "Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor;"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 185
    new-instance v7, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor;

    .line 186
    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getPaymentMethodIncentive()Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;

    move-result-object v1

    .line 185
    invoke-direct {v7, v1}, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor;-><init>(Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;)V

    .line 188
    iget-object v1, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->embeddedFormHelperFactory:Lcom/stripe/android/paymentelement/embedded/EmbeddedFormHelperFactory;

    .line 191
    iget-object v5, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    .line 188
    new-instance v6, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda0;

    invoke-direct {v6, v0}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;)V

    const/4 v3, 0x0

    move-object/from16 v2, p1

    move-object/from16 v4, p2

    invoke-virtual/range {v1 .. v6}, Lcom/stripe/android/paymentelement/embedded/EmbeddedFormHelperFactory;->create(Lkotlinx/coroutines/CoroutineScope;ZLcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/paymentsheet/FormHelper;

    move-result-object v1

    move-object v2, v4

    .line 202
    iget-object v3, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    move-object/from16 v4, p1

    .line 199
    invoke-direct {v0, v4, v2, v3}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->createSavedPaymentMethodMutator(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/CustomerStateHolder;)Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;

    move-result-object v3

    .line 208
    iget-object v4, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->confirmationHandler:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;

    invoke-interface {v4}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;->getState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v4

    new-instance v5, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda2;

    invoke-direct {v5}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda2;-><init>()V

    invoke-static {v4, v5}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v4

    .line 209
    iget-object v5, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->confirmationStateHolder:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;

    invoke-virtual {v5}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;->getStateFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v5

    new-instance v6, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda3;

    invoke-direct {v6}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda3;-><init>()V

    invoke-static {v5, v6}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v5

    new-instance v6, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda4;

    invoke-direct {v6}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda4;-><init>()V

    .line 207
    invoke-static {v4, v5, v6}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v4

    .line 213
    iget-object v5, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    invoke-virtual {v5}, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->getTemporarySelection()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v5

    .line 214
    iget-object v6, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    invoke-virtual {v6}, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->getSelection()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v6

    .line 219
    new-instance v8, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$createInteractor$4;

    invoke-direct {v8, v1}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$createInteractor$4;-><init>(Ljava/lang/Object;)V

    check-cast v8, Lkotlin/reflect/KFunction;

    .line 237
    iget-object v9, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    invoke-virtual {v9}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->getPaymentMethods()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v11

    .line 238
    iget-object v9, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    invoke-virtual {v9}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->getMostRecentlySelectedSavedPaymentMethod()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v12

    .line 239
    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->getProvidePaymentMethodName()Lkotlin/jvm/functions/Function1;

    move-result-object v13

    .line 240
    iget-object v9, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    invoke-virtual {v9}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->getCanRemove()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v14

    .line 241
    iget-object v9, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    invoke-virtual {v9}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->getCanUpdateFullPaymentMethodDetails()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v18

    const/4 v9, 0x1

    .line 248
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    invoke-static {v10}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v20

    .line 249
    new-instance v10, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$createInteractor$5;

    iget-object v15, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    invoke-direct {v10, v15}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$createInteractor$5;-><init>(Ljava/lang/Object;)V

    check-cast v10, Lkotlin/reflect/KFunction;

    .line 250
    new-instance v15, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$createInteractor$6;

    iget-object v9, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    invoke-direct {v15, v9}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$createInteractor$6;-><init>(Ljava/lang/Object;)V

    check-cast v15, Lkotlin/reflect/KFunction;

    .line 251
    new-instance v9, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$createInteractor$7;

    invoke-direct {v9, v3}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$createInteractor$7;-><init>(Ljava/lang/Object;)V

    check-cast v9, Lkotlin/reflect/KFunction;

    .line 263
    new-instance v3, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$createInteractor$8;

    invoke-direct {v3, v0}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$createInteractor$8;-><init>(Ljava/lang/Object;)V

    check-cast v3, Lkotlin/reflect/KFunction;

    if-eqz p4, :cond_0

    if-eqz p5, :cond_0

    const/16 v26, 0x1

    goto :goto_0

    :cond_0
    const/16 v16, 0x0

    move/from16 v26, v16

    .line 205
    :goto_0
    new-instance v16, Lcom/stripe/android/paymentsheet/verticalmode/DefaultPaymentMethodVerticalLayoutInteractor;

    move-object/from16 v17, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    .line 216
    new-instance v7, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda5;

    invoke-direct {v7, v1}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda5;-><init>(Lcom/stripe/android/paymentsheet/FormHelper;)V

    .line 219
    check-cast v8, Lkotlin/jvm/functions/Function2;

    move-object/from16 v19, v9

    .line 220
    new-instance v9, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda6;

    invoke-direct {v9, v0, v2}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda6;-><init>(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)V

    move-object/from16 v21, v10

    .line 227
    new-instance v10, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda7;

    invoke-direct {v10, v0, v2}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda7;-><init>(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)V

    .line 245
    new-instance v2, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda8;

    invoke-direct {v2, v0}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda8;-><init>(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;)V

    .line 249
    check-cast v21, Lkotlin/jvm/functions/Function1;

    .line 250
    move-object/from16 v22, v15

    check-cast v22, Lkotlin/jvm/functions/Function1;

    .line 251
    move-object/from16 v23, v19

    check-cast v23, Lkotlin/jvm/functions/Function1;

    .line 252
    new-instance v15, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda9;

    invoke-direct {v15, v0, v1}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda9;-><init>(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lcom/stripe/android/paymentsheet/FormHelper;)V

    .line 263
    move-object/from16 v25, v17

    check-cast v25, Lkotlin/jvm/functions/Function0;

    const/high16 v29, 0x6000000

    const/16 v30, 0x0

    move-object/from16 v1, v16

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v19, v2

    move-object/from16 v24, v15

    move-object/from16 v2, p2

    move-object/from16 v15, p3

    .line 205
    invoke-direct/range {v1 .. v30}, Lcom/stripe/android/paymentsheet/verticalmode/DefaultPaymentMethodVerticalLayoutInteractor;-><init>(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;ZZLkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v16, v1

    check-cast v16, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor;

    return-object v16
.end method

.method private static final createInteractor$lambda$0(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lkotlin/Unit;
    .locals 0

    .line 193
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->setSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    .line 194
    invoke-direct {p0}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->invokeRowSelectionCallback()V

    .line 195
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final createInteractor$lambda$1(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    instance-of p0, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Confirming;

    return p0
.end method

.method private static final createInteractor$lambda$2(Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;)Z
    .locals 0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final createInteractor$lambda$3(ZZ)Z
    .locals 0

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final createInteractor$lambda$4(Lcom/stripe/android/paymentsheet/FormHelper;Ljava/lang/String;)Lcom/stripe/android/paymentsheet/FormHelper$FormType;
    .locals 1

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 217
    invoke-interface {p0, p1}, Lcom/stripe/android/paymentsheet/FormHelper;->formTypeForCode(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/FormHelper$FormType;

    move-result-object p0

    return-object p0
.end method

.method private static final createInteractor$lambda$5(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Lkotlin/Unit;
    .locals 2

    .line 221
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->sheetLauncher:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedSheetLauncher;

    if-eqz v0, :cond_1

    .line 223
    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->getCustomer()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Lcom/stripe/android/paymentsheet/state/CustomerState;

    .line 224
    iget-object p0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->getSelection()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    invoke-interface {p0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    .line 221
    invoke-interface {v0, p1, v1, p0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedSheetLauncher;->launchManage(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/state/CustomerState;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    goto :goto_0

    .line 223
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Required value was null."

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 226
    :cond_1
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final createInteractor$lambda$7(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Ljava/lang/String;)Lkotlin/Unit;
    .locals 4

    const-string v0, "code"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->sheetLauncher:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedSheetLauncher;

    if-eqz v0, :cond_4

    .line 231
    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->getPaymentMethods()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 317
    instance-of v2, v1, Ljava/util/Collection;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    .line 318
    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/model/PaymentMethod;

    .line 232
    iget-object v2, v2, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    if-eqz v2, :cond_2

    iget-object v2, v2, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v3, 0x1

    .line 234
    :cond_3
    :goto_1
    iget-object p0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->confirmationStateHolder:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;

    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;->getState()Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;

    move-result-object p0

    .line 228
    invoke-interface {v0, p2, p1, v3, p0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedSheetLauncher;->launchForm(Ljava/lang/String;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;ZLcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;)V

    .line 236
    :cond_4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final createInteractor$lambda$8(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Z)Lkotlin/Unit;
    .locals 0

    .line 246
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->setSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    .line 247
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final createInteractor$lambda$9(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lcom/stripe/android/paymentsheet/FormHelper;Ljava/lang/String;)Z
    .locals 2

    .line 253
    iget-object p0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->confirmationStateHolder:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;

    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;->getState()Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;->getConfiguration()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;->getFormSheetAction$paymentsheet_release()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$FormSheetAction;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 254
    :goto_0
    sget-object v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$FormSheetAction;->Confirm:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$FormSheetAction;

    const/4 v1, 0x1

    if-ne p0, v0, :cond_1

    if-eqz p2, :cond_1

    .line 257
    invoke-interface {p1, p2}, Lcom/stripe/android/paymentsheet/FormHelper;->formTypeForCode(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/FormHelper$FormType;

    move-result-object p0

    sget-object p1, Lcom/stripe/android/paymentsheet/FormHelper$FormType$UserInteractionRequired;->INSTANCE:Lcom/stripe/android/paymentsheet/FormHelper$FormType$UserInteractionRequired;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    return v1
.end method

.method private final createSavedPaymentMethodMutator(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/CustomerStateHolder;)Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;
    .locals 16

    move-object/from16 v0, p0

    .line 273
    new-instance v1, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;

    .line 274
    invoke-static/range {p2 .. p2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    .line 275
    iget-object v3, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    .line 277
    iget-object v5, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->workContext:Lkotlin/coroutines/CoroutineContext;

    .line 278
    iget-object v6, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->uiContext:Lkotlin/coroutines/CoroutineContext;

    .line 279
    iget-object v7, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->customerRepository:Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

    .line 280
    iget-object v4, v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    invoke-virtual {v4}, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->getSelection()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v8

    .line 281
    new-instance v4, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$createSavedPaymentMethodMutator$1;

    invoke-direct {v4, v0}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$createSavedPaymentMethodMutator$1;-><init>(Ljava/lang/Object;)V

    move-object v9, v4

    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 283
    new-instance v4, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$createSavedPaymentMethodMutator$2;

    const/4 v10, 0x0

    invoke-direct {v4, v10}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$createSavedPaymentMethodMutator$2;-><init>(Lkotlin/coroutines/Continuation;)V

    move-object v11, v4

    check-cast v11, Lkotlin/jvm/functions/Function1;

    new-instance v12, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda10;

    invoke-direct {v12}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda10;-><init>()V

    .line 285
    new-instance v13, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda1;

    move-object/from16 v4, p2

    move-object/from16 v10, p3

    invoke-direct {v13, v0, v4, v10}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/CustomerStateHolder;)V

    .line 292
    invoke-virtual {v4}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getLinkState()Lcom/stripe/android/paymentsheet/state/LinkState;

    move-result-object v4

    if-eqz v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v4}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v14

    const/4 v15, 0x0

    move-object/from16 v4, p1

    .line 273
    invoke-direct/range {v1 .. v15}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;-><init>(Lkotlinx/coroutines/flow/StateFlow;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/CustomerStateHolder;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function5;Lkotlinx/coroutines/flow/StateFlow;Z)V

    return-object v1
.end method

.method private static final createSavedPaymentMethodMutator$lambda$10()Lkotlin/Unit;
    .locals 1

    .line 284
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final createSavedPaymentMethodMutator$lambda$11(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/CustomerStateHolder;Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lkotlin/Unit;
    .locals 0

    const-string p4, "<unused var>"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p5, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p6, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p7, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 286
    iget-object p3, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->sheetLauncher:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedSheetLauncher;

    if-eqz p3, :cond_1

    .line 288
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->getCustomer()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    invoke-interface {p2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_0

    check-cast p2, Lcom/stripe/android/paymentsheet/state/CustomerState;

    .line 289
    iget-object p0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->getSelection()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    invoke-interface {p0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    .line 286
    invoke-interface {p3, p1, p2, p0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedSheetLauncher;->launchManage(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/state/CustomerState;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    goto :goto_0

    .line 288
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Required value was null."

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 291
    :cond_1
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private final createWalletButtonsInteractor(Lkotlinx/coroutines/CoroutineScope;)Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;
    .locals 9

    .line 166
    sget-object v0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->Companion:Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion;

    .line 167
    iget-object v2, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->embeddedLinkHelper:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedLinkHelper;

    .line 168
    iget-object v3, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->confirmationStateHolder:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;

    .line 169
    iget-object v4, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->confirmationHandler:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;

    .line 171
    iget-object v6, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 172
    iget-object v7, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->linkPaymentLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

    .line 173
    iget-object v8, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    .line 174
    new-instance v1, Lcom/stripe/android/link/verification/NoOpLinkInlineInteractor;

    invoke-direct {v1}, Lcom/stripe/android/link/verification/NoOpLinkInlineInteractor;-><init>()V

    check-cast v1, Lcom/stripe/android/link/verification/LinkInlineInteractor;

    move-object v5, p1

    .line 166
    invoke-virtual/range {v0 .. v8}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion;->create(Lcom/stripe/android/link/verification/LinkInlineInteractor;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedLinkHelper;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/link/LinkPaymentLauncher;Lcom/stripe/android/link/account/LinkAccountHolder;)Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;

    move-result-object p1

    return-object p1
.end method

.method private final invokeRowSelectionCallback()V
    .locals 1

    .line 298
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->rowSelectionImmediateActionHandler:Lcom/stripe/android/paymentelement/embedded/EmbeddedRowSelectionImmediateActionHandler;

    invoke-interface {v0}, Lcom/stripe/android/paymentelement/embedded/EmbeddedRowSelectionImmediateActionHandler;->invoke()V

    return-void
.end method

.method private final setSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V
    .locals 1

    .line 302
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->set(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    return-void
.end method


# virtual methods
.method public clearEmbeddedContent()V
    .locals 3

    .line 152
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "STATE_KEY_EMBEDDED_CONTENT"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public clearSheetLauncher()V
    .locals 1

    const/4 v0, 0x0

    .line 160
    iput-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->sheetLauncher:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedSheetLauncher;

    return-void
.end method

.method public dataLoaded(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Z)V
    .locals 2

    const-string v0, "paymentMethodMetadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appearance"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onShowNewPaymentOptions()V

    .line 144
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    new-instance v1, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$State;

    invoke-direct {v1, p1, p2, p3}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$State;-><init>(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Z)V

    const-string p1, "STATE_KEY_EMBEDDED_CONTENT"

    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public getEmbeddedContent()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContent;",
            ">;"
        }
    .end annotation

    .line 93
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->embeddedContent:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getWalletButtonsContent()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;",
            ">;"
        }
    .end annotation

    .line 96
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->walletButtonsContent:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public setSheetLauncher(Lcom/stripe/android/paymentelement/embedded/content/EmbeddedSheetLauncher;)V
    .locals 1

    const-string v0, "sheetLauncher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->sheetLauncher:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedSheetLauncher;

    return-void
.end method
