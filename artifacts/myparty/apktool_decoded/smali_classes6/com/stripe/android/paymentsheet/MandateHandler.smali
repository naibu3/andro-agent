.class public final Lcom/stripe/android/paymentsheet/MandateHandler;
.super Ljava/lang/Object;
.source "MandateHandler.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/MandateHandler$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\nR\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/MandateHandler;",
        "",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "selection",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "merchantDisplayName",
        "",
        "isVerticalMode",
        "",
        "isSetupFlowProvider",
        "Lkotlin/Function0;",
        "<init>",
        "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/StateFlow;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V",
        "_mandateText",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/stripe/android/paymentsheet/model/MandateText;",
        "mandateText",
        "getMandateText",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "updateMandateText",
        "",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "showAbove",
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

.field public static final Companion:Lcom/stripe/android/paymentsheet/MandateHandler$Companion;


# instance fields
.field private final _mandateText:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/paymentsheet/model/MandateText;",
            ">;"
        }
    .end annotation
.end field

.field private final isSetupFlowProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final isVerticalMode:Z

.field private final mandateText:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/model/MandateText;",
            ">;"
        }
    .end annotation
.end field

.field private final merchantDisplayName:Ljava/lang/String;

.field private final selection:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/MandateHandler$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/MandateHandler$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/MandateHandler;->Companion:Lcom/stripe/android/paymentsheet/MandateHandler$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentsheet/MandateHandler;->$stable:I

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/StateFlow;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ">;",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "merchantDisplayName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isSetupFlowProvider"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/MandateHandler;->selection:Lkotlinx/coroutines/flow/StateFlow;

    .line 18
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/MandateHandler;->merchantDisplayName:Ljava/lang/String;

    .line 19
    iput-boolean p4, p0, Lcom/stripe/android/paymentsheet/MandateHandler;->isVerticalMode:Z

    .line 20
    iput-object p5, p0, Lcom/stripe/android/paymentsheet/MandateHandler;->isSetupFlowProvider:Lkotlin/jvm/functions/Function0;

    const/4 p2, 0x0

    .line 22
    invoke-static {p2}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/MandateHandler;->_mandateText:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 23
    check-cast p3, Lkotlinx/coroutines/flow/StateFlow;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/MandateHandler;->mandateText:Lkotlinx/coroutines/flow/StateFlow;

    .line 26
    new-instance p3, Lcom/stripe/android/paymentsheet/MandateHandler$1;

    invoke-direct {p3, p0, p2}, Lcom/stripe/android/paymentsheet/MandateHandler$1;-><init>(Lcom/stripe/android/paymentsheet/MandateHandler;Lkotlin/coroutines/Continuation;)V

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

.method public static final synthetic access$getMerchantDisplayName$p(Lcom/stripe/android/paymentsheet/MandateHandler;)Ljava/lang/String;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/MandateHandler;->merchantDisplayName:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getSelection$p(Lcom/stripe/android/paymentsheet/MandateHandler;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/MandateHandler;->selection:Lkotlinx/coroutines/flow/StateFlow;

    return-object p0
.end method

.method public static final synthetic access$isSetupFlowProvider$p(Lcom/stripe/android/paymentsheet/MandateHandler;)Lkotlin/jvm/functions/Function0;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/MandateHandler;->isSetupFlowProvider:Lkotlin/jvm/functions/Function0;

    return-object p0
.end method


# virtual methods
.method public final getMandateText()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/model/MandateText;",
            ">;"
        }
    .end annotation

    .line 23
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/MandateHandler;->mandateText:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final updateMandateText(Lcom/stripe/android/core/strings/ResolvableString;Z)V
    .locals 2

    .line 40
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/MandateHandler;->_mandateText:Lkotlinx/coroutines/flow/MutableStateFlow;

    if-eqz p1, :cond_2

    .line 41
    new-instance v1, Lcom/stripe/android/paymentsheet/model/MandateText;

    if-nez p2, :cond_1

    .line 43
    iget-boolean p2, p0, Lcom/stripe/android/paymentsheet/MandateHandler;->isVerticalMode:Z

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p2, 0x1

    .line 41
    :goto_1
    invoke-direct {v1, p1, p2}, Lcom/stripe/android/paymentsheet/model/MandateText;-><init>(Lcom/stripe/android/core/strings/ResolvableString;Z)V

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    .line 40
    :goto_2
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method
