.class final Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ConsentLogoHeader.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt;->ConsentLogoHeader(Landroidx/compose/ui/Modifier;Ljava/util/List;ZLandroidx/compose/runtime/Composer;II)V
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
    value = "SMAP\nConsentLogoHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsentLogoHeader.kt\ncom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,278:1\n1557#2:279\n1628#2,3:280\n*S KotlinDebug\n*F\n+ 1 ConsentLogoHeader.kt\ncom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1\n*L\n81#1:279\n81#1:280,3\n*E\n"
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
    c = "com.stripe.android.financialconnections.features.consent.ui.ConsentLogoHeaderKt$ConsentLogoHeader$1$1"
    f = "ConsentLogoHeader.kt"
    i = {}
    l = {
        0x58
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $bitmapLoadSize:I

.field final synthetic $bitmaps$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Landroidx/compose/ui/graphics/ImageBitmap;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $logos:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $placeholderBitmap:Landroidx/compose/ui/graphics/ImageBitmap;

.field final synthetic $stripeImageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Ljava/util/List;Lcom/stripe/android/uicore/image/StripeImageLoader;ILandroidx/compose/ui/graphics/ImageBitmap;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/uicore/image/StripeImageLoader;",
            "I",
            "Landroidx/compose/ui/graphics/ImageBitmap;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Landroidx/compose/ui/graphics/ImageBitmap;",
            ">;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1;->$logos:Ljava/util/List;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1;->$stripeImageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iput p3, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1;->$bitmapLoadSize:I

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1;->$placeholderBitmap:Landroidx/compose/ui/graphics/ImageBitmap;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1;->$bitmaps$delegate:Landroidx/compose/runtime/MutableState;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
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

    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1;->$logos:Ljava/util/List;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1;->$stripeImageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iget v3, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1;->$bitmapLoadSize:I

    iget-object v4, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1;->$placeholderBitmap:Landroidx/compose/ui/graphics/ImageBitmap;

    iget-object v5, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1;->$bitmaps$delegate:Landroidx/compose/runtime/MutableState;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1;-><init>(Ljava/util/List;Lcom/stripe/android/uicore/image/StripeImageLoader;ILandroidx/compose/ui/graphics/ImageBitmap;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 80
    iget v1, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1;->L$0:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lkotlinx/coroutines/CoroutineScope;

    .line 81
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1;->$bitmaps$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1;->$logos:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    iget-object v5, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1;->$stripeImageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iget v7, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1;->$bitmapLoadSize:I

    iget-object v8, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1;->$placeholderBitmap:Landroidx/compose/ui/graphics/ImageBitmap;

    .line 279
    new-instance v4, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v1, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    move-object v10, v4

    check-cast v10, Ljava/util/Collection;

    .line 280
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 281
    move-object v6, v4

    check-cast v6, Ljava/lang/String;

    .line 82
    new-instance v4, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1$1$1;

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1$1$1;-><init>(Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;ILandroidx/compose/ui/graphics/ImageBitmap;Lkotlin/coroutines/Continuation;)V

    move-object v9, v5

    move v11, v7

    move-object v12, v8

    move-object v6, v4

    check-cast v6, Lkotlin/jvm/functions/Function2;

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/BuildersKt;->async$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;

    move-result-object v4

    .line 281
    invoke-interface {v10, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v5, v9

    move v7, v11

    move-object v8, v12

    goto :goto_0

    .line 282
    :cond_2
    check-cast v10, Ljava/util/List;

    .line 279
    check-cast v10, Ljava/util/Collection;

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    .line 88
    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt$ConsentLogoHeader$1$1;->label:I

    invoke-static {v10, v1}, Lkotlinx/coroutines/AwaitKt;->awaitAll(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_3

    return-object v0

    :cond_3
    move-object v0, p1

    move-object p1, v1

    .line 80
    :goto_1
    check-cast p1, Ljava/util/List;

    .line 81
    invoke-static {v0, p1}, Lcom/stripe/android/financialconnections/features/consent/ui/ConsentLogoHeaderKt;->access$ConsentLogoHeader$lambda$5(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    .line 89
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
