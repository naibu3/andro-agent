.class public final Lexpo/modules/notifications/notifications/presentation/builders/DownloadImageKt;
.super Ljava/lang/Object;
.source "DownloadImage.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\u001a,\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0086@\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "downloadImage",
        "Landroid/graphics/Bitmap;",
        "imageUrl",
        "Landroid/net/Uri;",
        "connectTimeout",
        "",
        "readTimeout",
        "(Landroid/net/Uri;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "expo-notifications_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final downloadImage(Landroid/net/Uri;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "JJ",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p5

    instance-of v1, v0, Lexpo/modules/notifications/notifications/presentation/builders/DownloadImageKt$downloadImage$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lexpo/modules/notifications/notifications/presentation/builders/DownloadImageKt$downloadImage$1;

    iget v2, v1, Lexpo/modules/notifications/notifications/presentation/builders/DownloadImageKt$downloadImage$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lexpo/modules/notifications/notifications/presentation/builders/DownloadImageKt$downloadImage$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lexpo/modules/notifications/notifications/presentation/builders/DownloadImageKt$downloadImage$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lexpo/modules/notifications/notifications/presentation/builders/DownloadImageKt$downloadImage$1;

    invoke-direct {v1, v0}, Lexpo/modules/notifications/notifications/presentation/builders/DownloadImageKt$downloadImage$1;-><init>(Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v1, Lexpo/modules/notifications/notifications/presentation/builders/DownloadImageKt$downloadImage$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 11
    iget v3, v1, Lexpo/modules/notifications/notifications/presentation/builders/DownloadImageKt$downloadImage$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 12
    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    add-long v5, p1, p3

    .line 13
    new-instance v7, Lexpo/modules/notifications/notifications/presentation/builders/DownloadImageKt$downloadImage$2$1;

    const/4 v13, 0x0

    move-object v8, p0

    move-wide v9, p1

    move-wide/from16 v11, p3

    invoke-direct/range {v7 .. v13}, Lexpo/modules/notifications/notifications/presentation/builders/DownloadImageKt$downloadImage$2$1;-><init>(Landroid/net/Uri;JJLkotlin/coroutines/Continuation;)V

    check-cast v7, Lkotlin/jvm/functions/Function2;

    iput v4, v1, Lexpo/modules/notifications/notifications/presentation/builders/DownloadImageKt$downloadImage$1;->label:I

    invoke-static {v5, v6, v7, v1}, Lkotlinx/coroutines/TimeoutKt;->withTimeout(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_3

    return-object v2

    .line 11
    :cond_3
    :goto_1
    check-cast v0, Landroid/graphics/Bitmap;

    .line 12
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p0, v0

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 22
    :goto_2
    invoke-static {p0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 p0, 0x0

    :cond_4
    return-object p0
.end method

.method public static synthetic downloadImage$default(Landroid/net/Uri;JJLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2

    and-int/lit8 p7, p6, 0x2

    const-wide/16 v0, 0x1f40

    if-eqz p7, :cond_0

    move-wide p1, v0

    :cond_0
    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_1

    move-wide p3, v0

    .line 11
    :cond_1
    invoke-static/range {p0 .. p5}, Lexpo/modules/notifications/notifications/presentation/builders/DownloadImageKt;->downloadImage(Landroid/net/Uri;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
