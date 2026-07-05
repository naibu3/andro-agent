.class public final Lcom/stripe/android/cards/CardAccountRangeService;
.super Ljava/lang/Object;
.source "CardAccountRangeService.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;,
        Lcom/stripe/android/cards/CardAccountRangeService$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCardAccountRangeService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardAccountRangeService.kt\ncom/stripe/android/cards/CardAccountRangeService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n774#2:134\n865#2,2:135\n*S KotlinDebug\n*F\n+ 1 CardAccountRangeService.kt\ncom/stripe/android/cards/CardAccountRangeService\n*L\n107#1:134\n107#1:135,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001:\u00013BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-J\u000e\u0010.\u001a\u00020+2\u0006\u0010,\u001a\u00020-J\u0006\u0010/\u001a\u00020+J\u0014\u00100\u001a\u00020+2\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001aJ\u0016\u00101\u001a\u00020\r2\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0010\u00102\u001a\u00020\r2\u0006\u0010,\u001a\u00020-H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a2\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001b8F\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010!R&\u0010\"\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'\"\u0004\u0008(\u0010)\u00a8\u00064"
    }
    d2 = {
        "Lcom/stripe/android/cards/CardAccountRangeService;",
        "",
        "cardAccountRangeRepository",
        "Lcom/stripe/android/cards/CardAccountRangeRepository;",
        "uiContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "workContext",
        "staticCardAccountRanges",
        "Lcom/stripe/android/cards/StaticCardAccountRanges;",
        "accountRangeResultListener",
        "Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;",
        "isCbcEligible",
        "Lkotlin/Function0;",
        "",
        "cardBrandFilter",
        "Lcom/stripe/android/CardBrandFilter;",
        "<init>",
        "(Lcom/stripe/android/cards/CardAccountRangeRepository;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/StaticCardAccountRanges;Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/CardBrandFilter;)V",
        "getStaticCardAccountRanges",
        "()Lcom/stripe/android/cards/StaticCardAccountRanges;",
        "isLoading",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "lastBin",
        "Lcom/stripe/android/cards/Bin;",
        "value",
        "",
        "Lcom/stripe/android/model/AccountRange;",
        "accountRanges",
        "getAccountRanges",
        "()Ljava/util/List;",
        "accountRange",
        "getAccountRange",
        "()Lcom/stripe/android/model/AccountRange;",
        "accountRangeRepositoryJob",
        "Lkotlinx/coroutines/Job;",
        "getAccountRangeRepositoryJob$annotations",
        "()V",
        "getAccountRangeRepositoryJob",
        "()Lkotlinx/coroutines/Job;",
        "setAccountRangeRepositoryJob",
        "(Lkotlinx/coroutines/Job;)V",
        "onCardNumberChanged",
        "",
        "cardNumber",
        "Lcom/stripe/android/cards/CardNumber$Unvalidated;",
        "queryAccountRangeRepository",
        "cancelAccountRangeRepositoryJob",
        "updateAccountRangesResult",
        "shouldQueryRepository",
        "shouldQueryAccountRange",
        "AccountRangeResultListener",
        "payments-core_release"
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
.field private accountRangeRepositoryJob:Lkotlinx/coroutines/Job;

.field private final accountRangeResultListener:Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;

.field private accountRanges:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/model/AccountRange;",
            ">;"
        }
    .end annotation
.end field

.field private final cardAccountRangeRepository:Lcom/stripe/android/cards/CardAccountRangeRepository;

.field private final cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

.field private final isCbcEligible:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final isLoading:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private lastBin:Lcom/stripe/android/cards/Bin;

.field private final staticCardAccountRanges:Lcom/stripe/android/cards/StaticCardAccountRanges;

.field private final uiContext:Lkotlin/coroutines/CoroutineContext;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/cards/CardAccountRangeRepository;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/StaticCardAccountRanges;Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/CardBrandFilter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/cards/CardAccountRangeRepository;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lcom/stripe/android/cards/StaticCardAccountRanges;",
            "Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/stripe/android/CardBrandFilter;",
            ")V"
        }
    .end annotation

    const-string v0, "cardAccountRangeRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "staticCardAccountRanges"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accountRangeResultListener"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isCbcEligible"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardBrandFilter"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/stripe/android/cards/CardAccountRangeService;->cardAccountRangeRepository:Lcom/stripe/android/cards/CardAccountRangeRepository;

    .line 21
    iput-object p2, p0, Lcom/stripe/android/cards/CardAccountRangeService;->uiContext:Lkotlin/coroutines/CoroutineContext;

    .line 22
    iput-object p3, p0, Lcom/stripe/android/cards/CardAccountRangeService;->workContext:Lkotlin/coroutines/CoroutineContext;

    .line 23
    iput-object p4, p0, Lcom/stripe/android/cards/CardAccountRangeService;->staticCardAccountRanges:Lcom/stripe/android/cards/StaticCardAccountRanges;

    .line 24
    iput-object p5, p0, Lcom/stripe/android/cards/CardAccountRangeService;->accountRangeResultListener:Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;

    .line 25
    iput-object p6, p0, Lcom/stripe/android/cards/CardAccountRangeService;->isCbcEligible:Lkotlin/jvm/functions/Function0;

    .line 26
    iput-object p7, p0, Lcom/stripe/android/cards/CardAccountRangeService;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    .line 29
    invoke-interface {p1}, Lcom/stripe/android/cards/CardAccountRangeRepository;->getLoading()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/cards/CardAccountRangeService;->isLoading:Lkotlinx/coroutines/flow/StateFlow;

    .line 32
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/cards/CardAccountRangeService;->accountRanges:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/cards/CardAccountRangeRepository;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/StaticCardAccountRanges;Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/CardBrandFilter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_0

    .line 26
    sget-object v0, Lcom/stripe/android/DefaultCardBrandFilter;->INSTANCE:Lcom/stripe/android/DefaultCardBrandFilter;

    check-cast v0, Lcom/stripe/android/CardBrandFilter;

    move-object v8, v0

    goto :goto_0

    :cond_0
    move-object/from16 v8, p7

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    .line 19
    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/cards/CardAccountRangeService;-><init>(Lcom/stripe/android/cards/CardAccountRangeRepository;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/StaticCardAccountRanges;Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/CardBrandFilter;)V

    return-void
.end method

.method public static final synthetic access$getCardAccountRangeRepository$p(Lcom/stripe/android/cards/CardAccountRangeService;)Lcom/stripe/android/cards/CardAccountRangeRepository;
    .locals 0

    .line 18
    iget-object p0, p0, Lcom/stripe/android/cards/CardAccountRangeService;->cardAccountRangeRepository:Lcom/stripe/android/cards/CardAccountRangeRepository;

    return-object p0
.end method

.method public static final synthetic access$getUiContext$p(Lcom/stripe/android/cards/CardAccountRangeService;)Lkotlin/coroutines/CoroutineContext;
    .locals 0

    .line 18
    iget-object p0, p0, Lcom/stripe/android/cards/CardAccountRangeService;->uiContext:Lkotlin/coroutines/CoroutineContext;

    return-object p0
.end method

.method public static synthetic getAccountRangeRepositoryJob$annotations()V
    .locals 0

    return-void
.end method

.method private final shouldQueryAccountRange(Lcom/stripe/android/cards/CardNumber$Unvalidated;)Z
    .locals 2

    .line 120
    invoke-virtual {p0}, Lcom/stripe/android/cards/CardAccountRangeService;->getAccountRange()Lcom/stripe/android/model/AccountRange;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 121
    invoke-virtual {p1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getBin()Lcom/stripe/android/cards/Bin;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 122
    invoke-virtual {p0}, Lcom/stripe/android/cards/CardAccountRangeService;->getAccountRange()Lcom/stripe/android/model/AccountRange;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/model/AccountRange;->getBinRange()Lcom/stripe/android/model/BinRange;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/stripe/android/model/BinRange;->matches(Lcom/stripe/android/cards/CardNumber$Unvalidated;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 123
    :cond_0
    invoke-virtual {p1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getBin()Lcom/stripe/android/cards/Bin;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/cards/CardAccountRangeService;->lastBin:Lcom/stripe/android/cards/Bin;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 124
    :goto_1
    invoke-virtual {p1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getBin()Lcom/stripe/android/cards/Bin;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/cards/CardAccountRangeService;->lastBin:Lcom/stripe/android/cards/Bin;

    return v0
.end method

.method private final shouldQueryRepository(Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/AccountRange;",
            ">;)Z"
        }
    .end annotation

    .line 113
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/AccountRange;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/model/AccountRange;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    const/4 p1, -0x1

    goto :goto_1

    :cond_1
    sget-object v0, Lcom/stripe/android/cards/CardAccountRangeService$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/stripe/android/model/CardBrand;->ordinal()I

    move-result p1

    aget p1, v0, p1

    :goto_1
    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v1, 0x2

    if-eq p1, v1, :cond_2

    const/4 p1, 0x0

    return p1

    :cond_2
    return v0
.end method


# virtual methods
.method public final cancelAccountRangeRepositoryJob()V
    .locals 3

    .line 102
    iget-object v0, p0, Lcom/stripe/android/cards/CardAccountRangeService;->accountRangeRepositoryJob:Lkotlinx/coroutines/Job;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/Job$DefaultImpls;->cancel$default(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 103
    :cond_0
    iput-object v1, p0, Lcom/stripe/android/cards/CardAccountRangeService;->accountRangeRepositoryJob:Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final getAccountRange()Lcom/stripe/android/model/AccountRange;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/stripe/android/cards/CardAccountRangeService;->accountRanges:Ljava/util/List;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/AccountRange;

    return-object v0
.end method

.method public final getAccountRangeRepositoryJob()Lkotlinx/coroutines/Job;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/stripe/android/cards/CardAccountRangeService;->accountRangeRepositoryJob:Lkotlinx/coroutines/Job;

    return-object v0
.end method

.method public final getAccountRanges()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/AccountRange;",
            ">;"
        }
    .end annotation

    .line 32
    iget-object v0, p0, Lcom/stripe/android/cards/CardAccountRangeService;->accountRanges:Ljava/util/List;

    return-object v0
.end method

.method public final getStaticCardAccountRanges()Lcom/stripe/android/cards/StaticCardAccountRanges;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/stripe/android/cards/CardAccountRangeService;->staticCardAccountRanges:Lcom/stripe/android/cards/StaticCardAccountRanges;

    return-object v0
.end method

.method public final isLoading()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 29
    iget-object v0, p0, Lcom/stripe/android/cards/CardAccountRangeService;->isLoading:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final onCardNumberChanged(Lcom/stripe/android/cards/CardNumber$Unvalidated;)V
    .locals 3

    const-string v0, "cardNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    iget-object v0, p0, Lcom/stripe/android/cards/CardAccountRangeService;->isCbcEligible:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 44
    invoke-virtual {p1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getLength()I

    move-result v1

    const/16 v2, 0x8

    if-lt v1, v2, :cond_0

    goto :goto_0

    .line 46
    :cond_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/cards/CardAccountRangeService;->updateAccountRangesResult(Ljava/util/List;)V

    return-void

    .line 50
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/stripe/android/cards/CardAccountRangeService;->isCbcEligible:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 51
    sget-object v1, Lcom/stripe/android/cards/CbcTestCardDelegate;->INSTANCE:Lcom/stripe/android/cards/CbcTestCardDelegate;

    invoke-virtual {v1, p1}, Lcom/stripe/android/cards/CbcTestCardDelegate;->onCardNumberChanged(Lcom/stripe/android/cards/CardNumber$Unvalidated;)Ljava/util/List;

    move-result-object v1

    goto :goto_1

    .line 53
    :cond_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    .line 56
    :goto_1
    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    .line 57
    invoke-virtual {p0, v1}, Lcom/stripe/android/cards/CardAccountRangeService;->updateAccountRangesResult(Ljava/util/List;)V

    return-void

    .line 61
    :cond_3
    iget-object v1, p0, Lcom/stripe/android/cards/CardAccountRangeService;->staticCardAccountRanges:Lcom/stripe/android/cards/StaticCardAccountRanges;

    invoke-interface {v1, p1}, Lcom/stripe/android/cards/StaticCardAccountRanges;->filter(Lcom/stripe/android/cards/CardNumber$Unvalidated;)Ljava/util/List;

    move-result-object v1

    if-eqz v0, :cond_4

    .line 64
    invoke-virtual {p0, p1}, Lcom/stripe/android/cards/CardAccountRangeService;->queryAccountRangeRepository(Lcom/stripe/android/cards/CardNumber$Unvalidated;)V

    return-void

    .line 66
    :cond_4
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-direct {p0, v1}, Lcom/stripe/android/cards/CardAccountRangeService;->shouldQueryRepository(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_2

    .line 71
    :cond_5
    invoke-virtual {p0, v1}, Lcom/stripe/android/cards/CardAccountRangeService;->updateAccountRangesResult(Ljava/util/List;)V

    return-void

    .line 68
    :cond_6
    :goto_2
    invoke-virtual {p0, p1}, Lcom/stripe/android/cards/CardAccountRangeService;->queryAccountRangeRepository(Lcom/stripe/android/cards/CardNumber$Unvalidated;)V

    return-void
.end method

.method public final synthetic queryAccountRangeRepository(Lcom/stripe/android/cards/CardNumber$Unvalidated;)V
    .locals 7

    const-string v0, "cardNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-direct {p0, p1}, Lcom/stripe/android/cards/CardAccountRangeService;->shouldQueryAccountRange(Lcom/stripe/android/cards/CardNumber$Unvalidated;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 80
    invoke-virtual {p0}, Lcom/stripe/android/cards/CardAccountRangeService;->cancelAccountRangeRepositoryJob()V

    .line 83
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/cards/CardAccountRangeService;->accountRanges:Ljava/util/List;

    .line 85
    iget-object v0, p0, Lcom/stripe/android/cards/CardAccountRangeService;->workContext:Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/cards/CardAccountRangeService$queryAccountRangeRepository$1;

    const/4 v2, 0x0

    invoke-direct {v0, p1, p0, v2}, Lcom/stripe/android/cards/CardAccountRangeService$queryAccountRangeRepository$1;-><init>(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lcom/stripe/android/cards/CardAccountRangeService;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/cards/CardAccountRangeService;->accountRangeRepositoryJob:Lkotlinx/coroutines/Job;

    :cond_0
    return-void
.end method

.method public final setAccountRangeRepositoryJob(Lkotlinx/coroutines/Job;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/stripe/android/cards/CardAccountRangeService;->accountRangeRepositoryJob:Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final updateAccountRangesResult(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/AccountRange;",
            ">;)V"
        }
    .end annotation

    const-string v0, "accountRanges"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    .line 134
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 135
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/model/AccountRange;

    .line 107
    iget-object v4, p0, Lcom/stripe/android/cards/CardAccountRangeService;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    invoke-virtual {v3}, Lcom/stripe/android/model/AccountRange;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v3

    invoke-interface {v4, v3}, Lcom/stripe/android/CardBrandFilter;->isAccepted(Lcom/stripe/android/model/CardBrand;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 135
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 136
    :cond_1
    check-cast v1, Ljava/util/List;

    .line 107
    iput-object v1, p0, Lcom/stripe/android/cards/CardAccountRangeService;->accountRanges:Ljava/util/List;

    .line 108
    iget-object v0, p0, Lcom/stripe/android/cards/CardAccountRangeService;->accountRangeResultListener:Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;

    invoke-interface {v0, v1, p1}, Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;->onAccountRangesResult(Ljava/util/List;Ljava/util/List;)V

    return-void
.end method
