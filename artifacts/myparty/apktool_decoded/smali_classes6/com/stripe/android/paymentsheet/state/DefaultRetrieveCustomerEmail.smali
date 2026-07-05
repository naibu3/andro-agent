.class public final Lcom/stripe/android/paymentsheet/state/DefaultRetrieveCustomerEmail;
.super Ljava/lang/Object;
.source "RetrieveCustomerEmail.kt"

# interfaces
.implements Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRetrieveCustomerEmail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RetrieveCustomerEmail.kt\ncom/stripe/android/paymentsheet/state/DefaultRetrieveCustomerEmail\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\"\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096B\u00a2\u0006\u0002\u0010\u000cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/state/DefaultRetrieveCustomerEmail;",
        "Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;",
        "customerRepository",
        "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;)V",
        "invoke",
        "",
        "configuration",
        "Lcom/stripe/android/common/model/CommonConfiguration;",
        "customer",
        "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;",
        "(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final customerRepository:Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "customerRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/state/DefaultRetrieveCustomerEmail;->customerRepository:Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

    return-void
.end method


# virtual methods
.method public invoke(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/common/model/CommonConfiguration;",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/paymentsheet/state/DefaultRetrieveCustomerEmail$invoke$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/paymentsheet/state/DefaultRetrieveCustomerEmail$invoke$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultRetrieveCustomerEmail$invoke$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/paymentsheet/state/DefaultRetrieveCustomerEmail$invoke$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/paymentsheet/state/DefaultRetrieveCustomerEmail$invoke$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/state/DefaultRetrieveCustomerEmail$invoke$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/paymentsheet/state/DefaultRetrieveCustomerEmail$invoke$1;-><init>(Lcom/stripe/android/paymentsheet/state/DefaultRetrieveCustomerEmail;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/paymentsheet/state/DefaultRetrieveCustomerEmail$invoke$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 30
    iget v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultRetrieveCustomerEmail$invoke$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 34
    invoke-virtual {p1}, Lcom/stripe/android/common/model/CommonConfiguration;->getDefaultBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getEmail()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    return-object p1

    :cond_4
    :goto_1
    if-eqz p2, :cond_6

    .line 35
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/state/DefaultRetrieveCustomerEmail;->customerRepository:Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

    iput v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultRetrieveCustomerEmail$invoke$1;->label:I

    invoke-interface {p1, p2, v0}, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;->retrieveCustomer(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    check-cast p3, Lcom/stripe/android/model/Customer;

    if-eqz p3, :cond_6

    invoke-virtual {p3}, Lcom/stripe/android/model/Customer;->getEmail()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_6
    const/4 p1, 0x0

    return-object p1
.end method
