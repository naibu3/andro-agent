.class public final Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;
.super Ljava/lang/Object;
.source "CustomerSheetLoader.kt"

# interfaces
.implements Lcom/stripe/android/customersheet/CustomerSheetLoader;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCustomerSheetLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerSheetLoader.kt\ncom/stripe/android/customersheet/DefaultCustomerSheetLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,239:1\n774#2:240\n865#2,2:241\n774#2:243\n865#2,2:244\n*S KotlinDebug\n*F\n+ 1 CustomerSheetLoader.kt\ncom/stripe/android/customersheet/DefaultCustomerSheetLoader\n*L\n83#1:240\n83#1:241,2\n234#1:243\n234#1:244,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001Bf\u0012\u000e\u0008\u0001\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006\u00a2\u0006\u0002\u0008\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018B\\\u0008\u0017\u0012\u000e\u0008\u0001\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006\u00a2\u0006\u0002\u0008\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0008\u0008\u0001\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0019J\u001e\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0096@\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u001bH\u0082@\u00a2\u0006\u0004\u0008\"\u0010#J&\u0010$\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u0004H\u0082@\u00a2\u0006\u0002\u0010)J \u0010*\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\'2\u0006\u0010+\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J(\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010&\u001a\u00020\'2\u0006\u0010+\u001a\u00020%2\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u0002000/H\u0002J \u00101\u001a\u0004\u0018\u00010-2\u0006\u0010&\u001a\u00020\'2\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u0002000/H\u0002J\u001c\u00102\u001a\u0008\u0012\u0004\u0012\u0002030/2\u000c\u00104\u001a\u0008\u0012\u0004\u0012\u0002030/H\u0002R\u0014\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006\u00a2\u0006\u0002\u0008\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;",
        "Lcom/stripe/android/customersheet/CustomerSheetLoader;",
        "isLiveModeProvider",
        "Lkotlin/Function0;",
        "",
        "googlePayRepositoryFactory",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;",
        "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;",
        "Lkotlin/jvm/JvmSuppressWildcards;",
        "isFinancialConnectionsAvailable",
        "Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;",
        "lpmRepository",
        "Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;",
        "initializationDataSourceProvider",
        "Lcom/stripe/android/common/coroutines/Single;",
        "Lcom/stripe/android/customersheet/data/CustomerSheetInitializationDataSource;",
        "eventReporter",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;",
        "errorReporter",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "<init>",
        "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;Lcom/stripe/android/common/coroutines/Single;Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V",
        "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V",
        "load",
        "Lkotlin/Result;",
        "Lcom/stripe/android/customersheet/CustomerSheetState$Full;",
        "configuration",
        "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;",
        "load-gIAlu-s",
        "(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "retrieveInitializationDataSource",
        "retrieveInitializationDataSource-IoAF18A",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createPaymentMethodMetadata",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
        "customerSheetSession",
        "Lcom/stripe/android/customersheet/data/CustomerSheetSession;",
        "isPaymentMethodSyncDefaultEnabled",
        "(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/customersheet/data/CustomerSheetSession;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createCustomerSheetState",
        "metadata",
        "getPaymentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "paymentMethods",
        "",
        "Lcom/stripe/android/model/PaymentMethod;",
        "useLocalSelectionAsPaymentSelection",
        "filterSupportedPaymentMethods",
        "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;",
        "supportedPaymentMethods",
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
.field private final errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

.field private final eventReporter:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;

.field private final googlePayRepositoryFactory:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;",
            "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final initializationDataSourceProvider:Lcom/stripe/android/common/coroutines/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/stripe/android/common/coroutines/Single<",
            "Lcom/stripe/android/customersheet/data/CustomerSheetInitializationDataSource;",
            ">;"
        }
    .end annotation
.end field

.field private final isFinancialConnectionsAvailable:Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;

.field private final isLiveModeProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final lpmRepository:Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public static synthetic $r8$lambda$z60XeHl7M5xDf_CQtD1vpnv_F18()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;->retrieveInitializationDataSource_IoAF18A$lambda$4()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;Lcom/stripe/android/common/coroutines/Single;Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation runtime Ljavax/inject/Named;
            value = "isLiveMode"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;",
            "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;",
            ">;",
            "Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;",
            "Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;",
            "Lcom/stripe/android/common/coroutines/Single<",
            "Lcom/stripe/android/customersheet/data/CustomerSheetInitializationDataSource;",
            ">;",
            "Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
            "Lkotlin/coroutines/CoroutineContext;",
            ")V"
        }
    .end annotation

    const-string v0, "isLiveModeProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googlePayRepositoryFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isFinancialConnectionsAvailable"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lpmRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initializationDataSourceProvider"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;->isLiveModeProvider:Lkotlin/jvm/functions/Function0;

    .line 41
    iput-object p2, p0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;->googlePayRepositoryFactory:Lkotlin/jvm/functions/Function1;

    .line 42
    iput-object p3, p0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;->isFinancialConnectionsAvailable:Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;

    .line 43
    iput-object p4, p0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;->lpmRepository:Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;

    .line 44
    iput-object p5, p0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;->initializationDataSourceProvider:Lcom/stripe/android/common/coroutines/Single;

    .line 45
    iput-object p6, p0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;->eventReporter:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;

    .line 46
    iput-object p7, p0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 47
    iput-object p8, p0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;->workContext:Lkotlin/coroutines/CoroutineContext;

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V
    .locals 10
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation runtime Ljavax/inject/Named;
            value = "isLiveMode"
        .end annotation
    .end param
    .param p7    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;",
            "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;",
            ">;",
            "Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;",
            "Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;",
            "Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
            "Lkotlin/coroutines/CoroutineContext;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "isLiveModeProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googlePayRepositoryFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isFinancialConnectionsAvailable"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lpmRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    move-object/from16 v8, p6

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    move-object/from16 v9, p7

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    sget-object v0, Lcom/stripe/android/customersheet/util/CustomerSheetHacks;->INSTANCE:Lcom/stripe/android/customersheet/util/CustomerSheetHacks;

    invoke-virtual {v0}, Lcom/stripe/android/customersheet/util/CustomerSheetHacks;->getInitializationDataSource()Lcom/stripe/android/common/coroutines/Single;

    move-result-object v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v7, p5

    .line 58
    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;Lcom/stripe/android/common/coroutines/Single;Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V

    return-void
.end method

.method public static final synthetic access$createPaymentMethodMetadata(Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/customersheet/data/CustomerSheetSession;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;->createPaymentMethodMetadata(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/customersheet/data/CustomerSheetSession;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retrieveInitializationDataSource-IoAF18A(Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;->retrieveInitializationDataSource-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final createCustomerSheetState(Lcom/stripe/android/customersheet/data/CustomerSheetSession;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;)Lcom/stripe/android/customersheet/CustomerSheetState$Full;
    .locals 9

    .line 171
    invoke-virtual {p1}, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->getPaymentMethods()Ljava/util/List;

    move-result-object v0

    .line 173
    invoke-direct {p0, p1, p2, v0}, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;->getPaymentSelection(Lcom/stripe/android/customersheet/data/CustomerSheetSession;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Ljava/util/List;)Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object v7

    .line 176
    invoke-virtual {p1}, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->getPaymentMethods()Ljava/util/List;

    move-result-object v0

    .line 177
    instance-of v1, v7, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    if-eqz v1, :cond_0

    move-object v1, v7

    check-cast v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 175
    :goto_0
    invoke-static {v0, v1}, Lcom/stripe/android/customersheet/util/CustomerSheetUtilsKt;->sortPaymentMethods(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;)Ljava/util/List;

    move-result-object v4

    .line 180
    invoke-virtual {p2}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->sortedSupportedPaymentMethods()Ljava/util/List;

    move-result-object v0

    .line 182
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;->filterSupportedPaymentMethods(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    .line 190
    invoke-virtual {p1}, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->getElementsSession()Lcom/stripe/android/model/ElementsSession;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/model/ElementsSession;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/model/StripeIntentValidatorKt;->validate(Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;

    move-result-object v0

    .line 191
    invoke-virtual {p1}, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->getPermissions()Lcom/stripe/android/customersheet/CustomerPermissions;

    move-result-object v5

    .line 184
    new-instance v1, Lcom/stripe/android/customersheet/CustomerSheetState$Full;

    .line 190
    move-object v8, v0

    check-cast v8, Ljava/lang/Throwable;

    move-object v3, p2

    move-object v2, p3

    .line 184
    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/customersheet/CustomerSheetState$Full;-><init>(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Ljava/util/List;Lcom/stripe/android/customersheet/CustomerPermissions;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/Throwable;)V

    return-object v1
.end method

.method private final createPaymentMethodMetadata(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/customersheet/data/CustomerSheetSession;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;",
            "Lcom/stripe/android/customersheet/data/CustomerSheetSession;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$createPaymentMethodMetadata$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$createPaymentMethodMetadata$1;

    iget v1, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$createPaymentMethodMetadata$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$createPaymentMethodMetadata$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$createPaymentMethodMetadata$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$createPaymentMethodMetadata$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$createPaymentMethodMetadata$1;-><init>(Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$createPaymentMethodMetadata$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 132
    iget v2, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$createPaymentMethodMetadata$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-boolean p1, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$createPaymentMethodMetadata$1;->Z$0:Z

    iget-object p2, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$createPaymentMethodMetadata$1;->L$3:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    iget-object p3, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$createPaymentMethodMetadata$1;->L$2:Ljava/lang/Object;

    check-cast p3, Lcom/stripe/android/model/ElementsSession;

    iget-object v1, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$createPaymentMethodMetadata$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/customersheet/data/CustomerSheetSession;

    iget-object v0, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$createPaymentMethodMetadata$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v2, p3

    move p3, p1

    move-object p1, v0

    move-object v0, p4

    move-object p4, v2

    move-object v2, p2

    move-object p2, v1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 137
    invoke-virtual {p2}, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->getElementsSession()Lcom/stripe/android/model/ElementsSession;

    move-result-object p4

    .line 138
    iget-object v2, p0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;->lpmRepository:Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;

    .line 139
    invoke-virtual {p4}, Lcom/stripe/android/model/ElementsSession;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v4

    .line 140
    invoke-virtual {p4}, Lcom/stripe/android/model/ElementsSession;->getPaymentMethodSpecs()Ljava/lang/String;

    move-result-object v5

    .line 138
    invoke-virtual {v2, v4, v5}, Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;->getSharedDataSpecs(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;)Lcom/stripe/android/lpmfoundations/luxe/LpmRepository$Result;

    move-result-object v2

    .line 141
    invoke-virtual {v2}, Lcom/stripe/android/lpmfoundations/luxe/LpmRepository$Result;->getSharedDataSpecs()Ljava/util/List;

    move-result-object v2

    .line 143
    invoke-virtual {p1}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->getGooglePayEnabled()Z

    move-result v4

    if-eqz v4, :cond_5

    iget-object v4, p0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;->googlePayRepositoryFactory:Lkotlin/jvm/functions/Function1;

    .line 144
    iget-object v5, p0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;->isLiveModeProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v5}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_3

    sget-object v5, Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;->Production:Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;

    goto :goto_1

    :cond_3
    sget-object v5, Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;->Test:Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;

    .line 143
    :goto_1
    invoke-interface {v4, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/googlepaylauncher/GooglePayRepository;

    .line 145
    invoke-interface {v4}, Lcom/stripe/android/googlepaylauncher/GooglePayRepository;->isReady()Lkotlinx/coroutines/flow/Flow;

    move-result-object v4

    iput-object p1, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$createPaymentMethodMetadata$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$createPaymentMethodMetadata$1;->L$1:Ljava/lang/Object;

    iput-object p4, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$createPaymentMethodMetadata$1;->L$2:Ljava/lang/Object;

    iput-object v2, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$createPaymentMethodMetadata$1;->L$3:Ljava/lang/Object;

    iput-boolean p3, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$createPaymentMethodMetadata$1;->Z$0:Z

    iput v3, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$createPaymentMethodMetadata$1;->label:I

    invoke-static {v4, v0}, Lkotlinx/coroutines/flow/FlowKt;->first(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_4

    return-object v1

    :cond_4
    :goto_2
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    move v9, v3

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    move v9, v0

    :goto_3
    move-object v6, p1

    move-object v5, p4

    move-object v8, v2

    .line 147
    new-instance v10, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;

    .line 150
    sget-object p1, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->Companion:Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions$Companion;

    invoke-virtual {p1, v6, p2}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions$Companion;->createForCustomerSheet$paymentsheet_release(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/customersheet/data/CustomerSheetSession;)Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;

    move-result-object p1

    .line 147
    invoke-direct {v10, v3, p3, p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;-><init>(ZZLcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;)V

    .line 156
    sget-object v4, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->Companion:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata$Companion;

    .line 159
    invoke-virtual {p2}, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->getPaymentMethodSaveConsentBehavior()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

    move-result-object v7

    .line 156
    invoke-virtual/range {v4 .. v10}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata$Companion;->createForCustomerSheet$paymentsheet_release(Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;Ljava/util/List;ZLcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;)Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object p1

    return-object p1
.end method

.method private final filterSupportedPaymentMethods(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 231
    new-array v0, v0, [Ljava/lang/String;

    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 232
    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->USBankAccount:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 230
    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOfNotNull([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    .line 234
    check-cast p1, Ljava/lang/Iterable;

    .line 243
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 244
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;

    .line 235
    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 244
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 245
    :cond_1
    check-cast v1, Ljava/util/List;

    return-object v1
.end method

.method private final getPaymentSelection(Lcom/stripe/android/customersheet/data/CustomerSheetSession;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Ljava/util/List;)Lcom/stripe/android/paymentsheet/model/PaymentSelection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/customersheet/data/CustomerSheetSession;",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;"
        }
    .end annotation

    .line 200
    invoke-virtual {p2}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getCustomerMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->isPaymentMethodSetAsDefaultEnabled()Z

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 201
    invoke-virtual {p1}, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->getDefaultPaymentMethodId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p3, p1}, Lcom/stripe/android/customersheet/util/SyncDefaultPaymentMethodUtilsKt;->getDefaultPaymentMethodAsPaymentSelection(Ljava/util/List;Ljava/lang/String;)Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object p1

    return-object p1

    .line 203
    :cond_0
    invoke-direct {p0, p1, p3}, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;->useLocalSelectionAsPaymentSelection(Lcom/stripe/android/customersheet/data/CustomerSheetSession;Ljava/util/List;)Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object p1

    return-object p1
.end method

.method private final retrieveInitializationDataSource-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "+",
            "Lcom/stripe/android/customersheet/data/CustomerSheetInitializationDataSource;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$retrieveInitializationDataSource$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$retrieveInitializationDataSource$1;

    iget v1, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$retrieveInitializationDataSource$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$retrieveInitializationDataSource$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$retrieveInitializationDataSource$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$retrieveInitializationDataSource$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$retrieveInitializationDataSource$1;-><init>(Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$retrieveInitializationDataSource$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 117
    iget v2, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$retrieveInitializationDataSource$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$retrieveInitializationDataSource$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 118
    iget-object p1, p0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;->initializationDataSourceProvider:Lcom/stripe/android/common/coroutines/Single;

    .line 119
    sget-object v2, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/4 v2, 0x5

    sget-object v4, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v2, v4}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v4

    new-instance v2, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$$ExternalSyntheticLambda0;

    invoke-direct {v2}, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$$ExternalSyntheticLambda0;-><init>()V

    .line 118
    iput-object p0, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$retrieveInitializationDataSource$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$retrieveInitializationDataSource$1;->label:I

    invoke-static {p1, v4, v5, v2, v0}, Lcom/stripe/android/common/coroutines/SingleKt;->awaitWithTimeout-dWUq8MI(Lcom/stripe/android/common/coroutines/Single;JLkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    .line 124
    :goto_1
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 125
    iget-object v2, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 126
    sget-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->CUSTOMER_SHEET_ADAPTER_NOT_FOUND:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    .line 127
    sget-object v0, Lcom/stripe/android/core/exception/StripeException;->Companion:Lcom/stripe/android/core/exception/StripeException$Companion;

    invoke-virtual {v0, v1}, Lcom/stripe/android/core/exception/StripeException$Companion;->create(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    .line 125
    invoke-static/range {v2 .. v7}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    :cond_4
    return-object p1
.end method

.method private static final retrieveInitializationDataSource_IoAF18A$lambda$4()Ljava/lang/String;
    .locals 1

    .line 121
    const-string v0, "Couldn\'t find an instance of InitializationDataSource. Are you instantiating CustomerSheet unconditionally in your app?"

    return-object v0
.end method

.method private final useLocalSelectionAsPaymentSelection(Lcom/stripe/android/customersheet/data/CustomerSheetSession;Ljava/util/List;)Lcom/stripe/android/paymentsheet/model/PaymentSelection;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/customersheet/data/CustomerSheetSession;",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;"
        }
    .end annotation

    .line 211
    invoke-virtual {p1}, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->getSavedSelection()Lcom/stripe/android/paymentsheet/model/SavedSelection;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_7

    .line 213
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/model/SavedSelection$GooglePay;

    if-eqz v1, :cond_0

    sget-object p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;->INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-object p1

    .line 214
    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/model/SavedSelection$Link;

    if-eqz v1, :cond_1

    new-instance v2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;-><init>(Lcom/stripe/android/link/LinkExpressMode;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/ConsumerShippingAddress;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-object v2

    .line 215
    :cond_1
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;

    if-eqz v1, :cond_5

    .line 216
    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/model/PaymentMethod;

    .line 217
    iget-object v2, v2, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    move-object v3, p1

    check-cast v3, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_3
    move-object v1, v0

    .line 216
    :goto_0
    move-object v3, v1

    check-cast v3, Lcom/stripe/android/model/PaymentMethod;

    if-eqz v3, :cond_4

    .line 219
    new-instance v2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;-><init>(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved$WalletType;Lcom/stripe/android/model/PaymentMethodOptionsParams;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v2

    .line 218
    :cond_4
    check-cast v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-object v0

    .line 222
    :cond_5
    instance-of p1, p1, Lcom/stripe/android/paymentsheet/model/SavedSelection$None;

    if-eqz p1, :cond_6

    return-object v0

    .line 212
    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    return-object v0
.end method


# virtual methods
.method public load-gIAlu-s(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/customersheet/CustomerSheetState$Full;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$load$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$load$1;

    iget v1, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$load$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$load$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$load$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$load$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$load$1;-><init>(Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$load$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 69
    iget v2, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$load$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$load$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerSheetSession;

    iget-object v1, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$load$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    iget-object v0, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$load$1;->L$0:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;

    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$load$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    iget-object v2, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$load$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;

    :try_start_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :cond_3
    iget-object p1, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$load$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    iget-object v2, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$load$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;

    :try_start_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_6

    :cond_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 72
    :try_start_3
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 73
    iput-object p0, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$load$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$load$1;->L$1:Ljava/lang/Object;

    iput v5, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$load$1;->label:I

    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;->retrieveInitializationDataSource-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne p2, v1, :cond_5

    goto/16 :goto_4

    :cond_5
    move-object v2, p0

    :goto_1
    :try_start_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lcom/stripe/android/customersheet/data/CustomerSheetInitializationDataSource;

    .line 75
    iput-object v2, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$load$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$load$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$load$1;->label:I

    invoke-interface {p2, p1, v0}, Lcom/stripe/android/customersheet/data/CustomerSheetInitializationDataSource;->loadCustomerSheetSession(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    goto :goto_4

    .line 69
    :cond_6
    :goto_2
    check-cast p2, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    .line 76
    invoke-interface {p2}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;->toResult-d1pmJ48()Ljava/lang/Object;

    move-result-object p2

    .line 77
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v4, p2

    check-cast v4, Lcom/stripe/android/customersheet/data/CustomerSheetSession;

    .line 80
    invoke-virtual {v4}, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->getElementsSession()Lcom/stripe/android/model/ElementsSession;

    move-result-object p2

    .line 79
    invoke-static {p2}, Lcom/stripe/android/customersheet/util/SyncDefaultPaymentMethodUtilsKt;->getDefaultPaymentMethodsEnabledForCustomerSheet(Lcom/stripe/android/model/ElementsSession;)Z

    move-result p2

    .line 83
    invoke-virtual {v4}, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->getPaymentMethods()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    .line 240
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/Collection;

    .line 241
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_7
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/stripe/android/model/PaymentMethod;

    .line 84
    new-instance v9, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilter;

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->getCardBrandAcceptance$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    move-result-object v10

    invoke-direct {v9, v10}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilter;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;)V

    invoke-virtual {v9, v8}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilter;->isAccepted(Lcom/stripe/android/model/PaymentMethod;)Z

    move-result v8

    if-eqz v8, :cond_7

    .line 241
    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 242
    :cond_8
    check-cast v6, Ljava/util/List;

    .line 85
    invoke-static {v6, p2}, Lcom/stripe/android/customersheet/util/SyncDefaultPaymentMethodUtilsKt;->filterToSupportedPaymentMethods(Ljava/util/List;Z)Ljava/util/List;

    move-result-object v6

    const/16 v11, 0x3d

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 87
    invoke-static/range {v4 .. v12}, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->copy$default(Lcom/stripe/android/customersheet/data/CustomerSheetSession;Lcom/stripe/android/model/ElementsSession;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/SavedSelection;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;Lcom/stripe/android/customersheet/CustomerPermissions;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/customersheet/data/CustomerSheetSession;

    move-result-object v4

    .line 91
    iput-object v2, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$load$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$load$1;->L$1:Ljava/lang/Object;

    iput-object v4, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$load$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader$load$1;->label:I

    invoke-direct {v2, p1, v4, p2, v0}, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;->createPaymentMethodMetadata(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/customersheet/data/CustomerSheetSession;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_9

    :goto_4
    return-object v1

    :cond_9
    move-object v1, p1

    move-object p1, v4

    .line 69
    :goto_5
    check-cast p2, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    .line 97
    invoke-direct {v2, p1, p2, v1}, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;->createCustomerSheetState(Lcom/stripe/android/customersheet/data/CustomerSheetSession;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;)Lcom/stripe/android/customersheet/CustomerSheetState$Full;

    move-result-object p2

    .line 102
    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    .line 72
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_7

    :catchall_1
    move-exception v0

    move-object p1, v0

    move-object v2, p0

    :goto_6
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 105
    :goto_7
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_a

    check-cast p1, Lkotlin/Pair;

    .line 106
    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/customersheet/CustomerSheetState$Full;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerSheetSession;

    .line 107
    iget-object v0, v2, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;->eventReporter:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;

    invoke-interface {v0, p1}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;->onLoadSucceeded(Lcom/stripe/android/customersheet/data/CustomerSheetSession;)V

    .line 108
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_8

    .line 111
    :cond_a
    iget-object p1, v2, Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;->eventReporter:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;

    invoke-interface {p1, p2}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;->onLoadFailed(Ljava/lang/Throwable;)V

    .line 112
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_8
    return-object p1
.end method
