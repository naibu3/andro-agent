.class final Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$setSelectedPaymentOption$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "ReactNativeCustomerAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->setSelectedPaymentOption(Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.reactnativestripesdk.ReactNativeCustomerAdapter"
    f = "ReactNativeCustomerAdapter.kt"
    i = {}
    l = {
        0x4c,
        0x51
    }
    m = "setSelectedPaymentOption"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;


# direct methods
.method constructor <init>(Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$setSelectedPaymentOption$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$setSelectedPaymentOption$1;->this$0:Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$setSelectedPaymentOption$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$setSelectedPaymentOption$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$setSelectedPaymentOption$1;->label:I

    iget-object p1, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$setSelectedPaymentOption$1;->this$0:Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;

    const/4 v0, 0x0

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0, v1}, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->setSelectedPaymentOption(Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
