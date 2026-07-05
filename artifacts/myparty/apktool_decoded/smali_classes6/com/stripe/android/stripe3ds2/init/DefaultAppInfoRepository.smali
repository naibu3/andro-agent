.class public final Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;
.super Ljava/lang/Object;
.source "DefaultAppInfoRepository.kt"

# interfaces
.implements Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Companion;,
        Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 \u00132\u00020\u0001:\u0002\u0012\u0013B!\u0008\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tB\u0019\u0008\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\u000cB!\u0008\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0010J\u0008\u0010\u0011\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;",
        "Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;",
        "store",
        "Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;",
        "appVersion",
        "",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "<init>",
        "(Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;ILkotlin/coroutines/CoroutineContext;)V",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V",
        "(Landroid/content/Context;ILkotlin/coroutines/CoroutineContext;)V",
        "get",
        "Lcom/stripe/android/stripe3ds2/init/AppInfo;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "initAppInfo",
        "Store",
        "Companion",
        "3ds2sdk_release"
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
.field private static final Companion:Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Companion;

.field private static final INVALID_VERSION_CODE:I = -0x1


# instance fields
.field private final appVersion:I

.field private final store:Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;->Companion:Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILkotlin/coroutines/CoroutineContext;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store$Default;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store$Default;-><init>(Landroid/content/Context;ILkotlin/coroutines/CoroutineContext;)V

    check-cast v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;

    .line 37
    invoke-direct {p0, v0, p2, p3}, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;-><init>(Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;ILkotlin/coroutines/CoroutineContext;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    sget-object v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;->Companion:Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Companion;

    invoke-static {v0, p1}, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Companion;->access$getAppVersion(Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Companion;Landroid/content/Context;)I

    move-result v0

    .line 27
    invoke-direct {p0, p1, v0, p2}, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;-><init>(Landroid/content/Context;ILkotlin/coroutines/CoroutineContext;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;ILkotlin/coroutines/CoroutineContext;)V
    .locals 7

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;->store:Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;

    .line 20
    iput p2, p0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;->appVersion:I

    .line 48
    invoke-static {p3}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance p1, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$1;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$1;-><init>(Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;Lkotlin/coroutines/Continuation;)V

    move-object v4, p1

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public static final synthetic access$getAppVersion$p(Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;)I
    .locals 0

    .line 18
    iget p0, p0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;->appVersion:I

    return p0
.end method

.method public static final synthetic access$getStore$p(Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;)Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;
    .locals 0

    .line 18
    iget-object p0, p0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;->store:Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;

    return-object p0
.end method

.method public static final synthetic access$initAppInfo(Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;)Lcom/stripe/android/stripe3ds2/init/AppInfo;
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;->initAppInfo()Lcom/stripe/android/stripe3ds2/init/AppInfo;

    move-result-object p0

    return-object p0
.end method

.method private final initAppInfo()Lcom/stripe/android/stripe3ds2/init/AppInfo;
    .locals 3

    .line 65
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/AppInfo;

    .line 66
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "toString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    iget v2, p0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;->appVersion:I

    .line 65
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/stripe3ds2/init/AppInfo;-><init>(Ljava/lang/String;I)V

    .line 69
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;->store:Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;

    invoke-interface {v1, v0}, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;->save(Lcom/stripe/android/stripe3ds2/init/AppInfo;)V

    return-object v0
.end method


# virtual methods
.method public get(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/stripe3ds2/init/AppInfo;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$get$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$get$1;

    iget v1, v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$get$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$get$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$get$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$get$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$get$1;-><init>(Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$get$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 60
    iget v2, v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$get$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$get$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 61
    iget-object p1, p0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;->store:Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;

    iput-object p0, v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$get$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$get$1;->label:I

    invoke-interface {p1, v0}, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;->get(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    check-cast p1, Lcom/stripe/android/stripe3ds2/init/AppInfo;

    if-nez p1, :cond_4

    invoke-direct {v0}, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;->initAppInfo()Lcom/stripe/android/stripe3ds2/init/AppInfo;

    move-result-object p1

    :cond_4
    return-object p1
.end method
