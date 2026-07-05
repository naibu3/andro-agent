.class public final Lcom/stripe/android/view/CardNumberEditText$onAttachedToWindow$lambda$11$$inlined$launchAndCollect$default$1$1$1;
.super Ljava/lang/Object;
.source "CardWidgetViewModel.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/CardNumberEditText$onAttachedToWindow$lambda$11$$inlined$launchAndCollect$default$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/FlowCollector;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCardWidgetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardWidgetViewModel.kt\ncom/stripe/android/view/CardWidgetViewModelKt$launchAndCollect$1$1$1\n+ 2 CardNumberEditText.kt\ncom/stripe/android/view/CardNumberEditText\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n242#2,3:128\n246#2,7:135\n1557#3:131\n1628#3,3:132\n*S KotlinDebug\n*F\n+ 1 CardNumberEditText.kt\ncom/stripe/android/view/CardNumberEditText\n*L\n244#1:131\n244#1:132,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/view/CardNumberEditText;


# direct methods
.method public constructor <init>(Lcom/stripe/android/view/CardNumberEditText;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$onAttachedToWindow$lambda$11$$inlined$launchAndCollect$default$1$1$1;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 126
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 128
    iget-object p2, p0, Lcom/stripe/android/view/CardNumberEditText$onAttachedToWindow$lambda$11$$inlined$launchAndCollect$default$1$1$1;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p2, p1}, Lcom/stripe/android/view/CardNumberEditText;->access$setCbcEligible$p(Lcom/stripe/android/view/CardNumberEditText;Z)V

    .line 130
    iget-object p2, p0, Lcom/stripe/android/view/CardNumberEditText$onAttachedToWindow$lambda$11$$inlined$launchAndCollect$default$1$1$1;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p2}, Lcom/stripe/android/view/CardNumberEditText;->getAccountRangeService()Lcom/stripe/android/cards/CardAccountRangeService;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/cards/CardAccountRangeService;->getAccountRanges()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    .line 131
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 132
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 133
    check-cast v1, Lcom/stripe/android/model/AccountRange;

    .line 130
    invoke-virtual {v1}, Lcom/stripe/android/model/AccountRange;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v1

    .line 133
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 134
    :cond_0
    check-cast v0, Ljava/util/List;

    .line 131
    check-cast v0, Ljava/lang/Iterable;

    .line 130
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->distinct(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    if-eqz p1, :cond_2

    .line 136
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$onAttachedToWindow$lambda$11$$inlined$launchAndCollect$default$1$1$1;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/CardBrand;

    if-nez v0, :cond_1

    sget-object v0, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    :cond_1
    invoke-virtual {p1, v0}, Lcom/stripe/android/view/CardNumberEditText;->setImplicitCardBrandForCbc$payments_core_release(Lcom/stripe/android/model/CardBrand;)V

    .line 137
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$onAttachedToWindow$lambda$11$$inlined$launchAndCollect$default$1$1$1;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/CardNumberEditText;->setPossibleCardBrands$payments_core_release(Ljava/util/List;)V

    goto :goto_1

    .line 139
    :cond_2
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$onAttachedToWindow$lambda$11$$inlined$launchAndCollect$default$1$1$1;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->singleOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/model/CardBrand;

    if-nez p2, :cond_3

    sget-object p2, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    :cond_3
    invoke-virtual {p1, p2}, Lcom/stripe/android/view/CardNumberEditText;->setCardBrand$payments_core_release(Lcom/stripe/android/model/CardBrand;)V

    .line 127
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
