.class public final Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;
.super Ljava/lang/Object;
.source "AddPaymentMethodInteractor.kt"

# interfaces
.implements Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u0000 12\u00020\u0001:\u00011B\u0087\u0002\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0008\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u001c\u0010\u0012\u001a\u0018\u0012\u0008\u0012\u00060\u0003j\u0002`\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\r0\u0010\u0012\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0016\u0010\u0017\u001a\u0012\u0012\u0008\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00160\u0010\u0012\u001a\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\u0019\u0012\u0016\u0010\u001b\u001a\u0012\u0012\u0008\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00160\u0010\u0012\u0016\u0010\u001c\u001a\u0012\u0012\u0008\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u001d0\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020\t\u00a2\u0006\u0004\u0008!\u0010\"J\u0008\u0010,\u001a\u00020(H\u0002J\u0010\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020/H\u0016J\u0008\u00100\u001a\u00020\u0016H\u0016R\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0008\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u0018\u0012\u0008\u0012\u00060\u0003j\u0002`\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\r0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u0012\u0012\u0008\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00160\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u0012\u0012\u0008\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00160\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u0012\u0012\u0008\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u001d0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020\tX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010#R\u0014\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00030%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020(0%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u0008\u0012\u0004\u0012\u00020(0\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+\u00a8\u00062"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;",
        "Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;",
        "initiallySelectedPaymentMethodType",
        "",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "selection",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "processing",
        "",
        "incentive",
        "Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;",
        "supportedPaymentMethods",
        "",
        "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;",
        "createFormArguments",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
        "formElementsForCode",
        "Lcom/stripe/android/uicore/elements/FormElement;",
        "clearErrorMessages",
        "Lkotlin/Function0;",
        "",
        "reportFieldInteraction",
        "onFormFieldValuesChanged",
        "Lkotlin/Function2;",
        "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
        "reportPaymentMethodTypeSelected",
        "createUSBankAccountFormArguments",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "isLiveMode",
        "<init>",
        "(Ljava/lang/String;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;Z)V",
        "()Z",
        "_selectedPaymentMethodCode",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "selectedPaymentMethodCode",
        "_state",
        "Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;",
        "state",
        "getState",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "getInitialState",
        "handleViewAction",
        "viewAction",
        "Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$ViewAction;",
        "close",
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

.field public static final Companion:Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$Companion;


# instance fields
.field private final _selectedPaymentMethodCode:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final _state:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;",
            ">;"
        }
    .end annotation
.end field

.field private final clearErrorMessages:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final coroutineScope:Lkotlinx/coroutines/CoroutineScope;

.field private final createFormArguments:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
            ">;"
        }
    .end annotation
.end field

.field private final createUSBankAccountFormArguments:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;",
            ">;"
        }
    .end annotation
.end field

.field private final formElementsForCode:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;>;"
        }
    .end annotation
.end field

.field private final incentive:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;",
            ">;"
        }
    .end annotation
.end field

.field private final initiallySelectedPaymentMethodType:Ljava/lang/String;

.field private final isLiveMode:Z

.field private final onFormFieldValuesChanged:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final processing:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final reportFieldInteraction:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final reportPaymentMethodTypeSelected:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final selectedPaymentMethodCode:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final selection:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ">;"
        }
    .end annotation
.end field

.field private final state:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;",
            ">;"
        }
    .end annotation
.end field

.field private final supportedPaymentMethods:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->Companion:Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->$stable:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ">;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;",
            ">;",
            "Ljava/util/List<",
            "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;>;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;",
            ">;",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Z)V"
        }
    .end annotation

    const-string v0, "initiallySelectedPaymentMethodType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "processing"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "incentive"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supportedPaymentMethods"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createFormArguments"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formElementsForCode"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clearErrorMessages"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reportFieldInteraction"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onFormFieldValuesChanged"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reportPaymentMethodTypeSelected"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createUSBankAccountFormArguments"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->initiallySelectedPaymentMethodType:Ljava/lang/String;

    .line 57
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->selection:Lkotlinx/coroutines/flow/StateFlow;

    .line 58
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->processing:Lkotlinx/coroutines/flow/StateFlow;

    .line 59
    iput-object p4, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->incentive:Lkotlinx/coroutines/flow/StateFlow;

    .line 60
    iput-object p5, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->supportedPaymentMethods:Ljava/util/List;

    .line 61
    iput-object p6, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->createFormArguments:Lkotlin/jvm/functions/Function1;

    .line 62
    iput-object p7, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->formElementsForCode:Lkotlin/jvm/functions/Function1;

    .line 63
    iput-object p8, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->clearErrorMessages:Lkotlin/jvm/functions/Function0;

    .line 64
    iput-object p9, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->reportFieldInteraction:Lkotlin/jvm/functions/Function1;

    .line 65
    iput-object p10, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->onFormFieldValuesChanged:Lkotlin/jvm/functions/Function2;

    .line 66
    iput-object p11, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->reportPaymentMethodTypeSelected:Lkotlin/jvm/functions/Function1;

    .line 67
    iput-object p12, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->createUSBankAccountFormArguments:Lkotlin/jvm/functions/Function1;

    .line 68
    iput-object p13, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    .line 69
    iput-boolean p14, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->isLiveMode:Z

    .line 112
    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->_selectedPaymentMethodCode:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 113
    check-cast p1, Lkotlinx/coroutines/flow/StateFlow;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->selectedPaymentMethodCode:Lkotlinx/coroutines/flow/StateFlow;

    .line 116
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->getInitialState()Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;

    move-result-object p1

    .line 115
    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 118
    check-cast p1, Lkotlinx/coroutines/flow/StateFlow;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->state:Lkotlinx/coroutines/flow/StateFlow;

    .line 136
    new-instance p1, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$1;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$1;-><init>(Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;Lkotlin/coroutines/Continuation;)V

    move-object p6, p1

    check-cast p6, Lkotlin/jvm/functions/Function2;

    const/4 p7, 0x3

    const/4 p8, 0x0

    const/4 p4, 0x0

    const/4 p5, 0x0

    move-object p3, p13

    invoke-static/range {p3 .. p8}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-object p9, p3

    .line 142
    new-instance p1, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$2;

    invoke-direct {p1, p0, p2}, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$2;-><init>(Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;Lkotlin/coroutines/Continuation;)V

    move-object p12, p1

    check-cast p12, Lkotlin/jvm/functions/Function2;

    const/4 p13, 0x3

    const/4 p14, 0x0

    const/4 p10, 0x0

    const/4 p11, 0x0

    invoke-static/range {p9 .. p14}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 157
    new-instance p1, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$3;

    invoke-direct {p1, p0, p2}, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$3;-><init>(Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;Lkotlin/coroutines/Continuation;)V

    move-object p12, p1

    check-cast p12, Lkotlin/jvm/functions/Function2;

    invoke-static/range {p9 .. p14}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 165
    new-instance p1, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$4;

    invoke-direct {p1, p0, p2}, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$4;-><init>(Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;Lkotlin/coroutines/Continuation;)V

    move-object p12, p1

    check-cast p12, Lkotlin/jvm/functions/Function2;

    invoke-static/range {p9 .. p14}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public static final synthetic access$getClearErrorMessages$p(Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;)Lkotlin/jvm/functions/Function0;
    .locals 0

    .line 55
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->clearErrorMessages:Lkotlin/jvm/functions/Function0;

    return-object p0
.end method

.method public static final synthetic access$getCreateFormArguments$p(Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 55
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->createFormArguments:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic access$getCreateUSBankAccountFormArguments$p(Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 55
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->createUSBankAccountFormArguments:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic access$getFormElementsForCode$p(Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 55
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->formElementsForCode:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic access$getProcessing$p(Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    .line 55
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->processing:Lkotlinx/coroutines/flow/StateFlow;

    return-object p0
.end method

.method public static final synthetic access$getSelectedPaymentMethodCode$p(Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    .line 55
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->selectedPaymentMethodCode:Lkotlinx/coroutines/flow/StateFlow;

    return-object p0
.end method

.method public static final synthetic access$getSelection$p(Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    .line 55
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->selection:Lkotlinx/coroutines/flow/StateFlow;

    return-object p0
.end method

.method public static final synthetic access$get_state$p(Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 55
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method private final getInitialState()Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;
    .locals 10

    .line 121
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->selectedPaymentMethodCode:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 123
    new-instance v1, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;

    .line 125
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->supportedPaymentMethods:Ljava/util/List;

    .line 126
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->createFormArguments:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    .line 127
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->formElementsForCode:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    .line 128
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->selection:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    .line 129
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->processing:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    .line 130
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->incentive:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;

    .line 131
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->createUSBankAccountFormArguments:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;

    .line 123
    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZLcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;)V

    return-object v1
.end method


# virtual methods
.method public close()V
    .locals 3

    .line 193
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/CoroutineScopeKt;->cancel$default(Lkotlinx/coroutines/CoroutineScope;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method

.method public getState()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;",
            ">;"
        }
    .end annotation

    .line 118
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->state:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public handleViewAction(Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$ViewAction;)V
    .locals 2

    const-string v0, "viewAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$ViewAction$ReportFieldInteraction;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->reportFieldInteraction:Lkotlin/jvm/functions/Function1;

    .line 177
    check-cast p1, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$ViewAction$ReportFieldInteraction;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$ViewAction$ReportFieldInteraction;->getCode()Ljava/lang/String;

    move-result-object p1

    .line 176
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 179
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$ViewAction$OnFormFieldValuesChanged;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->onFormFieldValuesChanged:Lkotlin/jvm/functions/Function2;

    .line 180
    check-cast p1, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$ViewAction$OnFormFieldValuesChanged;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$ViewAction$OnFormFieldValuesChanged;->getFormValues()Lcom/stripe/android/paymentsheet/forms/FormFieldValues;

    move-result-object v1

    .line 181
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$ViewAction$OnFormFieldValuesChanged;->getSelectedPaymentMethodCode()Ljava/lang/String;

    move-result-object p1

    .line 179
    invoke-interface {v0, v1, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 183
    :cond_1
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$ViewAction$OnPaymentMethodSelected;

    if-eqz v0, :cond_3

    .line 184
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->selectedPaymentMethodCode:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast p1, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$ViewAction$OnPaymentMethodSelected;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$ViewAction$OnPaymentMethodSelected;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 185
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->_selectedPaymentMethodCode:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$ViewAction$OnPaymentMethodSelected;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 186
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->reportPaymentMethodTypeSelected:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$ViewAction$OnPaymentMethodSelected;->getCode()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void

    .line 175
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public isLiveMode()Z
    .locals 1

    .line 69
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor;->isLiveMode:Z

    return v0
.end method
