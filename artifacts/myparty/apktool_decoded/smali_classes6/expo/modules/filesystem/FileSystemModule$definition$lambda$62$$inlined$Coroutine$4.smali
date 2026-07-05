.class public final Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AsyncFunctionBuilder.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/filesystem/FileSystemModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "[",
        "Ljava/lang/Object;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Ljava/lang/Object;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAsyncFunctionBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncFunctionBuilder.kt\nexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$7\n+ 2 EnforceType.kt\nexpo/modules/kotlin/types/EnforceTypeKt\n+ 3 FileSystemModule.kt\nexpo/modules/filesystem/FileSystemModule\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 OkHttpExtensions.kt\nexpo/modules/kotlin/devtools/OkHttpExtensionsKt\n+ 6 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,269:1\n25#2:270\n56#3,4:271\n60#3,2:276\n63#3,3:279\n67#3,25:299\n216#4:275\n217#4:278\n33#5:282\n34#5:292\n47#5,4:293\n314#6,9:283\n323#6,2:297\n*S KotlinDebug\n*F\n+ 1 AsyncFunctionBuilder.kt\nexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$7\n+ 2 FileSystemModule.kt\nexpo/modules/filesystem/FileSystemModule\n*L\n46#1:270\n59#2:275\n59#2:278\n65#2:282\n65#2:292\n65#2:293,4\n65#2:283,9\n65#2:297,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0010\u0010\u0003\u001a\u000c\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u00010\u0004H\n\u00a8\u0006\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;",
        "<destruct>",
        "",
        "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$7"
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
    c = "expo.modules.filesystem.FileSystemModule$definition$lambda$62$$inlined$Coroutine$4"
    f = "FileSystemModule.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x11b
    }
    m = "invokeSuspend"
    n = {
        "options",
        "to",
        "url",
        "client",
        "$this$await$iv",
        "$completion$iv"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5"
    }
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlin/coroutines/Continuation;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3}, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->invoke(Lkotlinx/coroutines/CoroutineScope;[Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;[Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "[",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p1, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;

    invoke-direct {p1, p3}, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;-><init>(Lkotlin/coroutines/Continuation;)V

    iput-object p2, p1, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->L$0:Ljava/lang/Object;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 54
    iget v1, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v4, :cond_0

    iget-object v0, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->L$5:Ljava/lang/Object;

    check-cast v0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;

    iget-object v0, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->L$4:Ljava/lang/Object;

    check-cast v0, Lokhttp3/Request;

    iget-object v0, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->L$3:Ljava/lang/Object;

    check-cast v0, Lokhttp3/OkHttpClient;

    iget-object v0, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->L$2:Ljava/lang/Object;

    check-cast v0, Ljava/net/URI;

    iget-object v1, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->L$1:Ljava/lang/Object;

    check-cast v1, Lexpo/modules/filesystem/FileSystemPath;

    iget-object v5, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->L$0:Ljava/lang/Object;

    check-cast v5, Lexpo/modules/filesystem/DownloadOptions;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->L$0:Ljava/lang/Object;

    check-cast p1, [Ljava/lang/Object;

    aget-object v1, p1, v3

    aget-object v5, p1, v4

    aget-object p1, p1, v2

    .line 47
    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    check-cast p1, Lexpo/modules/filesystem/DownloadOptions;

    check-cast v5, Lexpo/modules/filesystem/FileSystemPath;

    check-cast v1, Ljava/net/URI;

    .line 271
    sget-object v7, Lexpo/modules/interfaces/filesystem/Permission;->WRITE:Lexpo/modules/interfaces/filesystem/Permission;

    invoke-virtual {v5, v7}, Lexpo/modules/filesystem/FileSystemPath;->validatePermission(Lexpo/modules/interfaces/filesystem/Permission;)V

    .line 272
    new-instance v7, Lokhttp3/Request$Builder;

    invoke-direct {v7}, Lokhttp3/Request$Builder;-><init>()V

    invoke-virtual {v1}, Ljava/net/URI;->toURL()Ljava/net/URL;

    move-result-object v8

    const-string v9, "toURL(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v8}, Lokhttp3/Request$Builder;->url(Ljava/net/URL;)Lokhttp3/Request$Builder;

    move-result-object v7

    if-eqz p1, :cond_2

    .line 274
    invoke-virtual {p1}, Lexpo/modules/filesystem/DownloadOptions;->getHeaders()Ljava/util/Map;

    move-result-object v8

    if-eqz v8, :cond_2

    .line 275
    invoke-interface {v8}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map$Entry;

    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 276
    invoke-virtual {v7, v10, v9}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    goto :goto_0

    .line 279
    :cond_2
    invoke-virtual {v7}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v7

    .line 280
    new-instance v8, Lokhttp3/OkHttpClient;

    invoke-direct {v8}, Lokhttp3/OkHttpClient;-><init>()V

    .line 283
    iput-object p1, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->L$0:Ljava/lang/Object;

    iput-object v5, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->L$1:Ljava/lang/Object;

    iput-object v1, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->L$2:Ljava/lang/Object;

    iput-object v8, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->L$3:Ljava/lang/Object;

    iput-object v7, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->L$4:Ljava/lang/Object;

    iput-object p0, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->L$5:Ljava/lang/Object;

    iput v4, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->label:I

    .line 284
    new-instance v9, Lkotlinx/coroutines/CancellableContinuationImpl;

    invoke-static {v6}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v10

    invoke-direct {v9, v10, v4}, Lkotlinx/coroutines/CancellableContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 290
    invoke-virtual {v9}, Lkotlinx/coroutines/CancellableContinuationImpl;->initCancellability()V

    .line 291
    move-object v10, v9

    check-cast v10, Lkotlinx/coroutines/CancellableContinuation;

    .line 292
    new-instance v11, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$lambda$8$$inlined$await$1;

    invoke-direct {v11, v10}, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$lambda$8$$inlined$await$1;-><init>(Lkotlinx/coroutines/CancellableContinuation;)V

    .line 294
    invoke-virtual {v8, v7}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object v7

    .line 295
    check-cast v11, Lokhttp3/Callback;

    invoke-interface {v7, v11}, Lokhttp3/Call;->enqueue(Lokhttp3/Callback;)V

    .line 297
    invoke-virtual {v9}, Lkotlinx/coroutines/CancellableContinuationImpl;->getResult()Ljava/lang/Object;

    move-result-object v7

    .line 283
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v8

    if-ne v7, v8, :cond_3

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_3
    if-ne v7, v0, :cond_4

    return-object v0

    :cond_4
    move-object v0, v1

    move-object v1, v5

    move-object v5, p1

    move-object p1, v7

    .line 281
    :goto_1
    check-cast p1, Lokhttp3/Response;

    .line 299
    invoke-virtual {p1}, Lokhttp3/Response;->isSuccessful()Z

    move-result v6

    if-eqz v6, :cond_9

    .line 303
    invoke-virtual {p1}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    move-result-object v6

    const-string v7, "content-disposition"

    invoke-virtual {v6, v7}, Lokhttp3/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 304
    invoke-virtual {p1}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    move-result-object v7

    const-string v8, "content-type"

    invoke-virtual {v7, v8}, Lokhttp3/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 305
    invoke-virtual {v0}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6, v7}, Landroid/webkit/URLUtil;->guessFileName(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 307
    instance-of v6, v1, Lexpo/modules/filesystem/FileSystemDirectory;

    if-eqz v6, :cond_5

    .line 308
    new-instance v6, Ljava/io/File;

    invoke-virtual {v1}, Lexpo/modules/filesystem/FileSystemPath;->getJavaFile()Ljava/io/File;

    move-result-object v1

    invoke-direct {v6, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    goto :goto_2

    .line 310
    :cond_5
    invoke-virtual {v1}, Lexpo/modules/filesystem/FileSystemPath;->getJavaFile()Ljava/io/File;

    move-result-object v6

    :goto_2
    if-eqz v5, :cond_6

    .line 313
    invoke-virtual {v5}, Lexpo/modules/filesystem/DownloadOptions;->getIdempotent()Z

    move-result v0

    if-ne v0, v4, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_8

    .line 317
    :goto_3
    invoke-virtual {p1}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 318
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->byteStream()Ljava/io/InputStream;

    move-result-object p1

    check-cast p1, Ljava/io/Closeable;

    :try_start_0
    move-object v0, p1

    check-cast v0, Ljava/io/InputStream;

    .line 319
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    check-cast v1, Ljava/io/Closeable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    move-object v4, v1

    check-cast v4, Ljava/io/FileOutputStream;

    .line 320
    check-cast v4, Ljava/io/OutputStream;

    const/4 v5, 0x0

    invoke-static {v0, v4, v3, v2, v5}, Lkotlin/io/ByteStreamsKt;->copyTo$default(Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 319
    :try_start_2
    invoke-static {v1, v5}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 318
    invoke-static {p1, v5}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 323
    invoke-virtual {v6}, Ljava/io/File;->toURI()Ljava/net/URI;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception v0

    .line 319
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v2

    :try_start_4
    invoke-static {v1, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v0

    .line 318
    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    move-exception v1

    invoke-static {p1, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1

    .line 317
    :cond_7
    new-instance p1, Lexpo/modules/filesystem/UnableToDownloadException;

    const-string v0, "response body is null"

    invoke-direct {p1, v0}, Lexpo/modules/filesystem/UnableToDownloadException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 314
    :cond_8
    new-instance p1, Lexpo/modules/filesystem/DestinationAlreadyExistsException;

    invoke-direct {p1}, Lexpo/modules/filesystem/DestinationAlreadyExistsException;-><init>()V

    throw p1

    .line 300
    :cond_9
    new-instance v0, Lexpo/modules/filesystem/UnableToDownloadException;

    invoke-virtual {p1}, Lokhttp3/Response;->code()I

    move-result p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "response has status: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lexpo/modules/filesystem/UnableToDownloadException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
