.class public final Lexpo/modules/imagepicker/MediaHandler;
.super Ljava/lang/Object;
.source "MediaHandler.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/imagepicker/MediaHandler$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMediaHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaHandler.kt\nexpo/modules/imagepicker/MediaHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,149:1\n1#2:150\n1563#3:151\n1634#3,3:152\n37#4:155\n36#4,3:156\n36#5:159\n*S KotlinDebug\n*F\n+ 1 MediaHandler.kt\nexpo/modules/imagepicker/MediaHandler\n*L\n26#1:151\n26#1:152,3\n82#1:155\n82#1:156,3\n103#1:159\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J8\u0010\n\u001a\u00020\u000b2\u001e\u0010\u000c\u001a\u001a\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\rj\u0002`\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0080@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@\u00a2\u0006\u0002\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u0010H\u0002J\u0016\u0010!\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0082@\u00a2\u0006\u0002\u0010\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\u0016\u001a\u00020\u00178BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006#"
    }
    d2 = {
        "Lexpo/modules/imagepicker/MediaHandler;",
        "",
        "appContextProvider",
        "Lexpo/modules/kotlin/providers/AppContextProvider;",
        "<init>",
        "(Lexpo/modules/kotlin/providers/AppContextProvider;)V",
        "context",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "readExtras",
        "Lexpo/modules/imagepicker/ImagePickerResponse;",
        "bareResult",
        "",
        "Lkotlin/Pair;",
        "Lexpo/modules/imagepicker/MediaType;",
        "Landroid/net/Uri;",
        "Lexpo/modules/imagepicker/contracts/MediaList;",
        "options",
        "Lexpo/modules/imagepicker/ImagePickerOptions;",
        "readExtras$expo_image_picker_release",
        "(Ljava/util/List;Lexpo/modules/imagepicker/ImagePickerOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "cacheDirectory",
        "Ljava/io/File;",
        "getCacheDirectory",
        "()Ljava/io/File;",
        "handleImage",
        "Lexpo/modules/imagepicker/ImagePickerAsset;",
        "sourceUri",
        "(Landroid/net/Uri;Lexpo/modules/imagepicker/ImagePickerOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getAdditionalFileData",
        "Lexpo/modules/imagepicker/AdditionalFileData;",
        "uri",
        "handleVideo",
        "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "expo-image-picker_release"
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
.field private final appContextProvider:Lexpo/modules/kotlin/providers/AppContextProvider;


# direct methods
.method public constructor <init>(Lexpo/modules/kotlin/providers/AppContextProvider;)V
    .locals 1

    const-string v0, "appContextProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lexpo/modules/imagepicker/MediaHandler;->appContextProvider:Lexpo/modules/kotlin/providers/AppContextProvider;

    return-void
.end method

.method public static final synthetic access$handleImage(Lexpo/modules/imagepicker/MediaHandler;Landroid/net/Uri;Lexpo/modules/imagepicker/ImagePickerOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 16
    invoke-direct {p0, p1, p2, p3}, Lexpo/modules/imagepicker/MediaHandler;->handleImage(Landroid/net/Uri;Lexpo/modules/imagepicker/ImagePickerOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$handleVideo(Lexpo/modules/imagepicker/MediaHandler;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 16
    invoke-direct {p0, p1, p2}, Lexpo/modules/imagepicker/MediaHandler;->handleVideo(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final getAdditionalFileData(Landroid/net/Uri;)Lexpo/modules/imagepicker/AdditionalFileData;
    .locals 11

    const/4 v0, 0x2

    .line 82
    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "_display_name"

    aput-object v2, v0, v1

    const/4 v3, 0x1

    const-string v4, "_size"

    aput-object v4, v0, v3

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 158
    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    .line 82
    move-object v7, v0

    check-cast v7, [Ljava/lang/String;

    .line 83
    invoke-direct {p0}, Lexpo/modules/imagepicker/MediaHandler;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v6, p1

    invoke-virtual/range {v5 .. v10}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_6

    check-cast p1, Ljava/io/Closeable;

    :try_start_0
    move-object v0, p1

    check-cast v0, Landroid/database/Cursor;

    .line 84
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v3, :cond_0

    .line 85
    invoke-static {p1, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object v1

    .line 87
    :cond_0
    :try_start_1
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v3, p0

    check-cast v3, Lexpo/modules/imagepicker/MediaHandler;

    .line 88
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    const/4 v5, -0x1

    if-eq v3, v5, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_2
    move-object v2, v1

    .line 89
    :goto_1
    invoke-interface {v0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    if-eq v4, v5, :cond_3

    goto :goto_2

    :cond_3
    move-object v3, v1

    :goto_2
    if-eqz v3, :cond_4

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_3

    :cond_4
    move-object v0, v1

    .line 90
    :goto_3
    new-instance v3, Lexpo/modules/imagepicker/AdditionalFileData;

    invoke-direct {v3, v2, v0}, Lexpo/modules/imagepicker/AdditionalFileData;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 87
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    :try_start_2
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 94
    :goto_4
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    move-object v0, v1

    :cond_5
    check-cast v0, Lexpo/modules/imagepicker/AdditionalFileData;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 83
    invoke-static {p1, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object v0

    :catchall_1
    move-exception v0

    move-object v1, v0

    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v0

    invoke-static {p1, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_6
    return-object v1
.end method

.method private final getCacheDirectory()Ljava/io/File;
    .locals 1

    .line 44
    iget-object v0, p0, Lexpo/modules/imagepicker/MediaHandler;->appContextProvider:Lexpo/modules/kotlin/providers/AppContextProvider;

    invoke-interface {v0}, Lexpo/modules/kotlin/providers/AppContextProvider;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object v0

    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getCacheDirectory()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private final getContext()Landroid/content/Context;
    .locals 2

    .line 20
    iget-object v0, p0, Lexpo/modules/imagepicker/MediaHandler;->appContextProvider:Lexpo/modules/kotlin/providers/AppContextProvider;

    invoke-interface {v0}, Lexpo/modules/kotlin/providers/AppContextProvider;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object v0

    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getReactContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "React Application Context is null"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final handleImage(Landroid/net/Uri;Lexpo/modules/imagepicker/ImagePickerOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Lexpo/modules/imagepicker/ImagePickerOptions;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lexpo/modules/imagepicker/ImagePickerAsset;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    instance-of v3, v2, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;

    iget v4, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->label:I

    const/high16 v5, -0x80000000

    and-int/2addr v4, v5

    if-eqz v4, :cond_0

    iget v2, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->label:I

    sub-int/2addr v2, v5

    iput v2, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;

    invoke-direct {v3, v0, v2}, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;-><init>(Lexpo/modules/imagepicker/MediaHandler;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v2, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 46
    iget v5, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->label:I

    const/4 v6, 0x3

    const/4 v7, 0x1

    const/4 v8, 0x2

    const-string v9, "getContentResolver(...)"

    const/4 v10, 0x0

    if-eqz v5, :cond_4

    if-eq v5, v7, :cond_3

    if-eq v5, v8, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v1, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$4:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v4, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$3:Ljava/lang/Object;

    check-cast v4, Lexpo/modules/imagepicker/exporters/ImageExportResult;

    iget-object v5, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/io/File;

    iget-object v6, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v3, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$0:Ljava/lang/Object;

    check-cast v3, Landroid/net/Uri;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$4:Ljava/lang/Object;

    check-cast v1, Lexpo/modules/imagepicker/exporters/ImageExportResult;

    iget-object v5, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$3:Ljava/lang/Object;

    check-cast v5, Ljava/io/File;

    iget-object v7, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$2:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v11, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$1:Ljava/lang/Object;

    check-cast v11, Lexpo/modules/imagepicker/ImagePickerOptions;

    iget-object v12, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$0:Ljava/lang/Object;

    check-cast v12, Landroid/net/Uri;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    iget-object v1, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$3:Ljava/lang/Object;

    check-cast v1, Ljava/io/File;

    iget-object v5, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v7, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lexpo/modules/imagepicker/ImagePickerOptions;

    iget-object v11, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$0:Ljava/lang/Object;

    check-cast v11, Landroid/net/Uri;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v13, v7

    move-object v7, v5

    move-object v5, v1

    move-object v1, v11

    goto :goto_2

    :cond_4
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 50
    invoke-virtual/range {p2 .. p2}, Lexpo/modules/imagepicker/ImagePickerOptions;->getQuality()D

    move-result-wide v11

    const-wide/high16 v13, 0x3ff0000000000000L    # 1.0

    cmpg-double v2, v11, v13

    if-nez v2, :cond_5

    .line 51
    new-instance v2, Lexpo/modules/imagepicker/exporters/RawImageExporter;

    invoke-direct {v2}, Lexpo/modules/imagepicker/exporters/RawImageExporter;-><init>()V

    check-cast v2, Lexpo/modules/imagepicker/exporters/ImageExporter;

    goto :goto_1

    .line 53
    :cond_5
    new-instance v2, Lexpo/modules/imagepicker/exporters/CompressionImageExporter;

    iget-object v5, v0, Lexpo/modules/imagepicker/MediaHandler;->appContextProvider:Lexpo/modules/kotlin/providers/AppContextProvider;

    invoke-virtual/range {p2 .. p2}, Lexpo/modules/imagepicker/ImagePickerOptions;->getQuality()D

    move-result-wide v11

    invoke-direct {v2, v5, v11, v12}, Lexpo/modules/imagepicker/exporters/CompressionImageExporter;-><init>(Lexpo/modules/kotlin/providers/AppContextProvider;D)V

    check-cast v2, Lexpo/modules/imagepicker/exporters/ImageExporter;

    .line 55
    :goto_1
    invoke-direct {v0}, Lexpo/modules/imagepicker/MediaHandler;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v1}, Lexpo/modules/imagepicker/ImagePickerUtilsKt;->getType(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_11

    .line 56
    invoke-direct {v0}, Lexpo/modules/imagepicker/MediaHandler;->getCacheDirectory()Ljava/io/File;

    move-result-object v11

    invoke-static {v5}, Lexpo/modules/imagepicker/ImagePickerUtilsKt;->toImageFileExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Lexpo/modules/imagepicker/ImagePickerUtilsKt;->createOutputFile(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v11

    .line 58
    invoke-direct {v0}, Lexpo/modules/imagepicker/MediaHandler;->getContext()Landroid/content/Context;

    move-result-object v12

    invoke-virtual {v12}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v12

    invoke-static {v12, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$0:Ljava/lang/Object;

    move-object/from16 v13, p2

    iput-object v13, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$1:Ljava/lang/Object;

    iput-object v5, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$2:Ljava/lang/Object;

    iput-object v11, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$3:Ljava/lang/Object;

    iput v7, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->label:I

    invoke-interface {v2, v1, v11, v12, v3}, Lexpo/modules/imagepicker/exporters/ImageExporter;->exportAsync(Landroid/net/Uri;Ljava/io/File;Landroid/content/ContentResolver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_6

    goto/16 :goto_7

    :cond_6
    move-object v7, v5

    move-object v5, v11

    .line 46
    :goto_2
    check-cast v2, Lexpo/modules/imagepicker/exporters/ImageExportResult;

    .line 59
    invoke-virtual {v13}, Lexpo/modules/imagepicker/ImagePickerOptions;->getBase64()Z

    move-result v11

    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    if-eqz v12, :cond_7

    goto :goto_3

    :cond_7
    move-object v11, v10

    :goto_3
    if-eqz v11, :cond_a

    .line 60
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    invoke-direct {v0}, Lexpo/modules/imagepicker/MediaHandler;->getContext()Landroid/content/Context;

    move-result-object v11

    invoke-virtual {v11}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v11

    invoke-static {v11, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$0:Ljava/lang/Object;

    iput-object v13, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$1:Ljava/lang/Object;

    iput-object v7, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$2:Ljava/lang/Object;

    iput-object v5, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$3:Ljava/lang/Object;

    iput-object v2, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$4:Ljava/lang/Object;

    iput v8, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->label:I

    invoke-virtual {v2, v11, v3}, Lexpo/modules/imagepicker/exporters/ImageExportResult;->data(Landroid/content/ContentResolver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v4, :cond_8

    goto :goto_7

    :cond_8
    move-object v12, v1

    move-object v1, v2

    move-object v2, v11

    move-object v11, v13

    :goto_4
    check-cast v2, Ljava/io/ByteArrayOutputStream;

    if-eqz v2, :cond_9

    .line 61
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    invoke-static {v2, v8}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v26, v2

    move-object v2, v1

    move-object/from16 v1, v26

    goto :goto_5

    :cond_9
    move-object v2, v1

    move-object v13, v11

    move-object v1, v12

    :cond_a
    move-object v12, v1

    move-object v1, v10

    move-object v11, v13

    .line 62
    :goto_5
    invoke-virtual {v11}, Lexpo/modules/imagepicker/ImagePickerOptions;->getExif()Z

    move-result v8

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    if-eqz v11, :cond_b

    goto :goto_6

    :cond_b
    move-object v8, v10

    :goto_6
    if-eqz v8, :cond_d

    .line 63
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    invoke-direct {v0}, Lexpo/modules/imagepicker/MediaHandler;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v8

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v12, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$0:Ljava/lang/Object;

    iput-object v7, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$1:Ljava/lang/Object;

    iput-object v5, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$2:Ljava/lang/Object;

    iput-object v2, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$3:Ljava/lang/Object;

    iput-object v1, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$4:Ljava/lang/Object;

    iput v6, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->label:I

    invoke-virtual {v2, v8, v3}, Lexpo/modules/imagepicker/exporters/ImageExportResult;->exif(Landroid/content/ContentResolver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_c

    :goto_7
    return-object v4

    :cond_c
    move-object v4, v2

    move-object v2, v3

    move-object v6, v7

    move-object v3, v12

    :goto_8
    move-object v10, v2

    check-cast v10, Landroid/os/Bundle;

    move-object v12, v3

    move-object v2, v4

    move-object/from16 v19, v6

    :goto_9
    move-object/from16 v20, v1

    move-object/from16 v21, v10

    goto :goto_a

    :cond_d
    move-object/from16 v19, v7

    goto :goto_9

    .line 65
    :goto_a
    invoke-direct {v0, v12}, Lexpo/modules/imagepicker/MediaHandler;->getAdditionalFileData(Landroid/net/Uri;)Lexpo/modules/imagepicker/AdditionalFileData;

    move-result-object v1

    .line 68
    sget-object v13, Lexpo/modules/imagepicker/MediaType;->IMAGE:Lexpo/modules/imagepicker/MediaType;

    .line 69
    invoke-static {v5}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v14

    const-string v3, "toString(...)"

    invoke-static {v14, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    invoke-virtual {v2}, Lexpo/modules/imagepicker/exporters/ImageExportResult;->getWidth()I

    move-result v15

    .line 71
    invoke-virtual {v2}, Lexpo/modules/imagepicker/exporters/ImageExportResult;->getHeight()I

    move-result v16

    if-eqz v1, :cond_e

    .line 72
    invoke-virtual {v1}, Lexpo/modules/imagepicker/AdditionalFileData;->getFileName()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_f

    :cond_e
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    :cond_f
    move-object/from16 v17, v2

    if-eqz v1, :cond_10

    .line 73
    invoke-virtual {v1}, Lexpo/modules/imagepicker/AdditionalFileData;->getFileSize()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    goto :goto_b

    :cond_10
    invoke-virtual {v5}, Ljava/io/File;->length()J

    move-result-wide v1

    .line 77
    :goto_b
    invoke-static {v12}, Lexpo/modules/imagepicker/ImagePickerUtilsKt;->getMediaStoreAssetId(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v12

    .line 67
    new-instance v11, Lexpo/modules/imagepicker/ImagePickerAsset;

    .line 73
    invoke-static {v1, v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object v18

    const/16 v24, 0xc00

    const/16 v25, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    .line 67
    invoke-direct/range {v11 .. v25}, Lexpo/modules/imagepicker/ImagePickerAsset;-><init>(Ljava/lang/String;Lexpo/modules/imagepicker/MediaType;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v11

    .line 55
    :cond_11
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Required value was null."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private final handleVideo(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lexpo/modules/imagepicker/ImagePickerAsset;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lexpo/modules/imagepicker/MediaHandler$handleVideo$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lexpo/modules/imagepicker/MediaHandler$handleVideo$1;

    iget v4, v3, Lexpo/modules/imagepicker/MediaHandler$handleVideo$1;->label:I

    const/high16 v5, -0x80000000

    and-int/2addr v4, v5

    if-eqz v4, :cond_0

    iget v2, v3, Lexpo/modules/imagepicker/MediaHandler$handleVideo$1;->label:I

    sub-int/2addr v2, v5

    iput v2, v3, Lexpo/modules/imagepicker/MediaHandler$handleVideo$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lexpo/modules/imagepicker/MediaHandler$handleVideo$1;

    invoke-direct {v3, v1, v2}, Lexpo/modules/imagepicker/MediaHandler$handleVideo$1;-><init>(Lexpo/modules/imagepicker/MediaHandler;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v2, v3, Lexpo/modules/imagepicker/MediaHandler$handleVideo$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 98
    iget v5, v3, Lexpo/modules/imagepicker/MediaHandler$handleVideo$1;->label:I

    const-string v6, "getContentResolver(...)"

    const/4 v7, 0x1

    if-eqz v5, :cond_2

    if-ne v5, v7, :cond_1

    iget-object v0, v3, Lexpo/modules/imagepicker/MediaHandler$handleVideo$1;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    iget-object v3, v3, Lexpo/modules/imagepicker/MediaHandler$handleVideo$1;->L$0:Ljava/lang/Object;

    check-cast v3, Landroid/net/Uri;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v2, v0

    move-object v0, v3

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 101
    invoke-direct {v1}, Lexpo/modules/imagepicker/MediaHandler;->getCacheDirectory()Ljava/io/File;

    move-result-object v2

    const-string v5, ".mp4"

    invoke-static {v2, v5}, Lexpo/modules/imagepicker/ImagePickerUtilsKt;->createOutputFile(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    .line 102
    invoke-direct {v1}, Lexpo/modules/imagepicker/MediaHandler;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v3, Lexpo/modules/imagepicker/MediaHandler$handleVideo$1;->L$0:Ljava/lang/Object;

    iput-object v2, v3, Lexpo/modules/imagepicker/MediaHandler$handleVideo$1;->L$1:Ljava/lang/Object;

    iput v7, v3, Lexpo/modules/imagepicker/MediaHandler$handleVideo$1;->label:I

    invoke-static {v0, v2, v5, v3}, Lexpo/modules/imagepicker/ImagePickerUtilsKt;->copyFile(Landroid/net/Uri;Ljava/io/File;Landroid/content/ContentResolver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_3

    return-object v4

    .line 159
    :cond_3
    :goto_1
    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v3

    .line 106
    :try_start_0
    new-instance v4, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v4}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 107
    invoke-direct {v1}, Lexpo/modules/imagepicker/MediaHandler;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v4, v5, v3}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    .line 110
    invoke-direct {v1, v0}, Lexpo/modules/imagepicker/MediaHandler;->getAdditionalFileData(Landroid/net/Uri;)Lexpo/modules/imagepicker/AdditionalFileData;

    move-result-object v5

    .line 111
    invoke-direct {v1}, Lexpo/modules/imagepicker/MediaHandler;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v7

    invoke-static {v7, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v0}, Lexpo/modules/imagepicker/ImagePickerUtilsKt;->getType(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v16

    .line 114
    new-instance v6, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v6}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    const/16 v7, 0x12

    invoke-static {v4, v7}, Lexpo/modules/imagepicker/ImagePickerUtilsKt;->extractInt(Landroid/media/MediaMetadataRetriever;I)I

    move-result v7

    iput v7, v6, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 115
    new-instance v7, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    const/16 v8, 0x13

    invoke-static {v4, v8}, Lexpo/modules/imagepicker/ImagePickerUtilsKt;->extractInt(Landroid/media/MediaMetadataRetriever;I)I

    move-result v8

    iput v8, v7, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    const/16 v8, 0x18

    .line 116
    invoke-static {v4, v8}, Lexpo/modules/imagepicker/ImagePickerUtilsKt;->extractInt(Landroid/media/MediaMetadataRetriever;I)I

    move-result v8

    .line 123
    rem-int/lit16 v9, v8, 0xb4

    if-eqz v9, :cond_4

    .line 124
    iget v9, v7, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget v10, v6, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iput v10, v7, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iput v9, v6, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 128
    :cond_4
    sget-object v10, Lexpo/modules/imagepicker/MediaType;->VIDEO:Lexpo/modules/imagepicker/MediaType;

    .line 129
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v11

    const-string v3, "toString(...)"

    invoke-static {v11, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    iget v12, v6, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 131
    iget v13, v7, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    const/4 v3, 0x0

    if-eqz v5, :cond_5

    .line 132
    invoke-virtual {v5}, Lexpo/modules/imagepicker/AdditionalFileData;->getFileName()Ljava/lang/String;

    move-result-object v6

    move-object v14, v6

    goto :goto_2

    :cond_5
    move-object v14, v3

    :goto_2
    if-eqz v5, :cond_6

    .line 133
    invoke-virtual {v5}, Lexpo/modules/imagepicker/AdditionalFileData;->getFileSize()Ljava/lang/Long;

    move-result-object v3

    :cond_6
    move-object v15, v3

    const/16 v3, 0x9

    .line 135
    invoke-static {v4, v3}, Lexpo/modules/imagepicker/ImagePickerUtilsKt;->extractInt(Landroid/media/MediaMetadataRetriever;I)I

    move-result v3

    .line 137
    invoke-static {v0}, Lexpo/modules/imagepicker/ImagePickerUtilsKt;->getMediaStoreAssetId(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v9

    move v0, v8

    .line 127
    new-instance v8, Lexpo/modules/imagepicker/ImagePickerAsset;

    .line 135
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v19

    .line 136
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v20

    const/16 v21, 0x300

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    .line 127
    invoke-direct/range {v8 .. v22}, Lexpo/modules/imagepicker/ImagePickerAsset;-><init>(Ljava/lang/String;Lexpo/modules/imagepicker/MediaType;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    :try_end_0
    .catch Lexpo/modules/imagepicker/FailedToExtractVideoMetadataException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v8

    :catch_0
    move-exception v0

    .line 140
    new-instance v3, Lexpo/modules/imagepicker/FailedToExtractVideoMetadataException;

    check-cast v0, Ljava/lang/Throwable;

    invoke-direct {v3, v2, v0}, Lexpo/modules/imagepicker/FailedToExtractVideoMetadataException;-><init>(Ljava/io/File;Ljava/lang/Throwable;)V

    throw v3
.end method


# virtual methods
.method public final readExtras$expo_image_picker_release(Ljava/util/List;Lexpo/modules/imagepicker/ImagePickerOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lkotlin/Pair<",
            "+",
            "Lexpo/modules/imagepicker/MediaType;",
            "+",
            "Landroid/net/Uri;",
            ">;>;",
            "Lexpo/modules/imagepicker/ImagePickerOptions;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lexpo/modules/imagepicker/ImagePickerResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;

    iget v3, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v1, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->label:I

    sub-int/2addr v1, v4

    iput v1, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;

    invoke-direct {v2, v0, v1}, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;-><init>(Lexpo/modules/imagepicker/MediaHandler;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v1, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 22
    iget v4, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->label:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v4, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$3:Ljava/lang/Object;

    check-cast v4, Ljava/util/Collection;

    iget-object v7, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$2:Ljava/lang/Object;

    check-cast v7, Ljava/util/Iterator;

    iget-object v8, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$1:Ljava/lang/Object;

    check-cast v8, Ljava/util/Collection;

    iget-object v9, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$0:Ljava/lang/Object;

    check-cast v9, Lexpo/modules/imagepicker/ImagePickerOptions;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v4, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$3:Ljava/lang/Object;

    check-cast v4, Ljava/util/Collection;

    iget-object v7, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$2:Ljava/lang/Object;

    check-cast v7, Ljava/util/Iterator;

    iget-object v8, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$1:Ljava/lang/Object;

    check-cast v8, Ljava/util/Collection;

    iget-object v9, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$0:Ljava/lang/Object;

    check-cast v9, Lexpo/modules/imagepicker/ImagePickerOptions;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_3
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 26
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Iterable;

    .line 151
    new-instance v4, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v1, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .line 152
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v7, v1

    move-object/from16 v1, p2

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 153
    check-cast v8, Lkotlin/Pair;

    invoke-virtual {v8}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/imagepicker/MediaType;

    invoke-virtual {v8}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/net/Uri;

    const/4 v10, -0x1

    if-nez v9, :cond_4

    move v9, v10

    goto :goto_2

    .line 27
    :cond_4
    sget-object v11, Lexpo/modules/imagepicker/MediaHandler$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v9}, Lexpo/modules/imagepicker/MediaType;->ordinal()I

    move-result v9

    aget v9, v11, v9

    :goto_2
    if-eq v9, v10, :cond_9

    if-eq v9, v6, :cond_7

    if-ne v9, v5, :cond_6

    .line 29
    iput-object v1, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$0:Ljava/lang/Object;

    iput-object v4, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$1:Ljava/lang/Object;

    iput-object v7, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$2:Ljava/lang/Object;

    iput-object v4, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$3:Ljava/lang/Object;

    iput v5, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->label:I

    invoke-direct {v0, v8, v1, v2}, Lexpo/modules/imagepicker/MediaHandler;->handleImage(Landroid/net/Uri;Lexpo/modules/imagepicker/ImagePickerOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v3, :cond_5

    goto :goto_4

    :cond_5
    move-object v9, v1

    move-object v1, v8

    move-object v8, v4

    :goto_3
    check-cast v1, Lexpo/modules/imagepicker/ImagePickerAsset;

    goto :goto_6

    .line 27
    :cond_6
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    .line 28
    :cond_7
    iput-object v1, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$0:Ljava/lang/Object;

    iput-object v4, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$1:Ljava/lang/Object;

    iput-object v7, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$2:Ljava/lang/Object;

    iput-object v4, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$3:Ljava/lang/Object;

    iput v6, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->label:I

    invoke-direct {v0, v8, v2}, Lexpo/modules/imagepicker/MediaHandler;->handleVideo(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v3, :cond_8

    :goto_4
    return-object v3

    :cond_8
    move-object v9, v1

    move-object v1, v8

    move-object v8, v4

    :goto_5
    check-cast v1, Lexpo/modules/imagepicker/ImagePickerAsset;

    goto :goto_6

    .line 30
    :cond_9
    new-instance v10, Lexpo/modules/imagepicker/ImagePickerAsset;

    .line 32
    invoke-virtual {v8}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v13

    const-string v8, "toString(...)"

    invoke-static {v13, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v23, 0xff9

    const/16 v24, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    .line 30
    invoke-direct/range {v10 .. v24}, Lexpo/modules/imagepicker/ImagePickerAsset;-><init>(Ljava/lang/String;Lexpo/modules/imagepicker/MediaType;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v9, v1

    move-object v8, v4

    move-object v1, v10

    .line 153
    :goto_6
    invoke-interface {v4, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v4, v8

    move-object v1, v9

    goto/16 :goto_1

    .line 154
    :cond_a
    check-cast v4, Ljava/util/List;

    .line 37
    new-instance v1, Lexpo/modules/imagepicker/ImagePickerResponse;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v4}, Lexpo/modules/imagepicker/ImagePickerResponse;-><init>(ZLjava/util/List;)V

    return-object v1
.end method
