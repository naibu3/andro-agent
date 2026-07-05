.class public final Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;
.super Ljava/lang/Object;
.source "CreateFinancialConnectionsSession.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005JB\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011JB\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0013\u0010\u0011Jv\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\t\u001a\u00020\n2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0015\u001a\u00020\n2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\n2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\n2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\nH\u0086@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001e\u0010 \u001a\u00020!*\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""
    }
    d2 = {
        "Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;",
        "",
        "stripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "<init>",
        "(Lcom/stripe/android/networking/StripeRepository;)V",
        "forPaymentIntent",
        "Lkotlin/Result;",
        "Lcom/stripe/android/model/FinancialConnectionsSession;",
        "publishableKey",
        "",
        "clientSecret",
        "stripeAccountId",
        "hostedSurface",
        "configuration",
        "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;",
        "forPaymentIntent-hUnOzRk",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "forSetupIntent",
        "forSetupIntent-hUnOzRk",
        "forDeferredIntent",
        "elementsSessionId",
        "customerId",
        "onBehalfOf",
        "linkMode",
        "Lcom/stripe/android/model/LinkMode;",
        "amount",
        "",
        "currency",
        "product",
        "forDeferredIntent-5p_uFSQ",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "toCreateSessionParams",
        "Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;",
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


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final stripeRepository:Lcom/stripe/android/networking/StripeRepository;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/networking/StripeRepository;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "stripeRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    return-void
.end method

.method private final toCreateSessionParams(Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;
    .locals 8

    .line 125
    instance-of v0, p1, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;

    if-eqz v0, :cond_0

    .line 126
    new-instance v1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;

    .line 129
    check-cast p1, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;

    .line 128
    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;->getName()Ljava/lang/String;

    move-result-object v3

    .line 129
    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;->getEmail()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x0

    move-object v2, p2

    move-object v5, p3

    .line 126
    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;)V

    check-cast v1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;

    return-object v1

    :cond_0
    move-object v2, p2

    move-object v5, p3

    .line 135
    instance-of p2, p1, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccountInternal;

    const/4 p3, 0x0

    if-eqz p2, :cond_2

    move-object v3, v2

    .line 136
    new-instance v2, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;

    .line 141
    check-cast p1, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccountInternal;

    .line 138
    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccountInternal;->getName()Ljava/lang/String;

    move-result-object v4

    move-object v6, v5

    .line 139
    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccountInternal;->getEmail()Ljava/lang/String;

    move-result-object v5

    .line 141
    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccountInternal;->getElementsSessionContext()Lcom/stripe/android/financialconnections/ElementsSessionContext;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/ElementsSessionContext;->getLinkMode()Lcom/stripe/android/model/LinkMode;

    move-result-object p3

    :cond_1
    move-object v7, p3

    .line 136
    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;)V

    check-cast v2, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;

    return-object v2

    .line 145
    :cond_2
    instance-of p2, p1, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;

    if-eqz p2, :cond_4

    .line 146
    new-instance p2, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;

    .line 150
    check-cast p1, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;

    .line 148
    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;->getEmail()Ljava/lang/String;

    move-result-object v0

    .line 150
    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;->getElementsSessionContext()Lcom/stripe/android/financialconnections/ElementsSessionContext;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/ElementsSessionContext;->getLinkMode()Lcom/stripe/android/model/LinkMode;

    move-result-object p3

    .line 146
    :cond_3
    invoke-direct {p2, v2, v0, v5, p3}, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;)V

    check-cast p2, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;

    return-object p2

    .line 124
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final forDeferredIntent-5p_uFSQ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/LinkMode;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/FinancialConnectionsSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p11

    instance-of v2, v1, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forDeferredIntent$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forDeferredIntent$1;

    iget v3, v2, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forDeferredIntent$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v1, v2, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forDeferredIntent$1;->label:I

    sub-int/2addr v1, v4

    iput v1, v2, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forDeferredIntent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forDeferredIntent$1;

    invoke-direct {v2, v0, v1}, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forDeferredIntent$1;-><init>(Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v1, v2, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forDeferredIntent$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 86
    iget v4, v2, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forDeferredIntent$1;->label:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/Result;

    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 98
    iget-object v1, v0, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 105
    sget-object v11, Lcom/stripe/android/model/VerificationMethodParam;->Automatic:Lcom/stripe/android/model/VerificationMethodParam;

    .line 99
    new-instance v6, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object/from16 v7, p3

    move-object/from16 v13, p4

    move-object/from16 v14, p5

    move-object/from16 v12, p6

    move-object/from16 v15, p7

    move-object/from16 v17, p8

    move-object/from16 v18, p9

    move-object/from16 v16, p10

    invoke-direct/range {v6 .. v18}, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/model/VerificationMethodParam;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 113
    new-instance v4, Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 v7, 0x4

    move-object/from16 p4, p1

    move-object/from16 p5, p2

    move-object/from16 p3, v4

    move/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p6, v9

    invoke-direct/range {p3 .. p8}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 98
    iput v5, v2, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forDeferredIntent$1;->label:I

    invoke-interface {v1, v6, v4, v2}, Lcom/stripe/android/networking/StripeRepository;->createFinancialConnectionsSessionForDeferredPayments-0E7RQCE(Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_3

    return-object v3

    :cond_3
    return-object v1
.end method

.method public final forPaymentIntent-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/FinancialConnectionsSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p6

    instance-of v1, v0, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forPaymentIntent$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forPaymentIntent$1;

    iget v2, v1, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forPaymentIntent$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forPaymentIntent$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forPaymentIntent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forPaymentIntent$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forPaymentIntent$1;-><init>(Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v1, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forPaymentIntent$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 22
    iget v3, v1, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forPaymentIntent$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 29
    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;

    .line 30
    new-instance v0, Lcom/stripe/android/model/PaymentIntent$ClientSecret;

    invoke-direct {v0, p2}, Lcom/stripe/android/model/PaymentIntent$ClientSecret;-><init>(Ljava/lang/String;)V

    .line 29
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 33
    :goto_1
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    :try_start_2
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast v0, Lcom/stripe/android/model/PaymentIntent$ClientSecret;

    .line 34
    iget-object v3, p0, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 35
    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentIntent$ClientSecret;->getPaymentIntentId$payments_core_release()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v6, p5

    .line 36
    invoke-direct {p0, v6, p2, p4}, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;->toCreateSessionParams(Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;

    move-result-object p2

    .line 40
    new-instance v5, Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v6, p1

    move-object v7, p3

    invoke-direct/range {v5 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 34
    iput v4, v1, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forPaymentIntent$1;->label:I

    invoke-interface {v3, v0, p2, v5, v1}, Lcom/stripe/android/networking/StripeRepository;->createPaymentIntentFinancialConnectionsSession-BWLJW6A(Ljava/lang/String;Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    return-object v2

    .line 44
    :cond_3
    :goto_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lcom/stripe/android/model/FinancialConnectionsSession;

    .line 33
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4

    :goto_3
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_4

    :cond_4
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_4
    return-object p1
.end method

.method public final forSetupIntent-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/FinancialConnectionsSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p6

    instance-of v1, v0, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forSetupIntent$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forSetupIntent$1;

    iget v2, v1, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forSetupIntent$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forSetupIntent$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forSetupIntent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forSetupIntent$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forSetupIntent$1;-><init>(Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v1, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forSetupIntent$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 51
    iget v3, v1, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forSetupIntent$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 58
    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;

    .line 59
    new-instance v0, Lcom/stripe/android/model/SetupIntent$ClientSecret;

    invoke-direct {v0, p2}, Lcom/stripe/android/model/SetupIntent$ClientSecret;-><init>(Ljava/lang/String;)V

    .line 58
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 62
    :goto_1
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    :try_start_2
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast v0, Lcom/stripe/android/model/SetupIntent$ClientSecret;

    .line 63
    iget-object v3, p0, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 64
    invoke-virtual {v0}, Lcom/stripe/android/model/SetupIntent$ClientSecret;->getSetupIntentId$payments_core_release()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v6, p5

    .line 65
    invoke-direct {p0, v6, p2, p4}, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;->toCreateSessionParams(Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;

    move-result-object p2

    .line 69
    new-instance v5, Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v6, p1

    move-object v7, p3

    invoke-direct/range {v5 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 63
    iput v4, v1, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forSetupIntent$1;->label:I

    invoke-interface {v3, v0, p2, v5, v1}, Lcom/stripe/android/networking/StripeRepository;->createSetupIntentFinancialConnectionsSession-BWLJW6A(Ljava/lang/String;Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    return-object v2

    .line 73
    :cond_3
    :goto_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lcom/stripe/android/model/FinancialConnectionsSession;

    .line 62
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4

    :goto_3
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_4

    :cond_4
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_4
    return-object p1
.end method
