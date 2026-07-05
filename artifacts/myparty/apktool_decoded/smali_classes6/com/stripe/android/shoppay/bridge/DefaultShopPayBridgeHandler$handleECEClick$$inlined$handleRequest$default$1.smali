.class public final Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$handleECEClick$$inlined$handleRequest$default$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "DefaultShopPayBridgeHandler.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;->handleECEClick(Ljava/lang/String;)Ljava/lang/String;
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
    value = "SMAP\nDefaultShopPayBridgeHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultShopPayBridgeHandler.kt\ncom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$handleRequest$2$1\n+ 2 DefaultShopPayBridgeHandler.kt\ncom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,192:1\n53#2,10:193\n65#2:207\n63#2,2:208\n66#2,8:214\n1557#3:203\n1628#3,3:204\n1557#3:210\n1628#3,3:211\n*S KotlinDebug\n*F\n+ 1 DefaultShopPayBridgeHandler.kt\ncom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler\n*L\n62#1:203\n62#1:204,3\n65#1:210\n65#1:211,3\n*E\n"
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
    c = "com.stripe.android.shoppay.bridge.DefaultShopPayBridgeHandler$handleECEClick$$inlined$handleRequest$default$1"
    f = "DefaultShopPayBridgeHandler.kt"
    i = {}
    l = {}
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

    iput-object p1, p0, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$handleECEClick$$inlined$handleRequest$default$1;->$jsonObject:Lorg/json/JSONObject;

    iput-object p2, p0, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$handleECEClick$$inlined$handleRequest$default$1;->$this_runCatching:Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;

    iput-object p4, p0, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$handleECEClick$$inlined$handleRequest$default$1;->this$0:Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;

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

    new-instance p1, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$handleECEClick$$inlined$handleRequest$default$1;

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$handleECEClick$$inlined$handleRequest$default$1;->$jsonObject:Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$handleECEClick$$inlined$handleRequest$default$1;->$this_runCatching:Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;

    iget-object v2, p0, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$handleECEClick$$inlined$handleRequest$default$1;->this$0:Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;

    invoke-direct {p1, v0, v1, p2, v2}, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$handleECEClick$$inlined$handleRequest$default$1;-><init>(Lorg/json/JSONObject;Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;Lkotlin/coroutines/Continuation;Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$handleECEClick$$inlined$handleRequest$default$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$handleECEClick$$inlined$handleRequest$default$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$handleECEClick$$inlined$handleRequest$default$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$handleECEClick$$inlined$handleRequest$default$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 0
    iget v1, v0, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$handleECEClick$$inlined$handleRequest$default$1;->label:I

    if-nez v1, :cond_6

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 191
    iget-object v1, v0, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$handleECEClick$$inlined$handleRequest$default$1;->$jsonObject:Lorg/json/JSONObject;

    move-object v2, v0

    check-cast v2, Lkotlin/coroutines/Continuation;

    .line 193
    iget-object v2, v0, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$handleECEClick$$inlined$handleRequest$default$1;->this$0:Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;

    invoke-static {v2}, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;->access$getHandleClickRequestJsonParser$p(Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;)Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    move-result-object v2

    invoke-interface {v2, v1}, Lcom/stripe/android/core/model/parsers/ModelJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/model/StripeModel;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/shoppay/bridge/HandleClickRequest;

    if-eqz v1, :cond_5

    .line 196
    iget-object v2, v0, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$handleECEClick$$inlined$handleRequest$default$1;->this$0:Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Parsed handle click request: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v2, v1, v4, v3, v4}, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;->logMessage$default(Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 198
    iget-object v1, v0, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$handleECEClick$$inlined$handleRequest$default$1;->this$0:Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;

    invoke-static {v1}, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;->access$getOnECEClickCallback$p(Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;)Lkotlin/jvm/functions/Function0;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 200
    :cond_0
    iget-object v1, v0, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$handleECEClick$$inlined$handleRequest$default$1;->this$0:Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;

    invoke-static {v1}, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;->access$getShopPayArgs$p(Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;)Lcom/stripe/android/shoppay/ShopPayArgs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/shoppay/ShopPayArgs;->getShopPayConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;

    move-result-object v1

    .line 202
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->getLineItems()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 203
    new-instance v3, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .line 204
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 205
    check-cast v6, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$LineItem;

    .line 202
    invoke-static {v6}, Lcom/stripe/android/shoppay/bridge/ShopPayMapperKt;->toECELineItem(Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$LineItem;)Lcom/stripe/android/shoppay/bridge/ECELineItem;

    move-result-object v6

    .line 205
    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 206
    :cond_1
    move-object v8, v3

    check-cast v8, Ljava/util/List;

    .line 208
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->getShippingRates()Ljava/util/List;

    move-result-object v2

    .line 209
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->getShippingAddressRequired()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    move-object v2, v4

    :goto_1
    if-eqz v2, :cond_4

    .line 208
    check-cast v2, Ljava/lang/Iterable;

    .line 210
    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .line 211
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 212
    check-cast v4, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;

    .line 207
    invoke-static {v4}, Lcom/stripe/android/shoppay/bridge/ShopPayMapperKt;->toECEShippingRate(Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;)Lcom/stripe/android/shoppay/bridge/ECEShippingRate;

    move-result-object v4

    .line 212
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 213
    :cond_3
    move-object v4, v3

    check-cast v4, Ljava/util/List;

    :cond_4
    move-object v9, v4

    .line 214
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->getBillingAddressRequired()Z

    move-result v2

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v10

    .line 215
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->getEmailRequired()Z

    move-result v2

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v11

    const/4 v2, 0x1

    .line 216
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v12

    .line 217
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->getShippingAddressRequired()Z

    move-result v2

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v13

    .line 218
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->getAllowedShippingCountries()Ljava/util/List;

    move-result-object v14

    .line 219
    iget-object v2, v0, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$handleECEClick$$inlined$handleRequest$default$1;->this$0:Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;

    invoke-static {v2}, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;->access$getShopPayArgs$p(Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;)Lcom/stripe/android/shoppay/ShopPayArgs;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/shoppay/ShopPayArgs;->getBusinessName()Ljava/lang/String;

    move-result-object v15

    .line 220
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->getShopId()Ljava/lang/String;

    move-result-object v16

    .line 201
    new-instance v7, Lcom/stripe/android/shoppay/bridge/HandleClickResponse;

    invoke-direct/range {v7 .. v16}, Lcom/stripe/android/shoppay/bridge/HandleClickResponse;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    check-cast v7, Lcom/stripe/android/shoppay/bridge/JsonSerializer;

    .line 192
    iget-object v1, v0, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$handleECEClick$$inlined$handleRequest$default$1;->$this_runCatching:Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;

    invoke-static {v1, v7}, Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;->access$wrapInBridgeResponse(Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;Lcom/stripe/android/shoppay/bridge/JsonSerializer;)Ljava/lang/String;

    move-result-object v1

    return-object v1

    .line 194
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Failed to parse handle click request"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 0
    :cond_6
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
