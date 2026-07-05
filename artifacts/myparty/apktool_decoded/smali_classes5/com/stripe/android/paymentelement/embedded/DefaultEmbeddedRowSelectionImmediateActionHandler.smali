.class public final Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedRowSelectionImmediateActionHandler;
.super Ljava/lang/Object;
.source "EmbeddedRowSelectionImmediateActionHandler.kt"

# interfaces
.implements Lcom/stripe/android/paymentelement/embedded/EmbeddedRowSelectionImmediateActionHandler;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEmbeddedRowSelectionImmediateActionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmbeddedRowSelectionImmediateActionHandler.kt\ncom/stripe/android/paymentelement/embedded/DefaultEmbeddedRowSelectionImmediateActionHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B/\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0004\u0018\u0001`\u00080\u0005\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0008\u0010\u000b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0004\u0018\u0001`\u00080\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedRowSelectionImmediateActionHandler;",
        "Lcom/stripe/android/paymentelement/embedded/EmbeddedRowSelectionImmediateActionHandler;",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "internalRowSelectionCallback",
        "Ljavax/inject/Provider;",
        "Lkotlin/Function0;",
        "",
        "Lcom/stripe/android/paymentelement/embedded/InternalRowSelectionCallback;",
        "<init>",
        "(Lkotlinx/coroutines/CoroutineScope;Ljavax/inject/Provider;)V",
        "invoke",
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
.field private final coroutineScope:Lkotlinx/coroutines/CoroutineScope;

.field private final internalRowSelectionCallback:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/CoroutineScope;Ljavax/inject/Provider;)V
    .locals 1
    .param p1    # Lkotlinx/coroutines/CoroutineScope;
        .annotation runtime Lcom/stripe/android/core/injection/ViewModelScope;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Ljavax/inject/Provider<",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;>;)V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "internalRowSelectionCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedRowSelectionImmediateActionHandler;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    .line 17
    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedRowSelectionImmediateActionHandler;->internalRowSelectionCallback:Ljavax/inject/Provider;

    return-void
.end method


# virtual methods
.method public invoke()V
    .locals 7

    .line 25
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedRowSelectionImmediateActionHandler;->internalRowSelectionCallback:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function0;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedRowSelectionImmediateActionHandler;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v2, Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedRowSelectionImmediateActionHandler$invoke$1$1;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedRowSelectionImmediateActionHandler$invoke$1$1;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    move-object v4, v2

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    :cond_0
    return-void
.end method
