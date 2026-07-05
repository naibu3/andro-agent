.class public final Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$calculateShipping$$inlined$handleRequest$default$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "DefaultShopPayBridgeHandler.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;->calculateShipping(Ljava/lang/String;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Ljava/lang/String;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDefaultShopPayBridgeHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultShopPayBridgeHandler.kt\ncom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$handleRequest$2$1\n+ 2 DefaultShopPayBridgeHandler.kt\ncom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,192:1\n91#2,17:193\n108#2:214\n109#2:219\n110#2:221\n1557#3:210\n1628#3,3:211\n1557#3:215\n1628#3,3:216\n1#4:220\n*S KotlinDebug\n*F\n+ 1 DefaultShopPayBridgeHandler.kt\ncom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler\n*L\n107#1:210\n107#1:211,3\n108#1:215\n108#1:216,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a8\u0006\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;",
        "com/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$handleRequest$2$1"
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
    c = "com.stripe.android.shoppay.bridge.DefaultShopPayBridgeHandler$calculateShipping$$inlined$handleRequest$default$1"
    f = "DefaultShopPayBridgeHandler.kt"
    i = {}
    l = {
        0xce
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $jsonObject:Lorg/json/JSONObject;

.field final synthetic $this_runCatching:Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;


# direct methods
.method public constructor <init>(Lorg/json/JSONObject;Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;Lkotlin/coroutines/Continuation;Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$calculateShipping$$inlined$handleRequest$default$1;->$jsonObject:Lorg/json/JSONObject;

    iput-object p2, p0, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$calculateShipping$$inlined$handleRequest$default$1;->$this_runCatching:Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;

    iput-object p4, p0, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$calculateShipping$$inlined$handleRequest$default$1;->this$0:Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance p1, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$calculateShipping$$inlined$handleRequest$default$1;

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$calculateShipping$$inlined$handleRequest$default$1;->$jsonObject:Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$calculateShipping$$inlined$handleRequest$default$1;->$this_runCatching:Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;

    iget-object v2, p0, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$calculateShipping$$inlined$handleRequest$default$1;->this$0:Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;

    invoke-direct {p1, v0, v1, p2, v2}, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$calculateShipping$$inlined$handleRequest$default$1;-><init>(Lorg/json/JSONObject;Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;Lkotlin/coroutines/Continuation;Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$calculateShipping$$inlined$handleRequest$default$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$calculateShipping$$inlined$handleRequest$default$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$calculateShipping$$inlined$handleRequest$default$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$calculateShipping$$inlined$handleRequest$default$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 0
    iget v1, p0, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$calculateShipping$$inlined$handleRequest$default$1;->label:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 191
    iget-object p1, p0, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$calculateShipping$$inlined$handleRequest$default$1;->$jsonObject:Lorg/json/JSONObject;

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    .line 193
    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$calculateShipping$$inlined$handleRequest$default$1;->this$0:Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;

    invoke-static {v1}, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;->access$getShippingRateRequestJsonParser$p(Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;)Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/stripe/android/core/model/parsers/ModelJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/model/StripeModel;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequest;

    if-eqz p1, :cond_b

    .line 196
    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$calculateShipping$$inlined$handleRequest$default$1;->this$0:Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Parsed calculateShipping request: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x2

    invoke-static {v1, v4, v3, v5, v3}, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;->logMessage$default(Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 198
    invoke-virtual {p1}, Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequest;->getShippingAddress()Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequest$ShippingAddress;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequest$ShippingAddress;->getAddress()Lcom/stripe/android/shoppay/bridge/ECEPartialAddress;

    move-result-object p1

    .line 199
    new-instance v1, Lcom/stripe/android/paymentsheet/ShopPayHandlers$SelectedAddress;

    .line 200
    invoke-virtual {p1}, Lcom/stripe/android/shoppay/bridge/ECEPartialAddress;->getCity()Ljava/lang/String;

    move-result-object v4

    const-string v5, ""

    if-nez v4, :cond_2

    move-object v4, v5

    .line 201
    :cond_2
    invoke-virtual {p1}, Lcom/stripe/android/shoppay/bridge/ECEPartialAddress;->getState()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_3

    move-object v6, v5

    .line 202
    :cond_3
    invoke-virtual {p1}, Lcom/stripe/android/shoppay/bridge/ECEPartialAddress;->getPostalCode()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_4

    move-object v7, v5

    .line 203
    :cond_4
    invoke-virtual {p1}, Lcom/stripe/android/shoppay/bridge/ECEPartialAddress;->getCountry()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    move-object v5, p1

    .line 199
    :goto_0
    invoke-direct {v1, v4, v6, v7, v5}, Lcom/stripe/android/paymentsheet/ShopPayHandlers$SelectedAddress;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    iget-object p1, p0, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$calculateShipping$$inlined$handleRequest$default$1;->this$0:Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;

    invoke-static {p1}, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;->access$getShopPayHandlers$p(Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;)Lcom/stripe/android/paymentsheet/ShopPayHandlers;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ShopPayHandlers;->getShippingContactHandler()Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingContactHandler;

    move-result-object p1

    iput v2, p0, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$calculateShipping$$inlined$handleRequest$default$1;->label:I

    invoke-interface {p1, v1, p0}, Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingContactHandler;->onAddressSelected(Lcom/stripe/android/paymentsheet/ShopPayHandlers$SelectedAddress;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_6
    :goto_1
    check-cast p1, Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingContactUpdate;

    if-nez p1, :cond_7

    goto/16 :goto_5

    .line 209
    :cond_7
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingContactUpdate;->getLineItems()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 210
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 211
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 212
    check-cast v3, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$LineItem;

    .line 209
    invoke-static {v3}, Lcom/stripe/android/shoppay/bridge/ShopPayMapperKt;->toECELineItem(Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$LineItem;)Lcom/stripe/android/shoppay/bridge/ECELineItem;

    move-result-object v3

    .line 212
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 213
    :cond_8
    check-cast v1, Ljava/util/List;

    .line 214
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingContactUpdate;->getShippingRates()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 215
    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .line 216
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 217
    check-cast v2, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;

    .line 214
    invoke-static {v2}, Lcom/stripe/android/shoppay/bridge/ShopPayMapperKt;->toECEShippingRate(Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;)Lcom/stripe/android/shoppay/bridge/ECEShippingRate;

    move-result-object v2

    .line 217
    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 218
    :cond_9
    check-cast v3, Ljava/util/List;

    .line 219
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingContactUpdate;->getLineItems()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$LineItem;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$LineItem;->getAmount()I

    move-result v2

    add-int/2addr v0, v2

    goto :goto_4

    :cond_a
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object p1

    .line 208
    new-instance v0, Lcom/stripe/android/shoppay/bridge/ShippingResponse;

    invoke-direct {v0, v1, v3, p1}, Lcom/stripe/android/shoppay/bridge/ShippingResponse;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)V

    move-object v3, v0

    .line 191
    :goto_5
    check-cast v3, Lcom/stripe/android/shoppay/bridge/JsonSerializer;

    .line 192
    iget-object p1, p0, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$calculateShipping$$inlined$handleRequest$default$1;->$this_runCatching:Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;

    invoke-static {p1, v3}, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;->access$wrapInBridgeResponse(Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;Lcom/stripe/android/shoppay/bridge/JsonSerializer;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 194
    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed to parse shipping rate request"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
