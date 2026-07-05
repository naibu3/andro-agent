.class public final synthetic Lcom/reactnativestripesdk/EmbeddedPaymentElementView$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/reactnativestripesdk/EmbeddedPaymentElementView;

.field public final synthetic f$1:Lkotlinx/coroutines/CoroutineScope;


# direct methods
.method public synthetic constructor <init>(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;Lkotlinx/coroutines/CoroutineScope;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$$ExternalSyntheticLambda0;->f$0:Lcom/reactnativestripesdk/EmbeddedPaymentElementView;

    iput-object p2, p0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$$ExternalSyntheticLambda0;->f$1:Lkotlinx/coroutines/CoroutineScope;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$$ExternalSyntheticLambda0;->f$0:Lcom/reactnativestripesdk/EmbeddedPaymentElementView;

    iget-object v1, p0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$$ExternalSyntheticLambda0;->f$1:Lkotlinx/coroutines/CoroutineScope;

    check-cast p1, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;

    check-cast p2, Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    invoke-static {v0, v1, p1, p2}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->$r8$lambda$XZhGUhtXDnzXOXjUvAa4v7YPliA(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
