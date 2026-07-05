.class public final Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;
.super Ljava/lang/Object;
.source "SelectSavedPaymentMethodsInteractor.kt"

# interfaces
.implements Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u0000 12\u00020\u0001:\u00011B\u00f3\u0001\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u0012\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0003\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0003\u0012\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000c0\u0015\u00128\u0010\u0017\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\u0010\u00a2\u0006\u000c\u0008\u0019\u0012\u0008\u0008\u001a\u0012\u0004\u0008\u0008(\u001b\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\u000c\u0008\u0019\u0012\u0008\u0008\u001a\u0012\u0004\u0008\u0008(\u001c\u0012\u0004\u0012\u00020\u000c0\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0008\u0010*\u001a\u00020&H\u0002J,\u0010+\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u00102\u0008\u0010,\u001a\u0004\u0018\u00010\u00122\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0010\u0010-\u001a\u00020\u000c2\u0006\u0010.\u001a\u00020/H\u0016J\u0008\u00100\u001a\u00020\u000cH\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000c0\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R@\u0010\u0017\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\u0010\u00a2\u0006\u000c\u0008\u0019\u0012\u0008\u0008\u001a\u0012\u0004\u0008\u0008(\u001b\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\u000c\u0008\u0019\u0012\u0008\u0008\u001a\u0012\u0004\u0008\u0008(\u001c\u0012\u0004\u0012\u00020\u000c0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u0008\u0012\u0004\u0012\u00020&0$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020&0\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)\u00a8\u00062"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;",
        "Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor;",
        "paymentOptionsItems",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "",
        "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
        "editing",
        "",
        "canEdit",
        "canRemove",
        "toggleEdit",
        "Lkotlin/Function0;",
        "",
        "isProcessing",
        "isCurrentScreen",
        "currentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "mostRecentlySelectedSavedPaymentMethod",
        "Lcom/stripe/android/model/PaymentMethod;",
        "onAddCardPressed",
        "onUpdatePaymentMethod",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;",
        "updateSelection",
        "Lkotlin/Function2;",
        "Lkotlin/ParameterName;",
        "name",
        "selection",
        "isUserInput",
        "isLiveMode",
        "<init>",
        "(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Z)V",
        "()Z",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "_screenSelection",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "_state",
        "Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;",
        "state",
        "getState",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "getInitialState",
        "getSelectedPaymentOptionsItem",
        "savedSelection",
        "handleViewAction",
        "viewAction",
        "Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$ViewAction;",
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

.field public static final Companion:Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor$Companion;


# instance fields
.field private final _screenSelection:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ">;"
        }
    .end annotation
.end field

.field private final _state:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;",
            ">;"
        }
    .end annotation
.end field

.field private final canEdit:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final canRemove:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final coroutineScope:Lkotlinx/coroutines/CoroutineScope;

.field private final currentSelection:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ">;"
        }
    .end annotation
.end field

.field private final editing:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final isCurrentScreen:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final isLiveMode:Z

.field private final isProcessing:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final mostRecentlySelectedSavedPaymentMethod:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;"
        }
    .end annotation
.end field

.field private final onAddCardPressed:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final onUpdatePaymentMethod:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentOptionsItems:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
            ">;>;"
        }
    .end annotation
.end field

.field private final state:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;",
            ">;"
        }
    .end annotation
.end field

.field private final toggleEdit:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final updateSelection:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->Companion:Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->$stable:I

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
            ">;>;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ">;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "paymentOptionsItems"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "editing"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "canEdit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "canRemove"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toggleEdit"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isProcessing"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isCurrentScreen"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentSelection"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mostRecentlySelectedSavedPaymentMethod"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onAddCardPressed"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onUpdatePaymentMethod"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateSelection"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->paymentOptionsItems:Lkotlinx/coroutines/flow/StateFlow;

    .line 54
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->editing:Lkotlinx/coroutines/flow/StateFlow;

    .line 55
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->canEdit:Lkotlinx/coroutines/flow/StateFlow;

    .line 56
    iput-object p4, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->canRemove:Lkotlinx/coroutines/flow/StateFlow;

    .line 57
    iput-object p5, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->toggleEdit:Lkotlin/jvm/functions/Function0;

    .line 58
    iput-object p6, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->isProcessing:Lkotlinx/coroutines/flow/StateFlow;

    .line 59
    iput-object p7, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->isCurrentScreen:Lkotlinx/coroutines/flow/StateFlow;

    .line 60
    iput-object p8, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->currentSelection:Lkotlinx/coroutines/flow/StateFlow;

    .line 61
    iput-object p9, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->mostRecentlySelectedSavedPaymentMethod:Lkotlinx/coroutines/flow/StateFlow;

    .line 62
    iput-object p10, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->onAddCardPressed:Lkotlin/jvm/functions/Function0;

    .line 63
    iput-object p11, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->onUpdatePaymentMethod:Lkotlin/jvm/functions/Function1;

    .line 64
    iput-object p12, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->updateSelection:Lkotlin/jvm/functions/Function2;

    .line 65
    iput-boolean p13, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->isLiveMode:Z

    .line 67
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getUnconfined()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object p1

    const/4 p2, 0x1

    const/4 p3, 0x0

    invoke-static {p3, p2, p3}, Lkotlinx/coroutines/SupervisorKt;->SupervisorJob$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableJob;

    move-result-object p2

    check-cast p2, Lkotlin/coroutines/CoroutineContext;

    invoke-virtual {p1, p2}, Lkotlinx/coroutines/CoroutineDispatcher;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    invoke-static {p1}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object p4

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    .line 70
    invoke-interface {p8}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    .line 71
    instance-of p2, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;

    if-nez p2, :cond_1

    .line 72
    instance-of p2, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    if-nez p2, :cond_1

    .line 73
    instance-of p2, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, p3

    .line 69
    :cond_1
    :goto_0
    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->_screenSelection:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 79
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->getInitialState()Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;

    move-result-object p1

    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 80
    check-cast p1, Lkotlinx/coroutines/flow/StateFlow;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->state:Lkotlinx/coroutines/flow/StateFlow;

    .line 100
    new-instance p1, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor$1;

    invoke-direct {p1, p0, p3}, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor$1;-><init>(Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;Lkotlin/coroutines/Continuation;)V

    move-object p7, p1

    check-cast p7, Lkotlin/jvm/functions/Function2;

    const/4 p8, 0x3

    const/4 p9, 0x0

    const/4 p5, 0x0

    const/4 p6, 0x0

    invoke-static/range {p4 .. p9}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 110
    new-instance p1, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor$2;

    invoke-direct {p1, p0, p3}, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor$2;-><init>(Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;Lkotlin/coroutines/Continuation;)V

    move-object p7, p1

    check-cast p7, Lkotlin/jvm/functions/Function2;

    invoke-static/range {p4 .. p9}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 120
    new-instance p1, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor$3;

    invoke-direct {p1, p0, p3}, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor$3;-><init>(Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;Lkotlin/coroutines/Continuation;)V

    move-object p7, p1

    check-cast p7, Lkotlin/jvm/functions/Function2;

    invoke-static/range {p4 .. p9}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 130
    new-instance p1, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor$4;

    invoke-direct {p1, p0, p3}, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor$4;-><init>(Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;Lkotlin/coroutines/Continuation;)V

    move-object p7, p1

    check-cast p7, Lkotlin/jvm/functions/Function2;

    invoke-static/range {p4 .. p9}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 140
    new-instance p1, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor$5;

    invoke-direct {p1, p0, p3}, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor$5;-><init>(Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;Lkotlin/coroutines/Continuation;)V

    move-object p7, p1

    check-cast p7, Lkotlin/jvm/functions/Function2;

    invoke-static/range {p4 .. p9}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 150
    new-instance p1, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor$6;

    invoke-direct {p1, p0, p3}, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor$6;-><init>(Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;Lkotlin/coroutines/Continuation;)V

    move-object p7, p1

    check-cast p7, Lkotlin/jvm/functions/Function2;

    invoke-static/range {p4 .. p9}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 162
    new-instance p1, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor$7;

    invoke-direct {p1, p0, p3}, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor$7;-><init>(Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;Lkotlin/coroutines/Continuation;)V

    move-object p7, p1

    check-cast p7, Lkotlin/jvm/functions/Function2;

    invoke-static/range {p4 .. p9}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 178
    new-instance p1, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor$8;

    invoke-direct {p1, p0, p3}, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor$8;-><init>(Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;Lkotlin/coroutines/Continuation;)V

    move-object p7, p1

    check-cast p7, Lkotlin/jvm/functions/Function2;

    invoke-static/range {p4 .. p9}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public static final synthetic access$getCanEdit$p(Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    .line 52
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->canEdit:Lkotlinx/coroutines/flow/StateFlow;

    return-object p0
.end method

.method public static final synthetic access$getCanRemove$p(Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    .line 52
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->canRemove:Lkotlinx/coroutines/flow/StateFlow;

    return-object p0
.end method

.method public static final synthetic access$getCurrentSelection$p(Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    .line 52
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->currentSelection:Lkotlinx/coroutines/flow/StateFlow;

    return-object p0
.end method

.method public static final synthetic access$getEditing$p(Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    .line 52
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->editing:Lkotlinx/coroutines/flow/StateFlow;

    return-object p0
.end method

.method public static final synthetic access$getMostRecentlySelectedSavedPaymentMethod$p(Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    .line 52
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->mostRecentlySelectedSavedPaymentMethod:Lkotlinx/coroutines/flow/StateFlow;

    return-object p0
.end method

.method public static final synthetic access$getPaymentOptionsItems$p(Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    .line 52
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->paymentOptionsItems:Lkotlinx/coroutines/flow/StateFlow;

    return-object p0
.end method

.method public static final synthetic access$getSelectedPaymentOptionsItem(Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/model/PaymentMethod;Ljava/util/List;)Lcom/stripe/android/paymentsheet/PaymentOptionsItem;
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->getSelectedPaymentOptionsItem(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/model/PaymentMethod;Ljava/util/List;)Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getUpdateSelection$p(Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;)Lkotlin/jvm/functions/Function2;
    .locals 0

    .line 52
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->updateSelection:Lkotlin/jvm/functions/Function2;

    return-object p0
.end method

.method public static final synthetic access$get_screenSelection$p(Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 52
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->_screenSelection:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method public static final synthetic access$get_state$p(Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 52
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method public static final synthetic access$isCurrentScreen$p(Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    .line 52
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->isCurrentScreen:Lkotlinx/coroutines/flow/StateFlow;

    return-object p0
.end method

.method public static final synthetic access$isProcessing$p(Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    .line 52
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->isProcessing:Lkotlinx/coroutines/flow/StateFlow;

    return-object p0
.end method

.method private final getInitialState()Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;
    .locals 8

    .line 83
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->paymentOptionsItems:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    .line 85
    new-instance v1, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;

    .line 88
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->_screenSelection:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    .line 89
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->mostRecentlySelectedSavedPaymentMethod:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v3}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/model/PaymentMethod;

    .line 87
    invoke-direct {p0, v0, v3, v2}, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->getSelectedPaymentOptionsItem(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/model/PaymentMethod;Ljava/util/List;)Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    move-result-object v3

    .line 92
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->editing:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    .line 93
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->isProcessing:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    .line 94
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->canEdit:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    .line 95
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->canRemove:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    .line 85
    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;-><init>(Ljava/util/List;Lcom/stripe/android/paymentsheet/PaymentOptionsItem;ZZZZ)V

    return-object v1
.end method

.method private final getSelectedPaymentOptionsItem(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/model/PaymentMethod;Ljava/util/List;)Lcom/stripe/android/paymentsheet/PaymentOptionsItem;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;"
        }
    .end annotation

    .line 193
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    if-nez v0, :cond_4

    .line 194
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;

    if-nez v0, :cond_4

    .line 195
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    if-nez v0, :cond_4

    .line 196
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$ShopPay;

    if-eqz v0, :cond_0

    goto :goto_2

    .line 197
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    if-nez v0, :cond_2

    .line 198
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$ExternalPaymentMethod;

    if-nez v0, :cond_2

    .line 199
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomPaymentMethod;

    if-nez v0, :cond_2

    if-nez p1, :cond_1

    goto :goto_0

    .line 192
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    if-eqz p2, :cond_3

    .line 201
    new-instance v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;-><init>(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved$WalletType;Lcom/stripe/android/model/PaymentMethodOptionsParams;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    .line 200
    :goto_1
    move-object p1, v0

    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    .line 205
    :cond_4
    :goto_2
    sget-object p2, Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;->INSTANCE:Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;

    invoke-virtual {p2, p3, p1}, Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;->getSelectedItem(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public close()V
    .locals 3

    .line 234
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

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
            "Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;",
            ">;"
        }
    .end annotation

    .line 80
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->state:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public handleViewAction(Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$ViewAction;)V
    .locals 2

    const-string v0, "viewAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$ViewAction$EditPaymentMethod;

    if-eqz v0, :cond_0

    .line 214
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->onUpdatePaymentMethod:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$ViewAction$EditPaymentMethod;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$ViewAction$EditPaymentMethod;->getPaymentMethod()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 217
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$ViewAction$SelectPaymentMethod;

    if-eqz v0, :cond_1

    .line 218
    check-cast p1, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$ViewAction$SelectPaymentMethod;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$ViewAction$SelectPaymentMethod;->getSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object p1

    .line 220
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->_screenSelection:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 222
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->updateSelection:Lkotlin/jvm/functions/Function2;

    const/4 v1, 0x1

    .line 224
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 222
    invoke-interface {v0, p1, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 228
    :cond_1
    sget-object v0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$ViewAction$AddCardPressed;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$ViewAction$AddCardPressed;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->onAddCardPressed:Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void

    .line 229
    :cond_2
    sget-object v0, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$ViewAction$ToggleEdit;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$ViewAction$ToggleEdit;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->toggleEdit:Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void

    .line 212
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public isLiveMode()Z
    .locals 1

    .line 65
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->isLiveMode:Z

    return v0
.end method
