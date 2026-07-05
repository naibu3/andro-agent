.class public final Lcom/stripe/android/IssuingCardPinService$ephemeralKeyManager$1;
.super Ljava/lang/Object;
.source "IssuingCardPinService.kt"

# interfaces
.implements Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/IssuingCardPinService;-><init>(Lcom/stripe/android/EphemeralKeyProvider;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/OperationIdFactory;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J(\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016\u00a8\u0006\u0010"
    }
    d2 = {
        "com/stripe/android/IssuingCardPinService$ephemeralKeyManager$1",
        "Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;",
        "onKeyUpdate",
        "",
        "ephemeralKey",
        "Lcom/stripe/android/EphemeralKey;",
        "operation",
        "Lcom/stripe/android/EphemeralOperation;",
        "onKeyError",
        "operationId",
        "",
        "errorCode",
        "",
        "errorMessage",
        "throwable",
        "",
        "payments-core_release"
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
.field final synthetic this$0:Lcom/stripe/android/IssuingCardPinService;


# direct methods
.method constructor <init>(Lcom/stripe/android/IssuingCardPinService;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/IssuingCardPinService$ephemeralKeyManager$1;->this$0:Lcom/stripe/android/IssuingCardPinService;

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKeyError(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    const-string p2, "operationId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "errorMessage"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "throwable"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    iget-object p2, p0, Lcom/stripe/android/IssuingCardPinService$ephemeralKeyManager$1;->this$0:Lcom/stripe/android/IssuingCardPinService;

    invoke-static {p2}, Lcom/stripe/android/IssuingCardPinService;->access$getUpdateListeners$p(Lcom/stripe/android/IssuingCardPinService;)Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/IssuingCardPinService$IssuingCardPinUpdateListener;

    .line 69
    iget-object p4, p0, Lcom/stripe/android/IssuingCardPinService$ephemeralKeyManager$1;->this$0:Lcom/stripe/android/IssuingCardPinService;

    invoke-static {p4}, Lcom/stripe/android/IssuingCardPinService;->access$getRetrievalListeners$p(Lcom/stripe/android/IssuingCardPinService;)Ljava/util/Map;

    move-result-object p4

    invoke-interface {p4, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/IssuingCardPinService$IssuingCardPinRetrievalListener;

    const/4 p4, 0x0

    if-eqz p1, :cond_0

    .line 71
    sget-object p2, Lcom/stripe/android/IssuingCardPinService$CardPinActionError;->EPHEMERAL_KEY_ERROR:Lcom/stripe/android/IssuingCardPinService$CardPinActionError;

    .line 70
    invoke-interface {p1, p2, p3, p4}, Lcom/stripe/android/IssuingCardPinService$IssuingCardPinRetrievalListener;->onError(Lcom/stripe/android/IssuingCardPinService$CardPinActionError;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    if-eqz p2, :cond_1

    .line 75
    sget-object p1, Lcom/stripe/android/IssuingCardPinService$CardPinActionError;->EPHEMERAL_KEY_ERROR:Lcom/stripe/android/IssuingCardPinService$CardPinActionError;

    .line 74
    invoke-interface {p2, p1, p3, p4}, Lcom/stripe/android/IssuingCardPinService$IssuingCardPinUpdateListener;->onError(Lcom/stripe/android/IssuingCardPinService$CardPinActionError;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public onKeyUpdate(Lcom/stripe/android/EphemeralKey;Lcom/stripe/android/EphemeralOperation;)V
    .locals 2

    const-string v0, "ephemeralKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "operation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    instance-of v0, p2, Lcom/stripe/android/EphemeralOperation$Issuing$RetrievePin;

    if-eqz v0, :cond_1

    .line 42
    iget-object v0, p0, Lcom/stripe/android/IssuingCardPinService$ephemeralKeyManager$1;->this$0:Lcom/stripe/android/IssuingCardPinService;

    invoke-static {v0}, Lcom/stripe/android/IssuingCardPinService;->access$getRetrievalListeners$p(Lcom/stripe/android/IssuingCardPinService;)Ljava/util/Map;

    move-result-object v0

    check-cast p2, Lcom/stripe/android/EphemeralOperation$Issuing$RetrievePin;

    invoke-virtual {p2}, Lcom/stripe/android/EphemeralOperation$Issuing$RetrievePin;->getId$payments_core_release()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/IssuingCardPinService$IssuingCardPinRetrievalListener;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/stripe/android/IssuingCardPinService$ephemeralKeyManager$1;->this$0:Lcom/stripe/android/IssuingCardPinService;

    .line 43
    invoke-static {v1, p1, p2, v0}, Lcom/stripe/android/IssuingCardPinService;->access$fireRetrievePinRequest(Lcom/stripe/android/IssuingCardPinService;Lcom/stripe/android/EphemeralKey;Lcom/stripe/android/EphemeralOperation$Issuing$RetrievePin;Lcom/stripe/android/IssuingCardPinService$IssuingCardPinRetrievalListener;)V

    return-void

    .line 48
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/IssuingCardPinService$ephemeralKeyManager$1;->this$0:Lcom/stripe/android/IssuingCardPinService;

    invoke-static {p1}, Lcom/stripe/android/IssuingCardPinService;->access$logMissingListener(Lcom/stripe/android/IssuingCardPinService;)V

    return-void

    .line 50
    :cond_1
    instance-of v0, p2, Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;

    if-eqz v0, :cond_3

    .line 51
    iget-object v0, p0, Lcom/stripe/android/IssuingCardPinService$ephemeralKeyManager$1;->this$0:Lcom/stripe/android/IssuingCardPinService;

    invoke-static {v0}, Lcom/stripe/android/IssuingCardPinService;->access$getUpdateListeners$p(Lcom/stripe/android/IssuingCardPinService;)Ljava/util/Map;

    move-result-object v0

    check-cast p2, Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;

    invoke-virtual {p2}, Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;->getId$payments_core_release()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/IssuingCardPinService$IssuingCardPinUpdateListener;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/stripe/android/IssuingCardPinService$ephemeralKeyManager$1;->this$0:Lcom/stripe/android/IssuingCardPinService;

    .line 52
    invoke-static {v1, p1, p2, v0}, Lcom/stripe/android/IssuingCardPinService;->access$fireUpdatePinRequest(Lcom/stripe/android/IssuingCardPinService;Lcom/stripe/android/EphemeralKey;Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;Lcom/stripe/android/IssuingCardPinService$IssuingCardPinUpdateListener;)V

    return-void

    .line 57
    :cond_2
    iget-object p1, p0, Lcom/stripe/android/IssuingCardPinService$ephemeralKeyManager$1;->this$0:Lcom/stripe/android/IssuingCardPinService;

    invoke-static {p1}, Lcom/stripe/android/IssuingCardPinService;->access$logMissingListener(Lcom/stripe/android/IssuingCardPinService;)V

    :cond_3
    return-void
.end method
