.class public final Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;
.super Ljava/lang/Object;
.source "PrimaryButtonUiStateMapper.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPrimaryButtonUiStateMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimaryButtonUiStateMapper.kt\ncom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\t\u0008\u0001\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007\u0012\u000e\u0010\u000c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0007\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0007\u0012\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0007J\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0007J \u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00082\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;",
        "",
        "config",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
        "isProcessingPayment",
        "",
        "currentScreenFlow",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;",
        "buttonsEnabledFlow",
        "amountFlow",
        "Lcom/stripe/android/ui/core/Amount;",
        "selectionFlow",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "customPrimaryButtonUiStateFlow",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
        "cvcCompleteFlow",
        "onClick",
        "Lkotlin/Function0;",
        "",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function0;)V",
        "forCompleteFlow",
        "forCustomFlow",
        "cvcRecollectionCompleteOrNotRequired",
        "screen",
        "complete",
        "selection",
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
.field private final amountFlow:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/ui/core/Amount;",
            ">;"
        }
    .end annotation
.end field

.field private final buttonsEnabledFlow:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

.field private final currentScreenFlow:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;",
            ">;"
        }
    .end annotation
.end field

.field private final customPrimaryButtonUiStateFlow:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
            ">;"
        }
    .end annotation
.end field

.field private final cvcCompleteFlow:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final isProcessingPayment:Z

.field private final onClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final selectionFlow:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$-VXD5KXv7GQLs2gTip3DfM3bGWc(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lcom/stripe/android/ui/core/Amount;Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;ZLcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;ZLcom/stripe/android/paymentsheet/navigation/BuyButtonState;)Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;
    .locals 0

    invoke-static/range {p0 .. p7}, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->forCompleteFlow$lambda$2$lambda$1(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lcom/stripe/android/ui/core/Amount;Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;ZLcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;ZLcom/stripe/android/paymentsheet/navigation/BuyButtonState;)Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$3YqyQvVShleh5TgKml3N-7lMK_8(Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;ZLcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;)Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->forCustomFlow$lambda$5(Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;ZLcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;)Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$dIg1q-IbUvIteS7REDCQRhzBgMw(Lkotlinx/coroutines/flow/StateFlow;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->forCompleteFlow$lambda$3(Lkotlinx/coroutines/flow/StateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$vkBFPlK7zd8fzJmrs7c1GPA8xg4(Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;ZLcom/stripe/android/ui/core/Amount;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Z)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->forCompleteFlow$lambda$2(Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;ZLcom/stripe/android/ui/core/Amount;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Z)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
            "Z",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+",
            "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;",
            ">;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/ui/core/Amount;",
            ">;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ">;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
            ">;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentScreenFlow"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttonsEnabledFlow"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "amountFlow"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectionFlow"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customPrimaryButtonUiStateFlow"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cvcCompleteFlow"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    .line 19
    iput-boolean p2, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->isProcessingPayment:Z

    .line 20
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->currentScreenFlow:Lkotlinx/coroutines/flow/StateFlow;

    .line 21
    iput-object p4, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->buttonsEnabledFlow:Lkotlinx/coroutines/flow/StateFlow;

    .line 22
    iput-object p5, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->amountFlow:Lkotlinx/coroutines/flow/StateFlow;

    .line 23
    iput-object p6, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->selectionFlow:Lkotlinx/coroutines/flow/StateFlow;

    .line 24
    iput-object p7, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->customPrimaryButtonUiStateFlow:Lkotlinx/coroutines/flow/StateFlow;

    .line 25
    iput-object p8, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->cvcCompleteFlow:Lkotlinx/coroutines/flow/StateFlow;

    .line 26
    iput-object p9, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->onClick:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method private final cvcRecollectionCompleteOrNotRequired(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;ZLcom/stripe/android/paymentsheet/model/PaymentSelection;)Z
    .locals 2

    .line 87
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    .line 88
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods;->getCvcRecollectionState()Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods$CvcRecollectionState;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v1

    :goto_1
    instance-of p1, p1, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods$CvcRecollectionState$Required;

    if-eqz p1, :cond_4

    .line 89
    instance-of p1, p3, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    if-eqz p1, :cond_2

    check-cast p3, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    goto :goto_2

    :cond_2
    move-object p3, v1

    :goto_2
    if-eqz p3, :cond_3

    .line 90
    invoke-virtual {p3}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 89
    iget-object v1, p1, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 90
    :cond_3
    sget-object p1, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    if-ne v1, p1, :cond_4

    return p2

    :cond_4
    const/4 p1, 0x1

    return p1
.end method

.method private static final forCompleteFlow$lambda$2(Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;ZLcom/stripe/android/ui/core/Amount;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Z)Lkotlinx/coroutines/flow/StateFlow;
    .locals 9

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-interface {p1}, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;->getBuyButtonState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$$ExternalSyntheticLambda3;

    move-object v4, p0

    move-object v7, p1

    move v5, p2

    move-object v3, p3

    move-object v6, p4

    move-object v2, p5

    move v8, p6

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$$ExternalSyntheticLambda3;-><init>(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lcom/stripe/android/ui/core/Amount;Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;ZLcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;Z)V

    invoke-static {v0, v1}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    return-object p0
.end method

.method private static final forCompleteFlow$lambda$2$lambda$1(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lcom/stripe/android/ui/core/Amount;Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;ZLcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;ZLcom/stripe/android/paymentsheet/navigation/BuyButtonState;)Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;
    .locals 2

    const-string v0, "buyButtonState"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_5

    .line 39
    new-instance p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    .line 40
    invoke-virtual {p7}, Lcom/stripe/android/paymentsheet/navigation/BuyButtonState;->getBuyButtonOverride()Lcom/stripe/android/paymentsheet/navigation/BuyButtonState$BuyButtonOverride;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/navigation/BuyButtonState$BuyButtonOverride;->getLabel()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    if-nez v0, :cond_1

    .line 42
    :cond_0
    iget-object v0, p2, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getPrimaryButtonLabel()Ljava/lang/String;

    move-result-object v0

    .line 43
    iget-boolean v1, p2, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->isProcessingPayment:Z

    .line 40
    invoke-static {p1, v0, v1}, Lcom/stripe/android/paymentsheet/utils/PrimaryButtonUtilsKt;->buyButtonLabel(Lcom/stripe/android/ui/core/Amount;Ljava/lang/String;Z)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    .line 45
    :cond_1
    iget-object p1, p2, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->onClick:Lkotlin/jvm/functions/Function0;

    const/4 v1, 0x1

    if-eqz p3, :cond_2

    if-eqz p4, :cond_2

    .line 47
    invoke-direct {p2, p5, p6, p4}, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->cvcRecollectionCompleteOrNotRequired(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;ZLcom/stripe/android/paymentsheet/model/PaymentSelection;)Z

    move-result p2

    if-eqz p2, :cond_2

    move p2, v1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    .line 48
    :goto_0
    invoke-virtual {p7}, Lcom/stripe/android/paymentsheet/navigation/BuyButtonState;->getBuyButtonOverride()Lcom/stripe/android/paymentsheet/navigation/BuyButtonState$BuyButtonOverride;

    move-result-object p3

    if-eqz p3, :cond_3

    invoke-virtual {p3}, Lcom/stripe/android/paymentsheet/navigation/BuyButtonState$BuyButtonOverride;->getLockEnabled()Z

    move-result v1

    .line 39
    :cond_3
    invoke-direct {p0, v0, p1, p2, v1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;-><init>(Lcom/stripe/android/core/strings/ResolvableString;Lkotlin/jvm/functions/Function0;ZZ)V

    .line 49
    invoke-virtual {p7}, Lcom/stripe/android/paymentsheet/navigation/BuyButtonState;->getVisible()Z

    move-result p1

    if-eqz p1, :cond_4

    return-object p0

    :cond_4
    const/4 p0, 0x0

    :cond_5
    return-object p0
.end method

.method private static final forCompleteFlow$lambda$3(Lkotlinx/coroutines/flow/StateFlow;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final forCustomFlow$lambda$5(Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;ZLcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;)Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;
    .locals 3

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p4, :cond_3

    .line 61
    new-instance p4, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    .line 62
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getPrimaryButtonLabel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/utils/PrimaryButtonUtilsKt;->continueButtonLabel(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    .line 63
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->onClick:Lkotlin/jvm/functions/Function0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    move p2, v1

    goto :goto_0

    :cond_0
    move p2, v2

    .line 61
    :goto_0
    invoke-direct {p4, v0, p0, p2, v2}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;-><init>(Lcom/stripe/android/core/strings/ResolvableString;Lkotlin/jvm/functions/Function0;ZZ)V

    if-eqz p3, :cond_1

    .line 75
    invoke-virtual {p3}, Lcom/stripe/android/paymentsheet/model/PaymentSelection;->getRequiresConfirmation()Z

    move-result p0

    if-ne p0, v1, :cond_1

    invoke-interface {p1}, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;->getShowsPaymentConfirmationMandates()Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    .line 76
    :goto_1
    invoke-interface {p1}, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;->getShowsContinueButton()Z

    move-result p0

    if-nez p0, :cond_3

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    const/4 p0, 0x0

    return-object p0

    :cond_3
    :goto_2
    return-object p4
.end method


# virtual methods
.method public final forCompleteFlow()Lkotlinx/coroutines/flow/StateFlow;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
            ">;"
        }
    .end annotation

    .line 31
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->currentScreenFlow:Lkotlinx/coroutines/flow/StateFlow;

    .line 32
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->buttonsEnabledFlow:Lkotlinx/coroutines/flow/StateFlow;

    .line 33
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->amountFlow:Lkotlinx/coroutines/flow/StateFlow;

    .line 34
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->selectionFlow:Lkotlinx/coroutines/flow/StateFlow;

    .line 35
    iget-object v4, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->customPrimaryButtonUiStateFlow:Lkotlinx/coroutines/flow/StateFlow;

    .line 36
    iget-object v5, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->cvcCompleteFlow:Lkotlinx/coroutines/flow/StateFlow;

    .line 30
    new-instance v6, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$$ExternalSyntheticLambda1;

    invoke-direct {v6, p0}, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;)V

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function6;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$$ExternalSyntheticLambda2;

    invoke-direct {v1}, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$$ExternalSyntheticLambda2;-><init>()V

    .line 51
    invoke-static {v0, v1}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->flatMapLatestAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    return-object v0
.end method

.method public final forCustomFlow()Lkotlinx/coroutines/flow/StateFlow;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
            ">;"
        }
    .end annotation

    .line 56
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->currentScreenFlow:Lkotlinx/coroutines/flow/StateFlow;

    .line 57
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->buttonsEnabledFlow:Lkotlinx/coroutines/flow/StateFlow;

    .line 58
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->selectionFlow:Lkotlinx/coroutines/flow/StateFlow;

    .line 59
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->customPrimaryButtonUiStateFlow:Lkotlinx/coroutines/flow/StateFlow;

    .line 55
    new-instance v4, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$$ExternalSyntheticLambda0;

    invoke-direct {v4, p0}, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;)V

    invoke-static {v0, v1, v2, v3, v4}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    return-object v0
.end method
