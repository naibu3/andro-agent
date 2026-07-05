.class public final Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;
.super Ljava/lang/Object;
.source "DefaultEmbeddedSheetLauncher.kt"

# interfaces
.implements Lcom/stripe/android/paymentelement/embedded/content/EmbeddedSheetLauncher;


# annotations
.annotation runtime Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementScope;
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDefaultEmbeddedSheetLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultEmbeddedSheetLauncher.kt\ncom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n1#2:150\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B_\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\u0008\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J*\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0008\u0010%\u001a\u0004\u0018\u00010&H\u0016J\"\u0010\'\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010(\u001a\u00020)2\u0008\u0010*\u001a\u0004\u0018\u00010+H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0018R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedSheetLauncher;",
        "activityResultCaller",
        "Landroidx/activity/result/ActivityResultCaller;",
        "lifecycleOwner",
        "Landroidx/lifecycle/LifecycleOwner;",
        "selectionHolder",
        "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;",
        "rowSelectionImmediateActionHandler",
        "Lcom/stripe/android/paymentelement/embedded/EmbeddedRowSelectionImmediateActionHandler;",
        "customerStateHolder",
        "Lcom/stripe/android/paymentsheet/CustomerStateHolder;",
        "sheetStateHolder",
        "Lcom/stripe/android/paymentelement/embedded/content/SheetStateHolder;",
        "errorReporter",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "statusBarColor",
        "",
        "paymentElementCallbackIdentifier",
        "",
        "embeddedResultCallbackHelper",
        "Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;",
        "<init>",
        "(Landroidx/activity/result/ActivityResultCaller;Landroidx/lifecycle/LifecycleOwner;Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;Lcom/stripe/android/paymentelement/embedded/EmbeddedRowSelectionImmediateActionHandler;Lcom/stripe/android/paymentsheet/CustomerStateHolder;Lcom/stripe/android/paymentelement/embedded/content/SheetStateHolder;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Ljava/lang/Integer;Ljava/lang/String;Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;)V",
        "Ljava/lang/Integer;",
        "formActivityLauncher",
        "Landroidx/activity/result/ActivityResultLauncher;",
        "Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;",
        "manageActivityLauncher",
        "Lcom/stripe/android/paymentelement/embedded/manage/ManageContract$Args;",
        "launchForm",
        "",
        "code",
        "paymentMethodMetadata",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
        "hasSavedPaymentMethods",
        "",
        "embeddedConfirmationState",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;",
        "launchManage",
        "customerState",
        "Lcom/stripe/android/paymentsheet/state/CustomerState;",
        "selection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
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
.field private final customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

.field private final errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

.field private final formActivityLauncher:Landroidx/activity/result/ActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;",
            ">;"
        }
    .end annotation
.end field

.field private final manageActivityLauncher:Landroidx/activity/result/ActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageContract$Args;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentElementCallbackIdentifier:Ljava/lang/String;

.field private final rowSelectionImmediateActionHandler:Lcom/stripe/android/paymentelement/embedded/EmbeddedRowSelectionImmediateActionHandler;

.field private final selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

.field private final sheetStateHolder:Lcom/stripe/android/paymentelement/embedded/content/SheetStateHolder;

.field private final statusBarColor:Ljava/lang/Integer;


# direct methods
.method public static synthetic $r8$lambda$-FRl6aQ1pIo9LNQRPZxq_syka1w(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;Lcom/stripe/android/paymentelement/embedded/manage/ManageResult;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->manageActivityLauncher$lambda$2(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;Lcom/stripe/android/paymentelement/embedded/manage/ManageResult;)V

    return-void
.end method

.method public static synthetic $r8$lambda$pXIVVjTLZbbtaQI-SYu0MO8KROo(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;Lcom/stripe/android/paymentelement/embedded/form/FormResult;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->formActivityLauncher$lambda$1(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;Lcom/stripe/android/paymentelement/embedded/form/FormResult;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/activity/result/ActivityResultCaller;Landroidx/lifecycle/LifecycleOwner;Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;Lcom/stripe/android/paymentelement/embedded/EmbeddedRowSelectionImmediateActionHandler;Lcom/stripe/android/paymentsheet/CustomerStateHolder;Lcom/stripe/android/paymentelement/embedded/content/SheetStateHolder;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Ljava/lang/Integer;Ljava/lang/String;Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;)V
    .locals 1
    .param p8    # Ljava/lang/Integer;
        .annotation runtime Ljavax/inject/Named;
            value = "STATUS_BAR_COLOR"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackIdentifier;
        .end annotation
    .end param
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectionHolder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rowSelectionImmediateActionHandler"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerStateHolder"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sheetStateHolder"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentElementCallbackIdentifier"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "embeddedResultCallbackHelper"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p3, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    .line 46
    iput-object p4, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->rowSelectionImmediateActionHandler:Lcom/stripe/android/paymentelement/embedded/EmbeddedRowSelectionImmediateActionHandler;

    .line 47
    iput-object p5, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    .line 48
    iput-object p6, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->sheetStateHolder:Lcom/stripe/android/paymentelement/embedded/content/SheetStateHolder;

    .line 49
    iput-object p7, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 50
    iput-object p8, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->statusBarColor:Ljava/lang/Integer;

    .line 51
    iput-object p9, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->paymentElementCallbackIdentifier:Ljava/lang/String;

    .line 56
    invoke-interface {p2}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object p2

    .line 57
    new-instance p3, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher$1;

    invoke-direct {p3, p0}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher$1;-><init>(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;)V

    check-cast p3, Landroidx/lifecycle/LifecycleObserver;

    .line 56
    invoke-virtual {p2, p3}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    .line 68
    sget-object p2, Lcom/stripe/android/paymentelement/embedded/form/FormContract;->INSTANCE:Lcom/stripe/android/paymentelement/embedded/form/FormContract;

    check-cast p2, Landroidx/activity/result/contract/ActivityResultContract;

    new-instance p3, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher$$ExternalSyntheticLambda0;

    invoke-direct {p3, p0, p10}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;)V

    invoke-interface {p1, p2, p3}, Landroidx/activity/result/ActivityResultCaller;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->formActivityLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 88
    sget-object p2, Lcom/stripe/android/paymentelement/embedded/manage/ManageContract;->INSTANCE:Lcom/stripe/android/paymentelement/embedded/manage/ManageContract;

    check-cast p2, Landroidx/activity/result/contract/ActivityResultContract;

    new-instance p3, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher$$ExternalSyntheticLambda1;

    invoke-direct {p3, p0}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;)V

    invoke-interface {p1, p2, p3}, Landroidx/activity/result/ActivityResultCaller;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->manageActivityLauncher:Landroidx/activity/result/ActivityResultLauncher;

    return-void
.end method

.method public static final synthetic access$getFormActivityLauncher$p(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;)Landroidx/activity/result/ActivityResultLauncher;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->formActivityLauncher:Landroidx/activity/result/ActivityResultLauncher;

    return-object p0
.end method

.method public static final synthetic access$getManageActivityLauncher$p(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;)Landroidx/activity/result/ActivityResultLauncher;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->manageActivityLauncher:Landroidx/activity/result/ActivityResultLauncher;

    return-object p0
.end method

.method private static final formActivityLauncher$lambda$1(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;Lcom/stripe/android/paymentelement/embedded/form/FormResult;)V
    .locals 2

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->sheetStateHolder:Lcom/stripe/android/paymentelement/embedded/content/SheetStateHolder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/stripe/android/paymentelement/embedded/content/SheetStateHolder;->setSheetIsOpen(Z)V

    .line 70
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->setTemporary(Ljava/lang/String;)V

    .line 71
    instance-of v0, p2, Lcom/stripe/android/paymentelement/embedded/form/FormResult$Complete;

    if-eqz v0, :cond_1

    .line 72
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    check-cast p2, Lcom/stripe/android/paymentelement/embedded/form/FormResult$Complete;

    invoke-virtual {p2}, Lcom/stripe/android/paymentelement/embedded/form/FormResult$Complete;->getSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->set(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    .line 73
    invoke-virtual {p2}, Lcom/stripe/android/paymentelement/embedded/form/FormResult$Complete;->getHasBeenConfirmed()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 75
    new-instance p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result$Completed;

    invoke-direct {p0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result$Completed;-><init>()V

    check-cast p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;

    .line 74
    invoke-interface {p1, p0}, Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;->setResult(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;)V

    return-void

    .line 78
    :cond_0
    invoke-virtual {p2}, Lcom/stripe/android/paymentelement/embedded/form/FormResult$Complete;->getSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->rowSelectionImmediateActionHandler:Lcom/stripe/android/paymentelement/embedded/EmbeddedRowSelectionImmediateActionHandler;

    invoke-interface {p0}, Lcom/stripe/android/paymentelement/embedded/EmbeddedRowSelectionImmediateActionHandler;->invoke()V

    return-void

    .line 80
    :cond_1
    instance-of p0, p2, Lcom/stripe/android/paymentelement/embedded/form/FormResult$Cancelled;

    if-eqz p0, :cond_2

    .line 82
    new-instance p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result$Canceled;

    invoke-direct {p0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result$Canceled;-><init>()V

    check-cast p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;

    .line 81
    invoke-interface {p1, p0}, Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;->setResult(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;)V

    :cond_2
    return-void
.end method

.method private static final manageActivityLauncher$lambda$2(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;Lcom/stripe/android/paymentelement/embedded/manage/ManageResult;)V
    .locals 2

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->sheetStateHolder:Lcom/stripe/android/paymentelement/embedded/content/SheetStateHolder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/stripe/android/paymentelement/embedded/content/SheetStateHolder;->setSheetIsOpen(Z)V

    .line 91
    instance-of v0, p1, Lcom/stripe/android/paymentelement/embedded/manage/ManageResult$Error;

    if-nez v0, :cond_1

    .line 92
    instance-of v0, p1, Lcom/stripe/android/paymentelement/embedded/manage/ManageResult$Complete;

    if-eqz v0, :cond_0

    .line 93
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    check-cast p1, Lcom/stripe/android/paymentelement/embedded/manage/ManageResult$Complete;

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageResult$Complete;->getCustomerState()Lcom/stripe/android/paymentsheet/state/CustomerState;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->setCustomerState(Lcom/stripe/android/paymentsheet/state/CustomerState;)V

    .line 94
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageResult$Complete;->getSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->set(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    .line 95
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageResult$Complete;->getShouldInvokeSelectionCallback()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageResult$Complete;->getSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object p1

    instance-of p1, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    if-eqz p1, :cond_1

    .line 96
    iget-object p0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->rowSelectionImmediateActionHandler:Lcom/stripe/android/paymentelement/embedded/EmbeddedRowSelectionImmediateActionHandler;

    invoke-interface {p0}, Lcom/stripe/android/paymentelement/embedded/EmbeddedRowSelectionImmediateActionHandler;->invoke()V

    return-void

    .line 90
    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    return-void
.end method


# virtual methods
.method public launchForm(Ljava/lang/String;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;ZLcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;)V
    .locals 9

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodMetadata"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p4, :cond_0

    .line 109
    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 110
    sget-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->EMBEDDED_SHEET_LAUNCHER_EMBEDDED_STATE_IS_NULL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 109
    invoke-static/range {v1 .. v6}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    .line 114
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->sheetStateHolder:Lcom/stripe/android/paymentelement/embedded/content/SheetStateHolder;

    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/embedded/content/SheetStateHolder;->getSheetIsOpen()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 115
    :cond_1
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->sheetStateHolder:Lcom/stripe/android/paymentelement/embedded/content/SheetStateHolder;

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lcom/stripe/android/paymentelement/embedded/content/SheetStateHolder;->setSheetIsOpen(Z)V

    .line 116
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->setTemporary(Ljava/lang/String;)V

    .line 117
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->getSelection()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    check-cast v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    goto :goto_0

    :cond_2
    move-object v0, v4

    :goto_0
    if-eqz v0, :cond_3

    .line 118
    move-object v3, v0

    check-cast v3, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    invoke-static {v3}, Lcom/stripe/android/paymentsheet/model/PaymentSelectionKt;->getPaymentMethodType(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_3
    move-object v3, v4

    :goto_1
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    move-object v4, v0

    :cond_4
    if-nez v4, :cond_5

    .line 119
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->getPreviousNewSelection(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    move-result-object v4

    .line 120
    :cond_5
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;

    move-object v3, v4

    .line 124
    invoke-virtual {p4}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;->getConfiguration()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;

    move-result-object v4

    .line 125
    invoke-virtual {p4}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;->getInitializationMode()Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    move-result-object v5

    .line 126
    iget-object v6, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->paymentElementCallbackIdentifier:Ljava/lang/String;

    .line 127
    iget-object v7, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->statusBarColor:Ljava/lang/Integer;

    .line 128
    move-object v8, v3

    check-cast v8, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    .line 120
    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;-><init>(Ljava/lang/String;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;ZLcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Ljava/lang/String;Ljava/lang/Integer;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    .line 130
    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->formActivityLauncher:Landroidx/activity/result/ActivityResultLauncher;

    invoke-virtual {v1, v0}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    return-void
.end method

.method public launchManage(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/state/CustomerState;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V
    .locals 2

    const-string v0, "paymentMethodMetadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->sheetStateHolder:Lcom/stripe/android/paymentelement/embedded/content/SheetStateHolder;

    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/embedded/content/SheetStateHolder;->getSheetIsOpen()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 139
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->sheetStateHolder:Lcom/stripe/android/paymentelement/embedded/content/SheetStateHolder;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/stripe/android/paymentelement/embedded/content/SheetStateHolder;->setSheetIsOpen(Z)V

    .line 140
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageContract$Args;

    .line 144
    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->paymentElementCallbackIdentifier:Ljava/lang/String;

    .line 140
    invoke-direct {v0, p1, p2, p3, v1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageContract$Args;-><init>(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/state/CustomerState;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;)V

    .line 146
    iget-object p1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;->manageActivityLauncher:Landroidx/activity/result/ActivityResultLauncher;

    invoke-virtual {p1, v0}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    return-void
.end method
