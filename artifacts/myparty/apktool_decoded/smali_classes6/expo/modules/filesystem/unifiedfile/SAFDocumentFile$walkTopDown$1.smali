.class final Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "SAFDocumentFile.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->walkTopDown()Lkotlin/sequences/Sequence;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlin/sequences/SequenceScope<",
        "-",
        "Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;",
        ">;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSAFDocumentFile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SAFDocumentFile.kt\nexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,105:1\n13472#2,2:106\n*S KotlinDebug\n*F\n+ 1 SAFDocumentFile.kt\nexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1\n*L\n91#1:106,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlin/sequences/SequenceScope;",
        "Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "expo.modules.filesystem.unifiedfile.SAFDocumentFile$walkTopDown$1"
    f = "SAFDocumentFile.kt"
    i = {
        0x0,
        0x1,
        0x1
    }
    l = {
        0x59,
        0x5c
    }
    m = "invokeSuspend"
    n = {
        "$this$sequence",
        "$this$sequence",
        "$this$forEach$iv"
    }
    s = {
        "L$0",
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;


# direct methods
.method constructor <init>(Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->this$0:Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;

    iget-object v1, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->this$0:Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;

    invoke-direct {v0, v1, p2}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;-><init>(Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/sequences/SequenceScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->invoke(Lkotlin/sequences/SequenceScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/sequences/SequenceScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/sequences/SequenceScope<",
            "-",
            "Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 88
    iget v1, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget v1, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->I$1:I

    iget v4, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->I$0:I

    iget-object v5, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->L$2:Ljava/lang/Object;

    check-cast v5, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;

    iget-object v6, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->L$1:Ljava/lang/Object;

    check-cast v6, [Landroidx/documentfile/provider/DocumentFile;

    iget-object v7, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lkotlin/sequences/SequenceScope;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lkotlin/sequences/SequenceScope;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->L$0:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lkotlin/sequences/SequenceScope;

    .line 89
    iget-object p1, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->this$0:Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    iput-object v1, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->L$0:Ljava/lang/Object;

    iput v3, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->label:I

    invoke-virtual {v1, p1, v4}, Lkotlin/sequences/SequenceScope;->yield(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_2

    .line 90
    :cond_3
    :goto_0
    iget-object p1, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->this$0:Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;

    invoke-virtual {p1}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->isDirectory()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 91
    iget-object p1, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->this$0:Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;

    invoke-static {p1}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->access$getDocumentFile(Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;)Landroidx/documentfile/provider/DocumentFile;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroidx/documentfile/provider/DocumentFile;->listFiles()[Landroidx/documentfile/provider/DocumentFile;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object v4, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->this$0:Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;

    .line 106
    array-length v5, p1

    const/4 v6, 0x0

    move-object v7, v1

    move v1, v5

    move-object v5, v4

    move v4, v6

    move-object v6, p1

    :goto_1
    if-ge v4, v1, :cond_5

    aget-object p1, v6, v4

    .line 92
    new-instance v8, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;

    invoke-static {v5}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->access$getContext$p(Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;)Landroid/content/Context;

    move-result-object v9

    invoke-virtual {p1}, Landroidx/documentfile/provider/DocumentFile;->getUri()Landroid/net/Uri;

    move-result-object p1

    const-string v10, "getUri(...)"

    invoke-static {p1, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v8, v9, p1}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    invoke-virtual {v8}, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;->walkTopDown()Lkotlin/sequences/Sequence;

    move-result-object p1

    iput-object v7, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->L$0:Ljava/lang/Object;

    iput-object v6, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->L$1:Ljava/lang/Object;

    iput-object v5, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->L$2:Ljava/lang/Object;

    iput v4, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->I$0:I

    iput v1, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->I$1:I

    iput v2, p0, Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile$walkTopDown$1;->label:I

    invoke-virtual {v7, p1, p0}, Lkotlin/sequences/SequenceScope;->yieldAll(Lkotlin/sequences/Sequence;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_2
    return-object v0

    :cond_4
    :goto_3
    add-int/2addr v4, v3

    goto :goto_1

    .line 95
    :cond_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
