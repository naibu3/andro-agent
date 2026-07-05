.class public final Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;
.super Ljava/lang/Object;
.source "PaymentOptionsItemsMapper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001Bw\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0003\u0012\u001a\u0010\n\u001a\u0016\u0012\u000c\u0012\n\u0018\u00010\u000cj\u0004\u0018\u0001`\r\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0008\u0012\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0011\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00160\u00150\u0003H\u0086\u0002J?\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00152\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0007\u001a\u00020\u00082\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0002\u0010\u001bR\u0016\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\u000c\u0012\n\u0018\u00010\u000cj\u0004\u0018\u0001`\r\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;",
        "",
        "customerMetadata",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;",
        "customerState",
        "Lcom/stripe/android/paymentsheet/state/CustomerState;",
        "isGooglePayReady",
        "",
        "isLinkEnabled",
        "nameProvider",
        "Lkotlin/Function1;",
        "",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "isNotPaymentFlow",
        "isCbcEligible",
        "Lkotlin/Function0;",
        "<init>",
        "(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;)V",
        "invoke",
        "",
        "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
        "createPaymentOptionsItems",
        "paymentMethods",
        "Lcom/stripe/android/model/PaymentMethod;",
        "defaultPaymentMethodId",
        "(Ljava/util/List;Ljava/lang/Boolean;ZLjava/lang/String;)Ljava/util/List;",
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
.field private final customerMetadata:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;",
            ">;"
        }
    .end annotation
.end field

.field private final customerState:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/state/CustomerState;",
            ">;"
        }
    .end annotation
.end field

.field private final isCbcEligible:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final isGooglePayReady:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final isLinkEnabled:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final isNotPaymentFlow:Z

.field private final nameProvider:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$jmaoj2q3ygvhG3wP_xgz5_OeVb8(Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;Lcom/stripe/android/paymentsheet/state/CustomerState;Ljava/lang/Boolean;ZLcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;->invoke$lambda$0(Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;Lcom/stripe/android/paymentsheet/state/CustomerState;Ljava/lang/Boolean;ZLcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;",
            ">;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/state/CustomerState;",
            ">;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "+",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;Z",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const-string v0, "customerMetadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isGooglePayReady"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isLinkEnabled"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameProvider"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isCbcEligible"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;->customerMetadata:Lkotlinx/coroutines/flow/StateFlow;

    .line 15
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;->customerState:Lkotlinx/coroutines/flow/StateFlow;

    .line 16
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;->isGooglePayReady:Lkotlinx/coroutines/flow/StateFlow;

    .line 17
    iput-object p4, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;->isLinkEnabled:Lkotlinx/coroutines/flow/StateFlow;

    .line 18
    iput-object p5, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;->nameProvider:Lkotlin/jvm/functions/Function1;

    .line 19
    iput-boolean p6, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;->isNotPaymentFlow:Z

    .line 20
    iput-object p7, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;->isCbcEligible:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method private final createPaymentOptionsItems(Ljava/util/List;Ljava/lang/Boolean;ZLjava/lang/String;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;",
            "Ljava/lang/Boolean;",
            "Z",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
            ">;"
        }
    .end annotation

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 52
    :cond_0
    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;->INSTANCE:Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p3, :cond_1

    .line 54
    iget-boolean p3, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;->isNotPaymentFlow:Z

    if-eqz p3, :cond_1

    move p3, v2

    move v2, v1

    goto :goto_0

    :cond_1
    move p3, v2

    .line 55
    :goto_0
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_2

    iget-boolean p2, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;->isNotPaymentFlow:Z

    if-eqz p2, :cond_2

    move v3, v1

    goto :goto_1

    :cond_2
    move v3, p3

    .line 56
    :goto_1
    iget-object v4, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;->nameProvider:Lkotlin/jvm/functions/Function1;

    .line 57
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;->isCbcEligible:Lkotlin/jvm/functions/Function0;

    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    move-object v1, p1

    move-object v6, p4

    .line 52
    invoke-virtual/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;->createPaymentOptionsList(Ljava/util/List;ZZLkotlin/jvm/functions/Function1;ZLjava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private static final invoke$lambda$0(Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;Lcom/stripe/android/paymentsheet/state/CustomerState;Ljava/lang/Boolean;ZLcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;)Ljava/util/List;
    .locals 3

    if-eqz p1, :cond_0

    .line 31
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/CustomerState;->getPaymentMethods()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    :cond_1
    const/4 v1, 0x0

    if-eqz p4, :cond_2

    .line 34
    invoke-virtual {p4}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->isPaymentMethodSetAsDefaultEnabled()Z

    move-result p4

    const/4 v2, 0x1

    if-ne p4, v2, :cond_2

    if-eqz p1, :cond_2

    .line 35
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/CustomerState;->getDefaultPaymentMethodId()Ljava/lang/String;

    move-result-object v1

    .line 30
    :cond_2
    invoke-direct {p0, v0, p2, p3, v1}, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;->createPaymentOptionsItems(Ljava/util/List;Ljava/lang/Boolean;ZLjava/lang/String;)Ljava/util/List;

    move-result-object p0

    if-nez p0, :cond_3

    .line 39
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p0

    :cond_3
    return-object p0
.end method


# virtual methods
.method public final invoke()Lkotlinx/coroutines/flow/StateFlow;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
            ">;>;"
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;->customerState:Lkotlinx/coroutines/flow/StateFlow;

    .line 26
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;->isLinkEnabled:Lkotlinx/coroutines/flow/StateFlow;

    .line 27
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;->isGooglePayReady:Lkotlinx/coroutines/flow/StateFlow;

    .line 28
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;->customerMetadata:Lkotlinx/coroutines/flow/StateFlow;

    .line 24
    new-instance v4, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper$$ExternalSyntheticLambda0;

    invoke-direct {v4, p0}, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;)V

    invoke-static {v0, v1, v2, v3, v4}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    return-object v0
.end method
