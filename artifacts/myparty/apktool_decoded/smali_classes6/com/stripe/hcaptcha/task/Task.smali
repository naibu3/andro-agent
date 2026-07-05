.class public Lcom/stripe/hcaptcha/task/Task;
.super Ljava/lang/Object;
.source "Task.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Task.kt\ncom/stripe/hcaptcha/task/Task\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,202:1\n1863#2,2:203\n1863#2,2:205\n1863#2,2:207\n*S KotlinDebug\n*F\n+ 1 Task.kt\ncom/stripe/hcaptcha/task/Task\n*L\n86#1:203,2\n184#1:205,2\n191#1:207,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0017\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010\u0017\u001a\u00020\u0018H\u0002J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0008\u001a\u00028\u0000H\u0004\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u000bH\u0004J\u0008\u0010\u001c\u001a\u00020\u0018H\u0004J\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0004\u00a2\u0006\u0004\u0008 \u0010!J\u001a\u0010\"\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000eJ\u001a\u0010$\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000eJ\u0014\u0010%\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010&\u001a\u00020\u0010J\u0014\u0010\'\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010&\u001a\u00020\u0010J\u0014\u0010(\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010)\u001a\u00020\u0012J\u0014\u0010*\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010)\u001a\u00020\u0012J\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0000J\u0008\u0010,\u001a\u00020\u0018H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0008\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00100\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00120\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006-"
    }
    d2 = {
        "Lcom/stripe/hcaptcha/task/Task;",
        "TResult",
        "",
        "<init>",
        "()V",
        "isComplete",
        "",
        "isSuccessful",
        "result",
        "Ljava/lang/Object;",
        "exception",
        "Lcom/stripe/hcaptcha/HCaptchaException;",
        "onSuccessListeners",
        "",
        "Lcom/stripe/hcaptcha/task/OnSuccessListener;",
        "onFailureListeners",
        "Lcom/stripe/hcaptcha/task/OnFailureListener;",
        "onOpenListeners",
        "Lcom/stripe/hcaptcha/task/OnOpenListener;",
        "handler",
        "Landroid/os/Handler;",
        "getHandler",
        "()Landroid/os/Handler;",
        "reset",
        "",
        "setResult",
        "(Ljava/lang/Object;)V",
        "setException",
        "captchaOpened",
        "scheduleCaptchaExpired",
        "tokenExpiration",
        "Lkotlin/time/Duration;",
        "scheduleCaptchaExpired-LRDsOJo",
        "(J)V",
        "addOnSuccessListener",
        "onSuccessListener",
        "removeOnSuccessListener",
        "addOnFailureListener",
        "onFailureListener",
        "removeOnFailureListener",
        "addOnOpenListener",
        "onOpenListener",
        "removeOnOpenListener",
        "removeAllListeners",
        "tryCallbacks",
        "hcaptcha_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private exception:Lcom/stripe/hcaptcha/HCaptchaException;

.field private final handler:Landroid/os/Handler;

.field private isComplete:Z

.field private isSuccessful:Z

.field private final onFailureListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/hcaptcha/task/OnFailureListener;",
            ">;"
        }
    .end annotation
.end field

.field private final onOpenListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/hcaptcha/task/OnOpenListener;",
            ">;"
        }
    .end annotation
.end field

.field private final onSuccessListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/hcaptcha/task/OnSuccessListener<",
            "TTResult;>;>;"
        }
    .end annotation
.end field

.field private result:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TTResult;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$kHyR4BszhA3dZLtt4H8I8vVHNaU(Lcom/stripe/hcaptcha/task/Task;)V
    .locals 0

    invoke-static {p0}, Lcom/stripe/hcaptcha/task/Task;->scheduleCaptchaExpired_LRDsOJo$lambda$1(Lcom/stripe/hcaptcha/task/Task;)V

    return-void
.end method

.method protected constructor <init>()V
    .locals 2

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/stripe/hcaptcha/task/Task;->handler:Landroid/os/Handler;

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/stripe/hcaptcha/task/Task;->onSuccessListeners:Ljava/util/List;

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/stripe/hcaptcha/task/Task;->onFailureListeners:Ljava/util/List;

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/stripe/hcaptcha/task/Task;->onOpenListeners:Ljava/util/List;

    .line 48
    invoke-direct {p0}, Lcom/stripe/hcaptcha/task/Task;->reset()V

    return-void
.end method

.method private final reset()V
    .locals 1

    const/4 v0, 0x0

    .line 52
    iput-boolean v0, p0, Lcom/stripe/hcaptcha/task/Task;->isComplete:Z

    .line 53
    iput-boolean v0, p0, Lcom/stripe/hcaptcha/task/Task;->isSuccessful:Z

    const/4 v0, 0x0

    .line 54
    iput-object v0, p0, Lcom/stripe/hcaptcha/task/Task;->result:Ljava/lang/Object;

    .line 55
    iput-object v0, p0, Lcom/stripe/hcaptcha/task/Task;->exception:Lcom/stripe/hcaptcha/HCaptchaException;

    return-void
.end method

.method private static final scheduleCaptchaExpired_LRDsOJo$lambda$1(Lcom/stripe/hcaptcha/task/Task;)V
    .locals 5

    .line 97
    iget-object p0, p0, Lcom/stripe/hcaptcha/task/Task;->onFailureListeners:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/hcaptcha/task/OnFailureListener;

    .line 98
    new-instance v1, Lcom/stripe/hcaptcha/HCaptchaException;

    sget-object v2, Lcom/stripe/hcaptcha/HCaptchaError;->TOKEN_TIMEOUT:Lcom/stripe/hcaptcha/HCaptchaError;

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-direct {v1, v2, v4, v3, v4}, Lcom/stripe/hcaptcha/HCaptchaException;-><init>(Lcom/stripe/hcaptcha/HCaptchaError;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Lcom/stripe/hcaptcha/task/OnFailureListener;->onFailure(Lcom/stripe/hcaptcha/HCaptchaException;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final tryCallbacks()V
    .locals 5

    .line 183
    iget-object v0, p0, Lcom/stripe/hcaptcha/task/Task;->result:Ljava/lang/Object;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 184
    iget-object v3, p0, Lcom/stripe/hcaptcha/task/Task;->onSuccessListeners:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    .line 205
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/hcaptcha/task/OnSuccessListener;

    .line 185
    invoke-interface {v2, v0}, Lcom/stripe/hcaptcha/task/OnSuccessListener;->onSuccess(Ljava/lang/Object;)V

    move v2, v1

    goto :goto_0

    .line 190
    :cond_0
    iget-object v0, p0, Lcom/stripe/hcaptcha/task/Task;->exception:Lcom/stripe/hcaptcha/HCaptchaException;

    if-eqz v0, :cond_1

    .line 191
    iget-object v3, p0, Lcom/stripe/hcaptcha/task/Task;->onFailureListeners:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    .line 207
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/hcaptcha/task/OnFailureListener;

    .line 192
    invoke-interface {v2, v0}, Lcom/stripe/hcaptcha/task/OnFailureListener;->onFailure(Lcom/stripe/hcaptcha/HCaptchaException;)V

    move v2, v1

    goto :goto_1

    :cond_1
    if-eqz v2, :cond_2

    .line 198
    invoke-direct {p0}, Lcom/stripe/hcaptcha/task/Task;->reset()V

    :cond_2
    return-void
.end method


# virtual methods
.method public final addOnFailureListener(Lcom/stripe/hcaptcha/task/OnFailureListener;)Lcom/stripe/hcaptcha/task/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/hcaptcha/task/OnFailureListener;",
            ")",
            "Lcom/stripe/hcaptcha/task/Task<",
            "TTResult;>;"
        }
    .end annotation

    const-string v0, "onFailureListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    iget-object v0, p0, Lcom/stripe/hcaptcha/task/Task;->onFailureListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 133
    invoke-direct {p0}, Lcom/stripe/hcaptcha/task/Task;->tryCallbacks()V

    return-object p0
.end method

.method public final addOnOpenListener(Lcom/stripe/hcaptcha/task/OnOpenListener;)Lcom/stripe/hcaptcha/task/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/hcaptcha/task/OnOpenListener;",
            ")",
            "Lcom/stripe/hcaptcha/task/Task<",
            "TTResult;>;"
        }
    .end annotation

    const-string v0, "onOpenListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    iget-object v0, p0, Lcom/stripe/hcaptcha/task/Task;->onOpenListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 155
    invoke-direct {p0}, Lcom/stripe/hcaptcha/task/Task;->tryCallbacks()V

    return-object p0
.end method

.method public final addOnSuccessListener(Lcom/stripe/hcaptcha/task/OnSuccessListener;)Lcom/stripe/hcaptcha/task/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/hcaptcha/task/OnSuccessListener<",
            "TTResult;>;)",
            "Lcom/stripe/hcaptcha/task/Task<",
            "TTResult;>;"
        }
    .end annotation

    const-string v0, "onSuccessListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    iget-object v0, p0, Lcom/stripe/hcaptcha/task/Task;->onSuccessListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 111
    invoke-direct {p0}, Lcom/stripe/hcaptcha/task/Task;->tryCallbacks()V

    return-object p0
.end method

.method protected final captchaOpened()V
    .locals 2

    .line 86
    iget-object v0, p0, Lcom/stripe/hcaptcha/task/Task;->onOpenListeners:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 203
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/hcaptcha/task/OnOpenListener;

    .line 87
    invoke-interface {v1}, Lcom/stripe/hcaptcha/task/OnOpenListener;->onOpen()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected final getHandler()Landroid/os/Handler;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/stripe/hcaptcha/task/Task;->handler:Landroid/os/Handler;

    return-object v0
.end method

.method public final removeAllListeners()Lcom/stripe/hcaptcha/task/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/stripe/hcaptcha/task/Task<",
            "TTResult;>;"
        }
    .end annotation

    .line 174
    iget-object v0, p0, Lcom/stripe/hcaptcha/task/Task;->onSuccessListeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 175
    iget-object v0, p0, Lcom/stripe/hcaptcha/task/Task;->onFailureListeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 176
    iget-object v0, p0, Lcom/stripe/hcaptcha/task/Task;->onOpenListeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-object p0
.end method

.method public final removeOnFailureListener(Lcom/stripe/hcaptcha/task/OnFailureListener;)Lcom/stripe/hcaptcha/task/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/hcaptcha/task/OnFailureListener;",
            ")",
            "Lcom/stripe/hcaptcha/task/Task<",
            "TTResult;>;"
        }
    .end annotation

    const-string v0, "onFailureListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    iget-object v0, p0, Lcom/stripe/hcaptcha/task/Task;->onFailureListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final removeOnOpenListener(Lcom/stripe/hcaptcha/task/OnOpenListener;)Lcom/stripe/hcaptcha/task/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/hcaptcha/task/OnOpenListener;",
            ")",
            "Lcom/stripe/hcaptcha/task/Task<",
            "TTResult;>;"
        }
    .end annotation

    const-string v0, "onOpenListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    iget-object v0, p0, Lcom/stripe/hcaptcha/task/Task;->onOpenListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final removeOnSuccessListener(Lcom/stripe/hcaptcha/task/OnSuccessListener;)Lcom/stripe/hcaptcha/task/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/hcaptcha/task/OnSuccessListener<",
            "TTResult;>;)",
            "Lcom/stripe/hcaptcha/task/Task<",
            "TTResult;>;"
        }
    .end annotation

    const-string v0, "onSuccessListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    iget-object v0, p0, Lcom/stripe/hcaptcha/task/Task;->onSuccessListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-object p0
.end method

.method protected final scheduleCaptchaExpired-LRDsOJo(J)V
    .locals 2

    .line 96
    iget-object v0, p0, Lcom/stripe/hcaptcha/task/Task;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/stripe/hcaptcha/task/Task$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lcom/stripe/hcaptcha/task/Task$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/hcaptcha/task/Task;)V

    .line 100
    invoke-static {p1, p2}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    move-result-wide p1

    .line 96
    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method protected final setException(Lcom/stripe/hcaptcha/HCaptchaException;)V
    .locals 1

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    iput-object p1, p0, Lcom/stripe/hcaptcha/task/Task;->exception:Lcom/stripe/hcaptcha/HCaptchaException;

    const/4 p1, 0x0

    .line 77
    iput-boolean p1, p0, Lcom/stripe/hcaptcha/task/Task;->isSuccessful:Z

    const/4 p1, 0x1

    .line 78
    iput-boolean p1, p0, Lcom/stripe/hcaptcha/task/Task;->isComplete:Z

    .line 79
    invoke-direct {p0}, Lcom/stripe/hcaptcha/task/Task;->tryCallbacks()V

    return-void
.end method

.method protected final setResult(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)V"
        }
    .end annotation

    .line 64
    iput-object p1, p0, Lcom/stripe/hcaptcha/task/Task;->result:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 65
    iput-boolean p1, p0, Lcom/stripe/hcaptcha/task/Task;->isSuccessful:Z

    .line 66
    iput-boolean p1, p0, Lcom/stripe/hcaptcha/task/Task;->isComplete:Z

    .line 67
    invoke-direct {p0}, Lcom/stripe/hcaptcha/task/Task;->tryCallbacks()V

    return-void
.end method
