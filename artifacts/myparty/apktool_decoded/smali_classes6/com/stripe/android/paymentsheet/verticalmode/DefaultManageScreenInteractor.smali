.class public final Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;
.super Ljava/lang/Object;
.source "ManageScreenInteractor.kt"

# interfaces
.implements Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nManageScreenInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageScreenInteractor.kt\ncom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,241:1\n1557#2:242\n1628#2,3:243\n*S KotlinDebug\n*F\n+ 1 ManageScreenInteractor.kt\ncom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor\n*L\n118#1:242\n118#1:243,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u0000 32\u00020\u0001:\u00013B\u00de\u0001\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u001a\u0010\u0010\u001a\u0016\u0012\u000c\u0012\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\u0004\u0012\u00020\u00140\u0011\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u0011\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u0011\u0012!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\u000c\u0008\u0019\u0012\u0008\u0008\u001a\u0012\u0004\u0008\u0008(\u001b\u0012\u0004\u0012\u00020\u000f0\u0011\u0012\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0003\u0012\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001e\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020.H\u0016J\u0008\u0010/\u001a\u00020\u000fH\u0016J\u0010\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u0016H\u0002J\u0010\u00102\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000bH\u0002R\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0010\u001a\u0016\u0012\u000c\u0012\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\u0004\u0012\u00020\u00140\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\u000c\u0008\u0019\u0012\u0008\u0008\u001a\u0012\u0004\u0008\u0008(\u001b\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00160\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u001a\u0010(\u001a\u0008\u0012\u0004\u0012\u00020)0\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+\u00a8\u00064"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;",
        "Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor;",
        "paymentMethods",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "",
        "Lcom/stripe/android/model/PaymentMethod;",
        "paymentMethodMetadata",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
        "selection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "editing",
        "",
        "canEdit",
        "toggleEdit",
        "Lkotlin/Function0;",
        "",
        "providePaymentMethodName",
        "Lkotlin/Function1;",
        "",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "onSelectPaymentMethod",
        "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;",
        "onUpdatePaymentMethod",
        "navigateBack",
        "Lkotlin/ParameterName;",
        "name",
        "withDelay",
        "defaultPaymentMethodId",
        "dispatcher",
        "Lkotlin/coroutines/CoroutineContext;",
        "<init>",
        "(Lkotlinx/coroutines/flow/StateFlow;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;)V",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "hasNavigatedBack",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "displayableSavedPaymentMethods",
        "isLiveMode",
        "()Z",
        "state",
        "Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$State;",
        "getState",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "handleViewAction",
        "viewAction",
        "Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$ViewAction;",
        "close",
        "handlePaymentMethodSelected",
        "paymentMethod",
        "safeNavigateBack",
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

.field public static final Companion:Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$Companion;


# instance fields
.field private final canEdit:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final coroutineScope:Lkotlinx/coroutines/CoroutineScope;

.field private final defaultPaymentMethodId:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final displayableSavedPaymentMethods:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;",
            ">;>;"
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

.field private final hasNavigatedBack:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final isLiveMode:Z

.field private final navigateBack:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final onSelectPaymentMethod:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;",
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

.field private final paymentMethodMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

.field private final paymentMethods:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;"
        }
    .end annotation
.end field

.field private final providePaymentMethodName:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/strings/ResolvableString;",
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
            "Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$State;",
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


# direct methods
.method public static synthetic $r8$lambda$U6gehpxiKw-xaBXuHStg8W2uA3I(Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->displayableSavedPaymentMethods$lambda$1(Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$eIlCuj3GENwxnyVHsj8pwStrt9Q(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZZ)Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$State;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->state$lambda$2(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZZ)Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$State;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->Companion:Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->$stable:I

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/flow/StateFlow;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
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
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "+",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/CoroutineContext;",
            ")V"
        }
    .end annotation

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    move-object/from16 v5, p8

    move-object/from16 v6, p9

    move-object/from16 v7, p10

    move-object/from16 v8, p11

    move-object/from16 v9, p12

    const-string v10, "paymentMethods"

    invoke-static {p1, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "paymentMethodMetadata"

    invoke-static {p2, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "selection"

    invoke-static {p3, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "editing"

    invoke-static {p4, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "canEdit"

    invoke-static {v2, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "toggleEdit"

    invoke-static {v3, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "providePaymentMethodName"

    invoke-static {v4, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "onSelectPaymentMethod"

    invoke-static {v5, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "onUpdatePaymentMethod"

    invoke-static {v6, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "navigateBack"

    invoke-static {v7, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "defaultPaymentMethodId"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "dispatcher"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->paymentMethods:Lkotlinx/coroutines/flow/StateFlow;

    .line 99
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->paymentMethodMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    .line 100
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->selection:Lkotlinx/coroutines/flow/StateFlow;

    .line 101
    iput-object p4, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->editing:Lkotlinx/coroutines/flow/StateFlow;

    .line 102
    iput-object v2, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->canEdit:Lkotlinx/coroutines/flow/StateFlow;

    .line 103
    iput-object v3, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->toggleEdit:Lkotlin/jvm/functions/Function0;

    .line 104
    iput-object v4, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->providePaymentMethodName:Lkotlin/jvm/functions/Function1;

    .line 105
    iput-object v5, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->onSelectPaymentMethod:Lkotlin/jvm/functions/Function1;

    .line 106
    iput-object v6, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->onUpdatePaymentMethod:Lkotlin/jvm/functions/Function1;

    .line 107
    iput-object v7, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->navigateBack:Lkotlin/jvm/functions/Function1;

    .line 108
    iput-object v8, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->defaultPaymentMethodId:Lkotlinx/coroutines/flow/StateFlow;

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 112
    invoke-static {v4, v3, v4}, Lkotlinx/coroutines/SupervisorKt;->SupervisorJob$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableJob;

    move-result-object v3

    check-cast v3, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {v9, v3}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v3

    invoke-static {v3}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v3

    iput-object v3, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    .line 114
    new-instance v5, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v5, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->hasNavigatedBack:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 117
    new-instance v5, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$$ExternalSyntheticLambda0;

    invoke-direct {v5, p0}, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;)V

    invoke-static {p1, v8, v5}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->displayableSavedPaymentMethods:Lkotlinx/coroutines/flow/StateFlow;

    .line 127
    invoke-virtual {p2}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object p2

    invoke-interface {p2}, Lcom/stripe/android/model/StripeIntent;->isLiveMode()Z

    move-result p2

    iput-boolean p2, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->isLiveMode:Z

    .line 133
    new-instance p2, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$$ExternalSyntheticLambda1;

    invoke-direct {p2}, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$$ExternalSyntheticLambda1;-><init>()V

    .line 129
    invoke-static {p1, p3, p4, v2, p2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->state:Lkotlinx/coroutines/flow/StateFlow;

    .line 150
    new-instance p1, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$1;

    invoke-direct {p1, p0, v4}, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$1;-><init>(Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/jvm/functions/Function2;

    const/4 p2, 0x3

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object p4, p1

    move/from16 p5, p2

    move-object/from16 p6, v0

    move-object p2, v1

    move-object p3, v2

    move-object p1, v3

    invoke-static/range {p1 .. p6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 158
    new-instance p2, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$2;

    invoke-direct {p2, p0, v4}, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$2;-><init>(Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;Lkotlin/coroutines/Continuation;)V

    check-cast p2, Lkotlin/jvm/functions/Function2;

    const/4 v0, 0x3

    const/4 v3, 0x0

    move-object p4, p2

    move/from16 p5, v0

    move-object/from16 p6, v1

    move-object p2, v2

    move-object p3, v3

    invoke-static/range {p1 .. p6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlinx/coroutines/flow/StateFlow;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 14

    move/from16 v0, p13

    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_0

    .line 109
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    move-object v13, v0

    goto :goto_0

    :cond_0
    move-object/from16 v13, p12

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    .line 97
    invoke-direct/range {v1 .. v13}, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;-><init>(Lkotlinx/coroutines/flow/StateFlow;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;)V

    return-void
.end method

.method public static final synthetic access$getPaymentMethods$p(Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    .line 97
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->paymentMethods:Lkotlinx/coroutines/flow/StateFlow;

    return-object p0
.end method

.method public static final synthetic access$handlePaymentMethodSelected(Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)V
    .locals 0

    .line 97
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->handlePaymentMethodSelected(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)V

    return-void
.end method

.method public static final synthetic access$safeNavigateBack(Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;Z)V
    .locals 0

    .line 97
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->safeNavigateBack(Z)V

    return-void
.end method

.method private static final displayableSavedPaymentMethods$lambda$1(Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .locals 4

    const-string v0, "paymentMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    check-cast p1, Ljava/lang/Iterable;

    .line 242
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 243
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 244
    check-cast v1, Lcom/stripe/android/model/PaymentMethod;

    .line 120
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->providePaymentMethodName:Lkotlin/jvm/functions/Function1;

    .line 121
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->paymentMethodMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    .line 119
    invoke-static {v1, v2, v3, p2}, Lcom/stripe/android/paymentsheet/verticalmode/SavedPaymentMethodsExtensionKt;->toDisplayableSavedPaymentMethod(Lcom/stripe/android/model/PaymentMethod;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Ljava/lang/String;)Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    move-result-object v1

    .line 244
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 245
    :cond_0
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private final handlePaymentMethodSelected(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)V
    .locals 1

    .line 181
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->onSelectPaymentMethod:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    .line 182
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->safeNavigateBack(Z)V

    return-void
.end method

.method private final safeNavigateBack(Z)V
    .locals 2

    .line 186
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->hasNavigatedBack:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 187
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->navigateBack:Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private static final state$lambda$2(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZZ)Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$State;
    .locals 1

    const-string v0, "displayablePaymentMethods"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 138
    :cond_0
    sget-object v0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->Companion:Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$Companion;

    invoke-static {v0, p1, p0}, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$Companion;->access$paymentSelectionToDisplayableSavedPaymentMethod(Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$Companion;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/util/List;)Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    move-result-object p1

    .line 141
    :goto_0
    new-instance v0, Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$State;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$State;-><init>(Ljava/util/List;Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;ZZ)V

    return-object v0
.end method


# virtual methods
.method public close()V
    .locals 3

    .line 177
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

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
            "Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$State;",
            ">;"
        }
    .end annotation

    .line 129
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->state:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public handleViewAction(Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$ViewAction;)V
    .locals 1

    const-string v0, "viewAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$ViewAction$SelectPaymentMethod;

    if-eqz v0, :cond_0

    .line 170
    check-cast p1, Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$ViewAction$SelectPaymentMethod;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$ViewAction$SelectPaymentMethod;->getPaymentMethod()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->handlePaymentMethodSelected(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)V

    return-void

    .line 171
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$ViewAction$UpdatePaymentMethod;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->onUpdatePaymentMethod:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$ViewAction$UpdatePaymentMethod;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$ViewAction$UpdatePaymentMethod;->getPaymentMethod()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 172
    :cond_1
    sget-object v0, Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$ViewAction$ToggleEdit;->INSTANCE:Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$ViewAction$ToggleEdit;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->toggleEdit:Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void

    .line 168
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public isLiveMode()Z
    .locals 1

    .line 127
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->isLiveMode:Z

    return v0
.end method
