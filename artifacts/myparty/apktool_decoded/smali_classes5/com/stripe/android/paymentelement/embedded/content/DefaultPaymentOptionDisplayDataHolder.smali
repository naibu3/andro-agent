.class public final Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;
.super Ljava/lang/Object;
.source "PaymentOptionDisplayDataHolder.kt"

# interfaces
.implements Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataHolder;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B3\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0011X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;",
        "Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataHolder;",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "selectionHolder",
        "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;",
        "confirmationStateSupplier",
        "Lkotlin/Function0;",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;",
        "paymentOptionDisplayDataFactory",
        "Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataFactory;",
        "<init>",
        "(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataFactory;)V",
        "_paymentOption",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;",
        "paymentOption",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getPaymentOption",
        "()Lkotlinx/coroutines/flow/StateFlow;",
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
.field private final _paymentOption:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;",
            ">;"
        }
    .end annotation
.end field

.field private final confirmationStateSupplier:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;",
            ">;"
        }
    .end annotation
.end field

.field private final coroutineScope:Lkotlinx/coroutines/CoroutineScope;

.field private final paymentOption:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentOptionDisplayDataFactory:Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataFactory;

.field private final selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataFactory;)V
    .locals 6
    .param p1    # Lkotlinx/coroutines/CoroutineScope;
        .annotation runtime Lcom/stripe/android/core/injection/ViewModelScope;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;",
            "Lkotlin/jvm/functions/Function0<",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;",
            ">;",
            "Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataFactory;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectionHolder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationStateSupplier"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentOptionDisplayDataFactory"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    .line 21
    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;->selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    .line 22
    iput-object p3, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;->confirmationStateSupplier:Lkotlin/jvm/functions/Function0;

    .line 23
    iput-object p4, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;->paymentOptionDisplayDataFactory:Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataFactory;

    const/4 p2, 0x0

    .line 25
    invoke-static {p2}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;->_paymentOption:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 26
    invoke-static {p3}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;->paymentOption:Lkotlinx/coroutines/flow/StateFlow;

    .line 29
    new-instance p3, Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder$1;

    invoke-direct {p3, p0, p2}, Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder$1;-><init>(Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;Lkotlin/coroutines/Continuation;)V

    move-object v3, p3

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public static final synthetic access$getConfirmationStateSupplier$p(Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;)Lkotlin/jvm/functions/Function0;
    .locals 0

    .line 18
    iget-object p0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;->confirmationStateSupplier:Lkotlin/jvm/functions/Function0;

    return-object p0
.end method

.method public static final synthetic access$getPaymentOptionDisplayDataFactory$p(Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;)Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataFactory;
    .locals 0

    .line 18
    iget-object p0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;->paymentOptionDisplayDataFactory:Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataFactory;

    return-object p0
.end method

.method public static final synthetic access$getSelectionHolder$p(Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;)Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;
    .locals 0

    .line 18
    iget-object p0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;->selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    return-object p0
.end method

.method public static final synthetic access$get_paymentOption$p(Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 18
    iget-object p0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;->_paymentOption:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method


# virtual methods
.method public getPaymentOption()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;",
            ">;"
        }
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;->paymentOption:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method
