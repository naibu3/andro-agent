.class public final Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;
.super Ljava/lang/Object;
.source "CustomerAdapterDataSource.kt"

# interfaces
.implements Lcom/stripe/android/customersheet/data/CustomerSheetInitializationDataSource;
.implements Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;
.implements Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;
.implements Lcom/stripe/android/customersheet/data/CustomerSheetIntentDataSource;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCustomerAdapterDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerAdapterDataSource.kt\ncom/stripe/android/customersheet/data/CustomerAdapterDataSource\n+ 2 CustomerSheetDataResultKtx.kt\ncom/stripe/android/customersheet/data/CustomerSheetDataResultKtxKt\n*L\n1#1,180:1\n54#2,4:181\n63#2,6:185\n*S KotlinDebug\n*F\n+ 1 CustomerAdapterDataSource.kt\ncom/stripe/android/customersheet/data/CustomerAdapterDataSource\n*L\n144#1:181,4\n149#1:185,6\n*E\n"
.end annotation

.annotation runtime Ljavax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B+\u0008\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0096@\u00a2\u0006\u0002\u0010\u0018J\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001b0\u001a0\u0014H\u0096@\u00a2\u0006\u0002\u0010\u001cJ$\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u00142\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0096@\u00a2\u0006\u0002\u0010\"J\u001c\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@\u00a2\u0006\u0002\u0010$J\u001c\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@\u00a2\u0006\u0002\u0010$J \u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\'0\u00142\u0008\u0010(\u001a\u0004\u0018\u00010)H\u0096@\u00a2\u0006\u0002\u0010*J&\u0010+\u001a\u0008\u0012\u0004\u0012\u00020,0\u00142\u0008\u0010-\u001a\u0004\u0018\u00010\'2\u0006\u0010.\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010/J\u0014\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u0014H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u0016\u00101\u001a\u0008\u0012\u0004\u0012\u00020302H\u0082@\u00a2\u0006\u0004\u00084\u0010\u001cJ\u001c\u00105\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001b0\u001a02H\u0082@\u00a2\u0006\u0004\u00086\u0010\u001cJ\u000e\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001aH\u0002J>\u00108\u001a\u0008\u0012\u0004\u0012\u0002H90\u0014\"\u0004\u0008\u0000\u001092\"\u0010:\u001a\u001e\u0008\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H90=0<\u0012\u0006\u0012\u0004\u0018\u00010>0;H\u0082@\u00a2\u0006\u0002\u0010?R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006@"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;",
        "Lcom/stripe/android/customersheet/data/CustomerSheetInitializationDataSource;",
        "Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;",
        "Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;",
        "Lcom/stripe/android/customersheet/data/CustomerSheetIntentDataSource;",
        "elementsSessionRepository",
        "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
        "customerAdapter",
        "Lcom/stripe/android/customersheet/CustomerAdapter;",
        "errorReporter",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;Lcom/stripe/android/customersheet/CustomerAdapter;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V",
        "canCreateSetupIntents",
        "",
        "getCanCreateSetupIntents",
        "()Z",
        "loadCustomerSheetSession",
        "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;",
        "Lcom/stripe/android/customersheet/data/CustomerSheetSession;",
        "configuration",
        "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;",
        "(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "retrievePaymentMethods",
        "",
        "Lcom/stripe/android/model/PaymentMethod;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "updatePaymentMethod",
        "paymentMethodId",
        "",
        "params",
        "Lcom/stripe/android/model/PaymentMethodUpdateParams;",
        "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "attachPaymentMethod",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "detachPaymentMethod",
        "retrieveSavedSelection",
        "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
        "customerSessionElementsSession",
        "Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;",
        "(Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "setSavedSelection",
        "",
        "selection",
        "shouldSyncDefault",
        "(Lcom/stripe/android/paymentsheet/model/SavedSelection;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "retrieveSetupIntentClientSecret",
        "fetchElementsSession",
        "Lkotlin/Result;",
        "Lcom/stripe/android/model/ElementsSession;",
        "fetchElementsSession-IoAF18A",
        "fetchInitialPaymentMethods",
        "fetchInitialPaymentMethods-IoAF18A",
        "createPaymentMethodTypes",
        "runCatchingAdapterTask",
        "T",
        "task",
        "Lkotlin/Function1;",
        "Lkotlin/coroutines/Continuation;",
        "Lcom/stripe/android/customersheet/CustomerAdapter$Result;",
        "",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
.field private final canCreateSetupIntents:Z

.field private final customerAdapter:Lcom/stripe/android/customersheet/CustomerAdapter;

.field private final elementsSessionRepository:Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;

.field private final errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;Lcom/stripe/android/customersheet/CustomerAdapter;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V
    .locals 1
    .param p4    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "elementsSessionRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerAdapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->elementsSessionRepository:Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;

    .line 29
    iput-object p2, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->customerAdapter:Lcom/stripe/android/customersheet/CustomerAdapter;

    .line 30
    iput-object p3, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 31
    iput-object p4, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->workContext:Lkotlin/coroutines/CoroutineContext;

    .line 36
    invoke-interface {p2}, Lcom/stripe/android/customersheet/CustomerAdapter;->getCanCreateSetupIntents()Z

    move-result p1

    iput-boolean p1, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->canCreateSetupIntents:Z

    return-void
.end method

.method public static final synthetic access$fetchElementsSession-IoAF18A(Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 26
    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->fetchElementsSession-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$fetchInitialPaymentMethods-IoAF18A(Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 26
    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->fetchInitialPaymentMethods-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCustomerAdapter$p(Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;)Lcom/stripe/android/customersheet/CustomerAdapter;
    .locals 0

    .line 26
    iget-object p0, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->customerAdapter:Lcom/stripe/android/customersheet/CustomerAdapter;

    return-object p0
.end method

.method public static final synthetic access$runCatchingAdapterTask(Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->runCatchingAdapterTask(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final createPaymentMethodTypes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 159
    iget-object v0, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->customerAdapter:Lcom/stripe/android/customersheet/CustomerAdapter;

    invoke-interface {v0}, Lcom/stripe/android/customersheet/CustomerAdapter;->getCanCreateSetupIntents()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 160
    iget-object v0, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->customerAdapter:Lcom/stripe/android/customersheet/CustomerAdapter;

    invoke-interface {v0}, Lcom/stripe/android/customersheet/CustomerAdapter;->getPaymentMethodTypes()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    :cond_0
    return-object v0

    .line 163
    :cond_1
    const-string v0, "card"

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private final fetchElementsSession-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ElementsSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$fetchElementsSession$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$fetchElementsSession$1;

    iget v3, v2, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$fetchElementsSession$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v1, v2, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$fetchElementsSession$1;->label:I

    sub-int/2addr v1, v4

    iput v1, v2, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$fetchElementsSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$fetchElementsSession$1;

    invoke-direct {v2, v0, v1}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$fetchElementsSession$1;-><init>(Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v9, v2

    iget-object v1, v9, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$fetchElementsSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 115
    iget v3, v9, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$fetchElementsSession$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object v2, v9, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$fetchElementsSession$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/Result;

    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v1

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 116
    invoke-direct {v0}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->createPaymentMethodTypes()Ljava/util/List;

    move-result-object v12

    .line 117
    new-instance v1, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$DeferredIntent;

    .line 118
    new-instance v10, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

    .line 119
    new-instance v3, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Setup;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-direct {v3, v6, v6, v5, v6}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Setup;-><init>(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v11, v3

    check-cast v11, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;

    const/16 v16, 0x1c

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    .line 118
    invoke-direct/range {v10 .. v17}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 117
    invoke-direct {v1, v10}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$DeferredIntent;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;)V

    .line 124
    iget-object v3, v0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->elementsSessionRepository:Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;

    .line 127
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v7

    .line 128
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v6

    .line 125
    check-cast v1, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    .line 124
    iput-object v0, v9, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$fetchElementsSession$1;->L$0:Ljava/lang/Object;

    iput v4, v9, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$fetchElementsSession$1;->label:I

    const/4 v5, 0x0

    const/4 v8, 0x0

    move-object v4, v1

    invoke-interface/range {v3 .. v9}, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;->get-hUnOzRk(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_3

    return-object v2

    :cond_3
    move-object v2, v0

    .line 130
    :goto_1
    invoke-static {v1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    move-object v3, v1

    check-cast v3, Lcom/stripe/android/model/ElementsSession;

    .line 131
    iget-object v4, v2, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 132
    sget-object v3, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    move-object v5, v3

    check-cast v5, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 131
    invoke-static/range {v4 .. v9}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    .line 134
    :cond_4
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_5

    .line 135
    iget-object v4, v2, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 136
    sget-object v2, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    move-object v5, v2

    check-cast v5, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    .line 137
    sget-object v2, Lcom/stripe/android/core/exception/StripeException;->Companion:Lcom/stripe/android/core/exception/StripeException$Companion;

    invoke-virtual {v2, v3}, Lcom/stripe/android/core/exception/StripeException$Companion;->create(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    .line 135
    invoke-static/range {v4 .. v9}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    :cond_5
    return-object v1
.end method

.method private final fetchInitialPaymentMethods-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "+",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$fetchInitialPaymentMethods$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$fetchInitialPaymentMethods$1;

    iget v1, v0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$fetchInitialPaymentMethods$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$fetchInitialPaymentMethods$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$fetchInitialPaymentMethods$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$fetchInitialPaymentMethods$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$fetchInitialPaymentMethods$1;-><init>(Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$fetchInitialPaymentMethods$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 142
    iget v2, v0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$fetchInitialPaymentMethods$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$fetchInitialPaymentMethods$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 143
    iput-object p0, v0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$fetchInitialPaymentMethods$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$fetchInitialPaymentMethods$1;->label:I

    invoke-virtual {p0, v0}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->retrievePaymentMethods(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    .line 142
    :goto_1
    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    .line 181
    instance-of v1, p1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    if-eqz v1, :cond_4

    .line 182
    move-object v1, p1

    check-cast v1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    invoke-virtual {v1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 145
    iget-object v2, v0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 146
    sget-object v1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    move-object v3, v1

    check-cast v3, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 145
    invoke-static/range {v2 .. v7}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    .line 185
    :cond_4
    invoke-static {p1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResultKtxKt;->failureOrNull(Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;

    move-result-object v1

    if-eqz v1, :cond_7

    .line 186
    invoke-virtual {v1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;->getDisplayMessage()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_6

    .line 187
    invoke-virtual {v1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    instance-of v3, v2, Lcom/stripe/android/core/exception/StripeException;

    if-eqz v3, :cond_5

    check-cast v2, Lcom/stripe/android/core/exception/StripeException;

    goto :goto_2

    :cond_5
    const/4 v2, 0x0

    :goto_2
    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lcom/stripe/android/core/exception/StripeException;->getStripeError()Lcom/stripe/android/core/StripeError;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lcom/stripe/android/core/StripeError;->getMessage()Ljava/lang/String;

    .line 188
    :cond_6
    invoke-virtual {v1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    .line 150
    iget-object v2, v0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 151
    sget-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    .line 152
    sget-object v0, Lcom/stripe/android/core/exception/StripeException;->Companion:Lcom/stripe/android/core/exception/StripeException$Companion;

    invoke-virtual {v0, v1}, Lcom/stripe/android/core/exception/StripeException$Companion;->create(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    .line 150
    invoke-static/range {v2 .. v7}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    .line 155
    :cond_7
    invoke-interface {p1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;->toResult-d1pmJ48()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final runCatchingAdapterTask(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/CustomerAdapter$Result<",
            "TT;>;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult<",
            "TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 169
    iget-object v0, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$runCatchingAdapterTask$2;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$runCatchingAdapterTask$2;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public attachPaymentMethod(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 88
    new-instance v0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$attachPaymentMethod$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$attachPaymentMethod$2;-><init>(Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p2}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->runCatchingAdapterTask(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public detachPaymentMethod(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 92
    new-instance v0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$detachPaymentMethod$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$detachPaymentMethod$2;-><init>(Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p2}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->runCatchingAdapterTask(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getCanCreateSetupIntents()Z
    .locals 1

    .line 36
    iget-boolean v0, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->canCreateSetupIntents:Z

    return v0
.end method

.method public loadCustomerSheetSession(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult<",
            "Lcom/stripe/android/customersheet/data/CustomerSheetSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$1;

    iget v1, v0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$1;-><init>(Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v4, v0

    iget-object p2, v4, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 38
    iget v1, v4, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 41
    iget-object v1, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance p2, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;

    const/4 v3, 0x0

    invoke-direct {p2, p1, p0, v3}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$2;-><init>(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;Lkotlin/coroutines/Continuation;)V

    move-object v3, p2

    check-cast v3, Lkotlin/jvm/functions/Function2;

    iput v2, v4, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$loadCustomerSheetSession$1;->label:I

    const/4 v2, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/common/coroutines/CoroutinesKtxKt;->runCatching$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    .line 74
    :cond_3
    :goto_1
    invoke-static {p1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResultKtxKt;->toCustomerSheetDataResult(Ljava/lang/Object;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    move-result-object p1

    return-object p1
.end method

.method public retrievePaymentMethods(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult<",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 77
    new-instance v0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$retrievePaymentMethods$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$retrievePaymentMethods$2;-><init>(Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->runCatchingAdapterTask(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public retrieveSavedSelection(Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult<",
            "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 98
    new-instance p1, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$retrieveSavedSelection$2;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$retrieveSavedSelection$2;-><init>(Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->runCatchingAdapterTask(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public retrieveSetupIntentClientSecret(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 111
    new-instance v0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$retrieveSetupIntentClientSecret$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$retrieveSetupIntentClientSecret$2;-><init>(Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->runCatchingAdapterTask(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public setSavedSelection(Lcom/stripe/android/paymentsheet/model/SavedSelection;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult<",
            "Lkotlin/Unit;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 107
    new-instance p2, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$setSavedSelection$2;

    const/4 v0, 0x0

    invoke-direct {p2, p0, p1, v0}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$setSavedSelection$2;-><init>(Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;Lcom/stripe/android/paymentsheet/model/SavedSelection;Lkotlin/coroutines/Continuation;)V

    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, p2, p3}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->runCatchingAdapterTask(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public updatePaymentMethod(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/PaymentMethodUpdateParams;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 84
    new-instance v0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$updatePaymentMethod$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$updatePaymentMethod$2;-><init>(Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodUpdateParams;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p3}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->runCatchingAdapterTask(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
