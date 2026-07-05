.class public final Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;
.super Ljava/lang/Object;
.source "PaymentElementCallbacks.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001:\u00011B[\u0008\u0002\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000bj\u0004\u0018\u0001`\r\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000bj\u0004\u0018\u0001`\rH\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003Ji\u0010)\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0016\u0008\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000bj\u0004\u0018\u0001`\r2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00c2\u0001J\u0013\u0010*\u001a\u00020+2\u0008\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020.H\u00d6\u0001J\t\u0010/\u001a\u000200H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000bj\u0004\u0018\u0001`\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!\u00a8\u00062"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;",
        "",
        "createIntentCallback",
        "Lcom/stripe/android/paymentsheet/CreateIntentCallback;",
        "confirmCustomPaymentMethodCallback",
        "Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;",
        "externalPaymentMethodConfirmHandler",
        "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;",
        "analyticEventCallback",
        "Lcom/stripe/android/paymentelement/AnalyticEventCallback;",
        "rowSelectionCallback",
        "Lkotlin/Function0;",
        "",
        "Lcom/stripe/android/paymentelement/embedded/InternalRowSelectionCallback;",
        "shopPayHandlers",
        "Lcom/stripe/android/paymentsheet/ShopPayHandlers;",
        "preparePaymentMethodHandler",
        "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/CreateIntentCallback;Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;Lcom/stripe/android/paymentelement/AnalyticEventCallback;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/ShopPayHandlers;Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;)V",
        "getCreateIntentCallback",
        "()Lcom/stripe/android/paymentsheet/CreateIntentCallback;",
        "getConfirmCustomPaymentMethodCallback",
        "()Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;",
        "getExternalPaymentMethodConfirmHandler",
        "()Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;",
        "getAnalyticEventCallback",
        "()Lcom/stripe/android/paymentelement/AnalyticEventCallback;",
        "getRowSelectionCallback",
        "()Lkotlin/jvm/functions/Function0;",
        "getShopPayHandlers",
        "()Lcom/stripe/android/paymentsheet/ShopPayHandlers;",
        "getPreparePaymentMethodHandler",
        "()Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "Builder",
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


# instance fields
.field private final analyticEventCallback:Lcom/stripe/android/paymentelement/AnalyticEventCallback;

.field private final confirmCustomPaymentMethodCallback:Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;

.field private final createIntentCallback:Lcom/stripe/android/paymentsheet/CreateIntentCallback;

.field private final externalPaymentMethodConfirmHandler:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;

.field private final preparePaymentMethodHandler:Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;

.field private final rowSelectionCallback:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final shopPayHandlers:Lcom/stripe/android/paymentsheet/ShopPayHandlers;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lcom/stripe/android/paymentsheet/CreateIntentCallback;Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;Lcom/stripe/android/paymentelement/AnalyticEventCallback;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/ShopPayHandlers;Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/CreateIntentCallback;",
            "Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;",
            "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;",
            "Lcom/stripe/android/paymentelement/AnalyticEventCallback;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/paymentsheet/ShopPayHandlers;",
            "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;",
            ")V"
        }
    .end annotation

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->createIntentCallback:Lcom/stripe/android/paymentsheet/CreateIntentCallback;

    .line 25
    iput-object p2, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->confirmCustomPaymentMethodCallback:Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;

    .line 26
    iput-object p3, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->externalPaymentMethodConfirmHandler:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;

    .line 27
    iput-object p4, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->analyticEventCallback:Lcom/stripe/android/paymentelement/AnalyticEventCallback;

    .line 28
    iput-object p5, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->rowSelectionCallback:Lkotlin/jvm/functions/Function0;

    .line 29
    iput-object p6, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->shopPayHandlers:Lcom/stripe/android/paymentsheet/ShopPayHandlers;

    .line 30
    iput-object p7, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->preparePaymentMethodHandler:Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/CreateIntentCallback;Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;Lcom/stripe/android/paymentelement/AnalyticEventCallback;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/ShopPayHandlers;Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;-><init>(Lcom/stripe/android/paymentsheet/CreateIntentCallback;Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;Lcom/stripe/android/paymentelement/AnalyticEventCallback;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/ShopPayHandlers;Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;)V

    return-void
.end method

.method private final copy(Lcom/stripe/android/paymentsheet/CreateIntentCallback;Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;Lcom/stripe/android/paymentelement/AnalyticEventCallback;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/ShopPayHandlers;Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/CreateIntentCallback;",
            "Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;",
            "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;",
            "Lcom/stripe/android/paymentelement/AnalyticEventCallback;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/paymentsheet/ShopPayHandlers;",
            "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;",
            ")",
            "Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;-><init>(Lcom/stripe/android/paymentsheet/CreateIntentCallback;Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;Lcom/stripe/android/paymentelement/AnalyticEventCallback;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/ShopPayHandlers;Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;)V

    return-object v0
.end method

.method static synthetic copy$default(Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;Lcom/stripe/android/paymentsheet/CreateIntentCallback;Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;Lcom/stripe/android/paymentelement/AnalyticEventCallback;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/ShopPayHandlers;Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;ILjava/lang/Object;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->createIntentCallback:Lcom/stripe/android/paymentsheet/CreateIntentCallback;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->confirmCustomPaymentMethodCallback:Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->externalPaymentMethodConfirmHandler:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->analyticEventCallback:Lcom/stripe/android/paymentelement/AnalyticEventCallback;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->rowSelectionCallback:Lkotlin/jvm/functions/Function0;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->shopPayHandlers:Lcom/stripe/android/paymentsheet/ShopPayHandlers;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->preparePaymentMethodHandler:Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-direct/range {p2 .. p9}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->copy(Lcom/stripe/android/paymentsheet/CreateIntentCallback;Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;Lcom/stripe/android/paymentelement/AnalyticEventCallback;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/ShopPayHandlers;Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/paymentsheet/CreateIntentCallback;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->createIntentCallback:Lcom/stripe/android/paymentsheet/CreateIntentCallback;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->confirmCustomPaymentMethodCallback:Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->externalPaymentMethodConfirmHandler:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/paymentelement/AnalyticEventCallback;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->analyticEventCallback:Lcom/stripe/android/paymentelement/AnalyticEventCallback;

    return-object v0
.end method

.method public final component5()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->rowSelectionCallback:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final component6()Lcom/stripe/android/paymentsheet/ShopPayHandlers;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->shopPayHandlers:Lcom/stripe/android/paymentsheet/ShopPayHandlers;

    return-object v0
.end method

.method public final component7()Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->preparePaymentMethodHandler:Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->createIntentCallback:Lcom/stripe/android/paymentsheet/CreateIntentCallback;

    iget-object v3, p1, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->createIntentCallback:Lcom/stripe/android/paymentsheet/CreateIntentCallback;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->confirmCustomPaymentMethodCallback:Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;

    iget-object v3, p1, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->confirmCustomPaymentMethodCallback:Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->externalPaymentMethodConfirmHandler:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;

    iget-object v3, p1, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->externalPaymentMethodConfirmHandler:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->analyticEventCallback:Lcom/stripe/android/paymentelement/AnalyticEventCallback;

    iget-object v3, p1, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->analyticEventCallback:Lcom/stripe/android/paymentelement/AnalyticEventCallback;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->rowSelectionCallback:Lkotlin/jvm/functions/Function0;

    iget-object v3, p1, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->rowSelectionCallback:Lkotlin/jvm/functions/Function0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->shopPayHandlers:Lcom/stripe/android/paymentsheet/ShopPayHandlers;

    iget-object v3, p1, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->shopPayHandlers:Lcom/stripe/android/paymentsheet/ShopPayHandlers;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->preparePaymentMethodHandler:Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;

    iget-object p1, p1, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->preparePaymentMethodHandler:Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAnalyticEventCallback()Lcom/stripe/android/paymentelement/AnalyticEventCallback;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->analyticEventCallback:Lcom/stripe/android/paymentelement/AnalyticEventCallback;

    return-object v0
.end method

.method public final getConfirmCustomPaymentMethodCallback()Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->confirmCustomPaymentMethodCallback:Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;

    return-object v0
.end method

.method public final getCreateIntentCallback()Lcom/stripe/android/paymentsheet/CreateIntentCallback;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->createIntentCallback:Lcom/stripe/android/paymentsheet/CreateIntentCallback;

    return-object v0
.end method

.method public final getExternalPaymentMethodConfirmHandler()Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->externalPaymentMethodConfirmHandler:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;

    return-object v0
.end method

.method public final getPreparePaymentMethodHandler()Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->preparePaymentMethodHandler:Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;

    return-object v0
.end method

.method public final getRowSelectionCallback()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 28
    iget-object v0, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->rowSelectionCallback:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final getShopPayHandlers()Lcom/stripe/android/paymentsheet/ShopPayHandlers;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->shopPayHandlers:Lcom/stripe/android/paymentsheet/ShopPayHandlers;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->createIntentCallback:Lcom/stripe/android/paymentsheet/CreateIntentCallback;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->confirmCustomPaymentMethodCallback:Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->externalPaymentMethodConfirmHandler:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->analyticEventCallback:Lcom/stripe/android/paymentelement/AnalyticEventCallback;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->rowSelectionCallback:Lkotlin/jvm/functions/Function0;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->shopPayHandlers:Lcom/stripe/android/paymentsheet/ShopPayHandlers;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/ShopPayHandlers;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->preparePaymentMethodHandler:Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;

    if-nez v2, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->createIntentCallback:Lcom/stripe/android/paymentsheet/CreateIntentCallback;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->confirmCustomPaymentMethodCallback:Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;

    iget-object v2, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->externalPaymentMethodConfirmHandler:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;

    iget-object v3, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->analyticEventCallback:Lcom/stripe/android/paymentelement/AnalyticEventCallback;

    iget-object v4, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->rowSelectionCallback:Lkotlin/jvm/functions/Function0;

    iget-object v5, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->shopPayHandlers:Lcom/stripe/android/paymentsheet/ShopPayHandlers;

    iget-object v6, p0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->preparePaymentMethodHandler:Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "PaymentElementCallbacks(createIntentCallback="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v7, ", confirmCustomPaymentMethodCallback="

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", externalPaymentMethodConfirmHandler="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", analyticEventCallback="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", rowSelectionCallback="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shopPayHandlers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", preparePaymentMethodHandler="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
