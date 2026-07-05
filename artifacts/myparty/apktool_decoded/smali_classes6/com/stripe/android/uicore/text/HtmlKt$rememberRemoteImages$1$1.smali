.class final Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "Html.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/text/HtmlKt;->rememberRemoteImages-XiPi2c8(Landroidx/compose/ui/text/AnnotatedString;Ljava/util/Map;Lcom/stripe/android/uicore/image/StripeImageLoader;ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHtml.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Html.kt\ncom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,480:1\n1557#2:481\n1628#2,3:482\n1611#2,9:485\n1863#2:494\n1864#2:496\n1620#2:497\n1246#2,4:500\n1#3:495\n462#4:498\n412#4:499\n*S KotlinDebug\n*F\n+ 1 Html.kt\ncom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1\n*L\n159#1:481\n159#1:482,3\n165#1:485,9\n165#1:494\n165#1:496\n165#1:497\n170#1:500,4\n165#1:495\n170#1:498\n170#1:499\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
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
    c = "com.stripe.android.uicore.text.HtmlKt$rememberRemoteImages$1$1"
    f = "Html.kt"
    i = {}
    l = {
        0xa5
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $imageAlign:I

.field final synthetic $localDensity:Landroidx/compose/ui/unit/Density;

.field final synthetic $onLoaded:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $remoteImages:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroidx/compose/foundation/text/InlineTextContent;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $remoteUrls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/ui/text/AnnotatedString$Range<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $stripeImageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Ljava/util/List;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/uicore/image/StripeImageLoader;Landroidx/compose/ui/unit/Density;ILkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/ui/text/AnnotatedString$Range<",
            "Ljava/lang/String;",
            ">;>;",
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroidx/compose/foundation/text/InlineTextContent;",
            ">;>;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/uicore/image/StripeImageLoader;",
            "Landroidx/compose/ui/unit/Density;",
            "I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;->$remoteUrls:Ljava/util/List;

    iput-object p2, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;->$remoteImages:Lkotlinx/coroutines/flow/MutableStateFlow;

    iput-object p3, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;->$onLoaded:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;->$stripeImageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iput-object p5, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;->$localDensity:Landroidx/compose/ui/unit/Density;

    iput p6, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;->$imageAlign:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 8
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

    new-instance v0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;

    iget-object v1, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;->$remoteUrls:Ljava/util/List;

    iget-object v2, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;->$remoteImages:Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v3, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;->$onLoaded:Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;->$stripeImageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iget-object v5, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;->$localDensity:Landroidx/compose/ui/unit/Density;

    iget v6, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;->$imageAlign:I

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;-><init>(Ljava/util/List;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/uicore/image/StripeImageLoader;Landroidx/compose/ui/unit/Density;ILkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 158
    iget v2, v0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v4, :cond_0

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v2, v0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;->L$0:Ljava/lang/Object;

    move-object v5, v2

    check-cast v5, Lkotlinx/coroutines/CoroutineScope;

    .line 159
    iget-object v2, v0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;->$remoteUrls:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    iget-object v11, v0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;->$stripeImageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    .line 481
    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v2, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    move-object v12, v6

    check-cast v12, Ljava/util/Collection;

    .line 482
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 483
    check-cast v6, Landroidx/compose/ui/text/AnnotatedString$Range;

    .line 160
    new-instance v7, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1$deferred$1$1;

    invoke-direct {v7, v6, v11, v3}, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1$deferred$1$1;-><init>(Landroidx/compose/ui/text/AnnotatedString$Range;Lcom/stripe/android/uicore/image/StripeImageLoader;Lkotlin/coroutines/Continuation;)V

    move-object v8, v7

    check-cast v8, Lkotlin/jvm/functions/Function2;

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/BuildersKt;->async$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;

    move-result-object v6

    .line 483
    invoke-interface {v12, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 484
    :cond_2
    check-cast v12, Ljava/util/List;

    .line 165
    check-cast v12, Ljava/util/Collection;

    move-object v2, v0

    check-cast v2, Lkotlin/coroutines/Continuation;

    iput v4, v0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;->label:I

    invoke-static {v12, v2}, Lkotlinx/coroutines/AwaitKt;->awaitAll(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3

    return-object v1

    .line 158
    :cond_3
    :goto_1
    check-cast v2, Ljava/lang/Iterable;

    .line 485
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 494
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 493
    check-cast v5, Lkotlin/Pair;

    .line 166
    invoke-virtual {v5}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/graphics/Bitmap;

    if-eqz v6, :cond_5

    .line 167
    new-instance v7, Lkotlin/Pair;

    invoke-virtual {v5}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v5

    invoke-direct {v7, v5, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :cond_5
    move-object v7, v3

    :goto_3
    if-eqz v7, :cond_4

    .line 493
    invoke-interface {v1, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 497
    :cond_6
    check-cast v1, Ljava/util/List;

    .line 485
    check-cast v1, Ljava/lang/Iterable;

    .line 169
    invoke-static {v1}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    .line 170
    iget-object v2, v0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;->$remoteImages:Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v3, v0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;->$localDensity:Landroidx/compose/ui/unit/Density;

    iget v10, v0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;->$imageAlign:I

    iget-object v12, v0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;->$stripeImageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    .line 498
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v6

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/LinkedHashMap;-><init>(I)V

    move-object v13, v5

    check-cast v13, Ljava/util/Map;

    .line 499
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 500
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 501
    move-object v14, v5

    check-cast v14, Ljava/util/Map$Entry;

    .line 499
    invoke-interface {v14}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v15

    .line 173
    invoke-interface {v14}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/Bitmap;

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    int-to-float v5, v5

    .line 174
    invoke-interface {v14}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/graphics/Bitmap;

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    int-to-float v6, v6

    .line 172
    invoke-static {v5, v6}, Landroidx/compose/ui/geometry/SizeKt;->Size(FF)J

    move-result-wide v5

    int-to-float v7, v4

    .line 175
    invoke-interface {v3}, Landroidx/compose/ui/unit/Density;->getDensity()F

    move-result v8

    div-float/2addr v7, v8

    invoke-static {v5, v6, v7}, Landroidx/compose/ui/geometry/Size;->times-7Ah8Wj8(JF)J

    move-result-wide v5

    .line 177
    new-instance v7, Landroidx/compose/foundation/text/InlineTextContent;

    move-wide v8, v5

    .line 178
    new-instance v5, Landroidx/compose/ui/text/Placeholder;

    .line 179
    invoke-static {v8, v9}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v6

    invoke-static {v6}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(F)J

    move-result-wide v16

    .line 180
    invoke-static {v8, v9}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result v6

    invoke-static {v6}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(F)J

    move-result-wide v18

    const/4 v11, 0x0

    move-object/from16 p1, v1

    move-object/from16 v20, v7

    move-wide v0, v8

    move-wide/from16 v6, v16

    move-wide/from16 v8, v18

    .line 178
    invoke-direct/range {v5 .. v11}, Landroidx/compose/ui/text/Placeholder;-><init>(JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 183
    new-instance v6, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1$1$1;

    invoke-direct {v6, v14, v12, v0, v1}, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1$1$1;-><init>(Ljava/util/Map$Entry;Lcom/stripe/android/uicore/image/StripeImageLoader;J)V

    const v0, 0x33320e15

    invoke-static {v0, v4, v6}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function3;

    move-object/from16 v1, v20

    .line 177
    invoke-direct {v1, v5, v0}, Landroidx/compose/foundation/text/InlineTextContent;-><init>(Landroidx/compose/ui/text/Placeholder;Lkotlin/jvm/functions/Function3;)V

    .line 501
    invoke-interface {v13, v15, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    goto :goto_4

    .line 170
    :cond_7
    invoke-interface {v2, v13}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    move-object/from16 v0, p0

    .line 195
    iget-object v1, v0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1;->$onLoaded:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 196
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method
