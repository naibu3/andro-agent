.class public final Lcom/stripe/android/uicore/image/NetworkImageDecoder;
.super Ljava/lang/Object;
.source "NetworkImageDecoder.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/image/NetworkImageDecoder$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNetworkImageDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkImageDecoder.kt\ncom/stripe/android/uicore/image/NetworkImageDecoder\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n426#2,9:96\n435#2,2:106\n1#3:105\n*S KotlinDebug\n*F\n+ 1 NetworkImageDecoder.kt\ncom/stripe/android/uicore/image/NetworkImageDecoder\n*L\n47#1:96,9\n47#1:106,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J(\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0086@\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0002\u0010\u000cJ\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005*\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0007H\u0082@\u00a2\u0006\u0002\u0010\u000fJ\u000c\u0010\u0010\u001a\u00020\u0011*\u00020\u0007H\u0002J \u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0002\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/uicore/image/NetworkImageDecoder;",
        "",
        "<init>",
        "()V",
        "decode",
        "Lcom/stripe/android/uicore/image/LoadedImage;",
        "url",
        "Ljava/net/URL;",
        "width",
        "",
        "height",
        "(Ljava/net/URL;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "(Ljava/net/URL;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "decodeStream",
        "Landroid/graphics/BitmapFactory$Options;",
        "(Landroid/graphics/BitmapFactory$Options;Ljava/net/URL;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "stream",
        "Ljava/io/InputStream;",
        "calculateInSampleSize",
        "options",
        "reqWidth",
        "reqHeight",
        "Companion",
        "stripe-ui-core_release"
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
.field public static final $stable:I = 0x0

.field private static final Companion:Lcom/stripe/android/uicore/image/NetworkImageDecoder$Companion;

.field public static final IMAGE_STREAM_TIMEOUT:I = 0x2710
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/uicore/image/NetworkImageDecoder$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/uicore/image/NetworkImageDecoder$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/image/NetworkImageDecoder;->Companion:Lcom/stripe/android/uicore/image/NetworkImageDecoder$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$decodeStream(Lcom/stripe/android/uicore/image/NetworkImageDecoder;Landroid/graphics/BitmapFactory$Options;Ljava/net/URL;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 13
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/uicore/image/NetworkImageDecoder;->decodeStream(Landroid/graphics/BitmapFactory$Options;Ljava/net/URL;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$stream(Lcom/stripe/android/uicore/image/NetworkImageDecoder;Ljava/net/URL;)Ljava/io/InputStream;
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Lcom/stripe/android/uicore/image/NetworkImageDecoder;->stream(Ljava/net/URL;)Ljava/io/InputStream;

    move-result-object p0

    return-object p0
.end method

.method private final calculateInSampleSize(Landroid/graphics/BitmapFactory$Options;II)I
    .locals 3

    .line 77
    iget v0, p1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget p1, p1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    const/4 v1, 0x1

    if-gt v0, p3, :cond_1

    if-le p1, p2, :cond_0

    goto :goto_0

    :cond_0
    return v1

    .line 80
    :cond_1
    :goto_0
    div-int/lit8 v0, v0, 0x2

    .line 81
    div-int/lit8 p1, p1, 0x2

    .line 84
    :goto_1
    div-int v2, v0, v1

    if-lt v2, p3, :cond_2

    div-int v2, p1, v1

    if-lt v2, p2, :cond_2

    mul-int/lit8 v1, v1, 0x2

    goto :goto_1

    :cond_2
    return v1
.end method

.method private final decodeStream(Landroid/graphics/BitmapFactory$Options;Ljava/net/URL;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/BitmapFactory$Options;",
            "Ljava/net/URL;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/uicore/image/LoadedImage;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 97
    new-instance v0, Lkotlinx/coroutines/CancellableContinuationImpl;

    invoke-static {p3}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/CancellableContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 103
    invoke-virtual {v0}, Lkotlinx/coroutines/CancellableContinuationImpl;->initCancellability()V

    .line 104
    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/CancellableContinuation;

    .line 48
    :try_start_0
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 49
    invoke-static {p0, p2}, Lcom/stripe/android/uicore/image/NetworkImageDecoder;->access$stream(Lcom/stripe/android/uicore/image/NetworkImageDecoder;Ljava/net/URL;)Ljava/io/InputStream;

    move-result-object p2

    .line 50
    new-instance v2, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decodeStream$2$1$1$1;

    invoke-direct {v2, p1, p2}, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decodeStream$2$1$1$1;-><init>(Landroid/graphics/BitmapFactory$Options;Ljava/io/InputStream;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v2}, Lkotlinx/coroutines/CancellableContinuation;->invokeOnCancellation(Lkotlin/jvm/functions/Function1;)V

    check-cast p2, Ljava/io/Closeable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 51
    :try_start_1
    move-object v2, p2

    check-cast v2, Ljava/io/InputStream;

    const/4 v3, 0x0

    invoke-static {v2, v3, p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {p2, v3}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    if-eqz v2, :cond_0

    .line 53
    new-instance v3, Lcom/stripe/android/uicore/image/LoadedImage;

    .line 54
    iget-object p1, p1, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    const-string p2, "outMimeType"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    invoke-direct {v3, p1, v2}, Lcom/stripe/android/uicore/image/LoadedImage;-><init>(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 48
    :cond_0
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 51
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v2

    :try_start_4
    invoke-static {p2, p1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    .line 48
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 58
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_1

    check-cast p1, Lcom/stripe/android/uicore/image/LoadedImage;

    .line 59
    check-cast v1, Lkotlin/coroutines/Continuation;

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v1, p1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    goto :goto_1

    .line 60
    :cond_1
    check-cast v1, Lkotlin/coroutines/Continuation;

    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v1, p1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    .line 106
    :goto_1
    invoke-virtual {v0}, Lkotlinx/coroutines/CancellableContinuationImpl;->getResult()Ljava/lang/Object;

    move-result-object p1

    .line 96
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2

    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_2
    return-object p1
.end method

.method private final stream(Ljava/net/URL;)Ljava/io/InputStream;
    .locals 1

    .line 65
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    const-string v0, "openConnection(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x2710

    .line 66
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 67
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 68
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    const-string v0, "getInputStream(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public final decode(Ljava/net/URL;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URL;",
            "II",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/uicore/image/LoadedImage;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;

    iget v1, v0, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;-><init>(Lcom/stripe/android/uicore/image/NetworkImageDecoder;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 20
    iget v2, v0, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p3, v0, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;->I$1:I

    iget p2, v0, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;->I$0:I

    iget-object p1, v0, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;->L$2:Ljava/lang/Object;

    check-cast p1, Landroid/graphics/BitmapFactory$Options;

    iget-object v2, v0, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/net/URL;

    iget-object v4, v0, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/uicore/image/NetworkImageDecoder;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 25
    new-instance p4, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {p4}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 27
    iput-boolean v4, p4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 28
    iput-object p0, v0, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;->L$1:Ljava/lang/Object;

    iput-object p4, v0, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;->L$2:Ljava/lang/Object;

    iput p2, v0, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;->I$0:I

    iput p3, v0, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;->I$1:I

    iput v4, v0, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;->label:I

    invoke-direct {p0, p4, p1, v0}, Lcom/stripe/android/uicore/image/NetworkImageDecoder;->decodeStream(Landroid/graphics/BitmapFactory$Options;Ljava/net/URL;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v4, p0

    move-object v2, p1

    move-object p1, p4

    .line 30
    :goto_1
    invoke-direct {v4, p1, p2, p3}, Lcom/stripe/android/uicore/image/NetworkImageDecoder;->calculateInSampleSize(Landroid/graphics/BitmapFactory$Options;II)I

    move-result p2

    iput p2, p1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    const/4 p2, 0x0

    .line 32
    iput-boolean p2, p1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    const/4 p2, 0x0

    .line 33
    iput-object p2, v0, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;->label:I

    invoke-direct {v4, p1, v2, v0}, Lcom/stripe/android/uicore/image/NetworkImageDecoder;->decodeStream(Landroid/graphics/BitmapFactory$Options;Ljava/net/URL;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    check-cast p4, Lcom/stripe/android/uicore/image/LoadedImage;

    return-object p4
.end method

.method public final decode(Ljava/net/URL;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URL;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/uicore/image/LoadedImage;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 40
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 41
    invoke-direct {p0, v0, p1, p2}, Lcom/stripe/android/uicore/image/NetworkImageDecoder;->decodeStream(Landroid/graphics/BitmapFactory$Options;Ljava/net/URL;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    check-cast p1, Lcom/stripe/android/uicore/image/LoadedImage;

    return-object p1
.end method
