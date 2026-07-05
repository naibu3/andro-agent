.class final Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck$invoke$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "DefaultLinkAttestationCheck.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result;",
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
    c = "com.stripe.android.link.attestation.DefaultLinkAttestationCheck$invoke$2"
    f = "DefaultLinkAttestationCheck.kt"
    i = {}
    l = {
        0x1d,
        0x23
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;


# direct methods
.method constructor <init>(Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck$invoke$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck$invoke$2;->this$0:Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1
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

    new-instance p1, Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck$invoke$2;

    iget-object v0, p0, Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck$invoke$2;->this$0:Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;

    invoke-direct {p1, v0, p2}, Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck$invoke$2;-><init>(Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck$invoke$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck$invoke$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck$invoke$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck$invoke$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 28
    iget v1, p0, Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck$invoke$2;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck$invoke$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 29
    iget-object p1, p0, Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck$invoke$2;->this$0:Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;

    invoke-static {p1}, Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;->access$getIntegrityRequestManager$p(Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;)Lcom/stripe/attestation/IntegrityRequestManager;

    move-result-object p1

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    iput v3, p0, Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck$invoke$2;->label:I

    invoke-interface {p1, v1}, Lcom/stripe/attestation/IntegrityRequestManager;->prepare-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    .line 30
    :cond_3
    :goto_0
    iget-object v1, p0, Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck$invoke$2;->this$0:Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_8

    check-cast p1, Lkotlin/Unit;

    .line 32
    invoke-static {v1}, Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;->access$getLinkAccountManager$p(Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;)Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/link/account/LinkAccountManager;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkAccountUpdate$Value;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/stripe/android/link/model/LinkAccount;->getEmail()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_5

    .line 33
    :cond_4
    invoke-static {v1}, Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;->access$getLinkConfiguration$p(Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;)Lcom/stripe/android/link/LinkConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkConfiguration;->getCustomerInfo()Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;->getEmail()Ljava/lang/String;

    move-result-object p1

    :cond_5
    move-object v4, p1

    if-nez v4, :cond_6

    .line 34
    sget-object p1, Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result$Successful;->INSTANCE:Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result$Successful;

    check-cast p1, Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result;

    return-object p1

    .line 35
    :cond_6
    invoke-static {v1}, Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;->access$getLinkAuth$p(Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;)Lcom/stripe/android/link/account/LinkAuth;

    move-result-object v3

    .line 37
    sget-object v5, Lcom/stripe/android/model/EmailSource;->CUSTOMER_OBJECT:Lcom/stripe/android/model/EmailSource;

    .line 39
    invoke-static {v1}, Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;->access$getLinkConfiguration$p(Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;)Lcom/stripe/android/link/LinkConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkConfiguration;->getCustomerIdForEceDefaultValues()Ljava/lang/String;

    move-result-object v7

    .line 35
    iput-object v1, p0, Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck$invoke$2;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck$invoke$2;->label:I

    const/4 v6, 0x0

    move-object v8, p0

    invoke-interface/range {v3 .. v8}, Lcom/stripe/android/link/account/LinkAuth;->lookUp(Ljava/lang/String;Lcom/stripe/android/model/EmailSource;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    :goto_1
    return-object v0

    :cond_7
    move-object v0, v1

    .line 28
    :goto_2
    check-cast p1, Lcom/stripe/android/link/account/LinkAuthResult;

    .line 41
    invoke-static {v0, p1}, Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;->access$handleLookupResult(Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;Lcom/stripe/android/link/account/LinkAuthResult;)Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result;

    move-result-object p1

    return-object p1

    .line 44
    :cond_8
    invoke-static {v1}, Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;->access$getErrorReporter$p(Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;)Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    move-result-object v4

    .line 45
    sget-object p1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->LINK_NATIVE_FAILED_TO_PREPARE_INTEGRITY_MANAGER:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    move-object v5, p1

    check-cast v5, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    .line 46
    sget-object p1, Lcom/stripe/android/core/exception/StripeException;->Companion:Lcom/stripe/android/core/exception/StripeException$Companion;

    invoke-virtual {p1, v3}, Lcom/stripe/android/core/exception/StripeException$Companion;->create(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    .line 44
    invoke-static/range {v4 .. v9}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    .line 48
    new-instance p1, Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result$AttestationFailed;

    invoke-direct {p1, v3}, Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result$AttestationFailed;-><init>(Ljava/lang/Throwable;)V

    check-cast p1, Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result;

    return-object p1
.end method
