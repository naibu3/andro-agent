.class public final Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;
.super Ljava/lang/Object;
.source "CustomerSessionSavedSelectionDataSource.kt"

# interfaces
.implements Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCustomerSessionSavedSelectionDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerSessionSavedSelectionDataSource.kt\ncom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource\n+ 2 CustomerSheetDataResultKtx.kt\ncom/stripe/android/customersheet/data/CustomerSheetDataResultKtxKt\n*L\n1#1,116:1\n42#2,2:117\n92#2,5:119\n44#2,3:124\n42#2,2:127\n92#2,5:129\n44#2,3:134\n*S KotlinDebug\n*F\n+ 1 CustomerSessionSavedSelectionDataSource.kt\ncom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource\n*L\n55#1:117,2\n55#1:119,5\n55#1:124,3\n86#1:127,2\n86#1:129,5\n86#1:134,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B<\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\u0008\n\u0012\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ \u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096@\u00a2\u0006\u0002\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0016\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0082@\u00a2\u0006\u0002\u0010\u0019J&\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u00102\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001d\u001a\u00020\u001eH\u0096@\u00a2\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0011H\u0082@\u00a2\u0006\u0002\u0010!J \u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0011H\u0082@\u00a2\u0006\u0002\u0010%J\u0014\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0010H\u0082@\u00a2\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\u0008\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;",
        "Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;",
        "elementsSessionManager",
        "Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;",
        "customerRepository",
        "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
        "prefsRepositoryFactory",
        "Lkotlin/Function1;",
        "",
        "Lcom/stripe/android/paymentsheet/PrefsRepository;",
        "Lkotlin/jvm/JvmSuppressWildcards;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "<init>",
        "(Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/CoroutineContext;)V",
        "retrieveSavedSelection",
        "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;",
        "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
        "customerSessionElementsSession",
        "Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;",
        "(Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "useDefaultPaymentMethodFromBackend",
        "customer",
        "Lcom/stripe/android/model/ElementsSession$Customer;",
        "useLocallySavedSelection",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "setSavedSelection",
        "",
        "selection",
        "shouldSyncDefault",
        "",
        "(Lcom/stripe/android/paymentsheet/model/SavedSelection;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "saveSelectionToPrefs",
        "(Lcom/stripe/android/paymentsheet/model/SavedSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "saveSelectionToBackend",
        "ephemeralKey",
        "Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;",
        "(Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;Lcom/stripe/android/paymentsheet/model/SavedSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createPrefsRepository",
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
.field private final customerRepository:Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

.field private final elementsSessionManager:Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;

.field private final prefsRepositoryFactory:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/CoroutineContext;)V
    .locals 1
    .param p4    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;",
            "Lkotlin/coroutines/CoroutineContext;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "elementsSessionManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prefsRepositoryFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;->elementsSessionManager:Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;

    .line 18
    iput-object p2, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;->customerRepository:Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

    .line 19
    iput-object p3, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;->prefsRepositoryFactory:Lkotlin/jvm/functions/Function1;

    .line 20
    iput-object p4, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;->workContext:Lkotlin/coroutines/CoroutineContext;

    return-void
.end method

.method public static final synthetic access$createPrefsRepository(Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;->createPrefsRepository(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getElementsSessionManager$p(Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;)Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;
    .locals 0

    .line 16
    iget-object p0, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;->elementsSessionManager:Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;

    return-object p0
.end method

.method public static final synthetic access$saveSelectionToBackend(Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;Lcom/stripe/android/paymentsheet/model/SavedSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 16
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;->saveSelectionToBackend(Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;Lcom/stripe/android/paymentsheet/model/SavedSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$saveSelectionToPrefs(Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;Lcom/stripe/android/paymentsheet/model/SavedSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 16
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;->saveSelectionToPrefs(Lcom/stripe/android/paymentsheet/model/SavedSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$useDefaultPaymentMethodFromBackend(Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;Lcom/stripe/android/model/ElementsSession$Customer;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;->useDefaultPaymentMethodFromBackend(Lcom/stripe/android/model/ElementsSession$Customer;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$useLocallySavedSelection(Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;->useLocallySavedSelection(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final createPrefsRepository(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult<",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$createPrefsRepository$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$createPrefsRepository$1;

    iget v1, v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$createPrefsRepository$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$createPrefsRepository$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$createPrefsRepository$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$createPrefsRepository$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$createPrefsRepository$1;-><init>(Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$createPrefsRepository$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 110
    iget v2, v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$createPrefsRepository$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$createPrefsRepository$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;

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

    .line 111
    iget-object p1, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;->elementsSessionManager:Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;

    iput-object p0, v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$createPrefsRepository$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$createPrefsRepository$1;->label:I

    invoke-interface {p1, v0}, Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;->fetchCustomerSessionEphemeralKey-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p1, Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;

    .line 112
    iget-object v0, v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;->prefsRepositoryFactory:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;->getCustomerId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/PrefsRepository;

    .line 111
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    :cond_4
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 113
    :goto_2
    invoke-static {p1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResultKtxKt;->toCustomerSheetDataResult(Ljava/lang/Object;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    move-result-object p1

    return-object p1
.end method

.method private final saveSelectionToBackend(Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;Lcom/stripe/android/paymentsheet/model/SavedSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;",
            "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$saveSelectionToBackend$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$saveSelectionToBackend$1;

    iget v1, v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$saveSelectionToBackend$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$saveSelectionToBackend$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$saveSelectionToBackend$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$saveSelectionToBackend$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$saveSelectionToBackend$1;-><init>(Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$saveSelectionToBackend$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 95
    iget v2, v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$saveSelectionToBackend$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 99
    instance-of p3, p2, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;

    const/4 v2, 0x0

    if-eqz p3, :cond_3

    check-cast p2, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;

    goto :goto_1

    :cond_3
    move-object p2, v2

    :goto_1
    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;->getId()Ljava/lang/String;

    move-result-object v2

    .line 100
    :cond_4
    iget-object p2, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;->customerRepository:Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

    .line 102
    new-instance p3, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;

    .line 103
    invoke-virtual {p1}, Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;->getCustomerId()Ljava/lang/String;

    move-result-object v4

    .line 104
    invoke-virtual {p1}, Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;->getEphemeralKey()Ljava/lang/String;

    move-result-object v5

    .line 105
    invoke-virtual {p1}, Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;->getCustomerSessionClientSecret()Ljava/lang/String;

    move-result-object p1

    .line 102
    invoke-direct {p3, v4, v5, p1}, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    iput v3, v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$saveSelectionToBackend$1;->label:I

    invoke-interface {p2, p3, v2, v0}, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;->setDefaultPaymentMethod-0E7RQCE(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    .line 107
    :cond_5
    :goto_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 108
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final saveSelectionToPrefs(Lcom/stripe/android/paymentsheet/model/SavedSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "Unable to persist payment option "

    instance-of v1, p2, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$saveSelectionToPrefs$1;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$saveSelectionToPrefs$1;

    iget v2, v1, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$saveSelectionToPrefs$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget p2, v1, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$saveSelectionToPrefs$1;->label:I

    sub-int/2addr p2, v3

    iput p2, v1, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$saveSelectionToPrefs$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$saveSelectionToPrefs$1;

    invoke-direct {v1, p0, p2}, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$saveSelectionToPrefs$1;-><init>(Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v1, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$saveSelectionToPrefs$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 83
    iget v3, v1, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$saveSelectionToPrefs$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object p1, v1, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$saveSelectionToPrefs$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/paymentsheet/model/SavedSelection;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 86
    iput-object p1, v1, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$saveSelectionToPrefs$1;->L$0:Ljava/lang/Object;

    iput v4, v1, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$saveSelectionToPrefs$1;->label:I

    invoke-direct {p0, v1}, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;->createPrefsRepository(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v2, :cond_3

    return-object v2

    .line 83
    :cond_3
    :goto_1
    check-cast p2, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    .line 128
    instance-of v1, p2, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    if-eqz v1, :cond_6

    .line 129
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 130
    sget-object v1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;->Companion:Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;

    check-cast p2, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    .line 128
    invoke-virtual {p2}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/paymentsheet/PrefsRepository;

    .line 87
    invoke-interface {p2, p1}, Lcom/stripe/android/paymentsheet/PrefsRepository;->setSavedSelection(Lcom/stripe/android/paymentsheet/model/SavedSelection;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 92
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 130
    invoke-virtual {v1, p1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;->success(Ljava/lang/Object;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    move-result-object p1

    .line 129
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    .line 90
    :cond_4
    new-instance p2, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p1

    .line 129
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 131
    :goto_2
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_5

    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    .line 132
    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    goto :goto_3

    .line 133
    :cond_5
    sget-object p1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;->Companion:Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;->failure(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    goto :goto_3

    .line 134
    :cond_6
    instance-of p1, p2, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;

    if-eqz p1, :cond_7

    sget-object p1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;->Companion:Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;

    .line 135
    check-cast p2, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;

    invoke-virtual {p2}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 136
    invoke-virtual {p2}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;->getDisplayMessage()Ljava/lang/String;

    move-result-object p2

    .line 134
    invoke-virtual {p1, v0, p2}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;->failure(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    .line 93
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 127
    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final useDefaultPaymentMethodFromBackend(Lcom/stripe/android/model/ElementsSession$Customer;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ElementsSession$Customer;",
            ")",
            "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult<",
            "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
            ">;"
        }
    .end annotation

    .line 48
    invoke-virtual {p1}, Lcom/stripe/android/model/ElementsSession$Customer;->getPaymentMethods()Ljava/util/List;

    move-result-object v0

    .line 49
    invoke-virtual {p1}, Lcom/stripe/android/model/ElementsSession$Customer;->getDefaultPaymentMethod()Ljava/lang/String;

    move-result-object p1

    .line 47
    invoke-static {v0, p1}, Lcom/stripe/android/customersheet/util/SyncDefaultPaymentMethodUtilsKt;->getDefaultPaymentMethodAsPaymentSelection(Ljava/util/List;Ljava/lang/String;)Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 50
    invoke-static {p1}, Lcom/stripe/android/paymentsheet/model/SavedSelectionKt;->toSavedSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/paymentsheet/model/SavedSelection;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 51
    :goto_0
    sget-object v0, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;->Companion:Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;->success(Ljava/lang/Object;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    return-object p1
.end method

.method private final useLocallySavedSelection(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult<",
            "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$useLocallySavedSelection$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$useLocallySavedSelection$1;

    iget v1, v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$useLocallySavedSelection$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$useLocallySavedSelection$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$useLocallySavedSelection$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$useLocallySavedSelection$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$useLocallySavedSelection$1;-><init>(Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$useLocallySavedSelection$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 54
    iget v2, v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$useLocallySavedSelection$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$useLocallySavedSelection$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 55
    iput v4, v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$useLocallySavedSelection$1;->label:I

    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;->createPrefsRepository(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    .line 54
    :cond_4
    :goto_1
    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    .line 118
    instance-of v2, p1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    if-eqz v2, :cond_7

    .line 119
    :try_start_1
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 120
    sget-object v2, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;->Companion:Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;

    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    .line 118
    invoke-virtual {p1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/PrefsRepository;

    .line 56
    iput-object v2, v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$useLocallySavedSelection$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$useLocallySavedSelection$1;->label:I

    const/4 v3, 0x0

    invoke-interface {p1, v4, v3, v0}, Lcom/stripe/android/paymentsheet/PrefsRepository;->getSavedSelection(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v0, v2

    .line 54
    :goto_3
    check-cast p1, Lcom/stripe/android/paymentsheet/model/SavedSelection;

    .line 120
    invoke-virtual {v0, p1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;->success(Ljava/lang/Object;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    move-result-object p1

    .line 119
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_5

    :goto_4
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 121
    :goto_5
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_6

    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    .line 122
    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    goto :goto_6

    .line 123
    :cond_6
    sget-object p1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;->Companion:Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;->failure(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    :goto_6
    return-object p1

    .line 124
    :cond_7
    instance-of v0, p1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;

    if-eqz v0, :cond_8

    sget-object v0, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;->Companion:Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;

    .line 125
    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    .line 126
    invoke-virtual {p1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;->getDisplayMessage()Ljava/lang/String;

    move-result-object p1

    .line 124
    invoke-virtual {v0, v1, p1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;->failure(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    return-object p1

    .line 117
    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public retrieveSavedSelection(Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
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

    .line 25
    iget-object v0, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$retrieveSavedSelection$2;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$retrieveSavedSelection$2;-><init>(Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public setSavedSelection(Lcom/stripe/android/paymentsheet/model/SavedSelection;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
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

    .line 72
    iget-object v0, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$setSavedSelection$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p2, p1, v2}, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$setSavedSelection$2;-><init>(Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;ZLcom/stripe/android/paymentsheet/model/SavedSelection;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p3}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
