.class final Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "ShopPayViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/shoppay/ShopPayViewModel;->handleSuccessfulPayment(Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.stripe.android.shoppay.ShopPayViewModel"
    f = "ShopPayViewModel.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x6f,
        0x73,
        0x79
    }
    m = "handleSuccessfulPayment"
    n = {
        "this",
        "shippingAddressData",
        "this",
        "shippingAddressData",
        "paymentMethod"
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$2"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/stripe/android/shoppay/ShopPayViewModel;


# direct methods
.method constructor <init>(Lcom/stripe/android/shoppay/ShopPayViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/shoppay/ShopPayViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;->this$0:Lcom/stripe/android/shoppay/ShopPayViewModel;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;->label:I

    iget-object p1, p0, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;->this$0:Lcom/stripe/android/shoppay/ShopPayViewModel;

    const/4 v0, 0x0

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    invoke-static {p1, v0, v1}, Lcom/stripe/android/shoppay/ShopPayViewModel;->access$handleSuccessfulPayment(Lcom/stripe/android/shoppay/ShopPayViewModel;Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
