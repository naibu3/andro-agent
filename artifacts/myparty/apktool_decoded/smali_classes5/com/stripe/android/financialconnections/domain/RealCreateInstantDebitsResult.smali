.class public final Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult;
.super Ljava/lang/Object;
.source "CreateInstantDebitsResult.kt"

# interfaces
.implements Lcom/stripe/android/financialconnections/domain/CreateInstantDebitsResult;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCreateInstantDebitsResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateInstantDebitsResult.kt\ncom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,84:1\n808#2,11:85\n*S KotlinDebug\n*F\n+ 1 CreateInstantDebitsResult.kt\ncom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult\n*L\n42#1:85,11\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B+\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0016\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096B\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult;",
        "Lcom/stripe/android/financialconnections/domain/CreateInstantDebitsResult;",
        "consumerRepository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;",
        "repository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;",
        "consumerSessionProvider",
        "Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;",
        "elementsSessionContext",
        "Lcom/stripe/android/financialconnections/ElementsSessionContext;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;Lcom/stripe/android/financialconnections/ElementsSessionContext;)V",
        "invoke",
        "Lcom/stripe/android/financialconnections/launcher/InstantDebitsResult;",
        "bankAccountId",
        "",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "financial-connections_release"
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
.field private final consumerRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;

.field private final consumerSessionProvider:Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;

.field private final elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

.field private final repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;Lcom/stripe/android/financialconnections/ElementsSessionContext;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "consumerRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consumerSessionProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult;->consumerRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;

    .line 20
    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult;->repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;

    .line 21
    iput-object p3, p0, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult;->consumerSessionProvider:Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;

    .line 22
    iput-object p4, p0, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/launcher/InstantDebitsResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;

    iget v3, v2, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v1, v2, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->label:I

    sub-int/2addr v1, v4

    iput v1, v2, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;

    invoke-direct {v2, v0, v1}, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;-><init>(Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v8, v2

    iget-object v1, v8, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 25
    iget v3, v8, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->label:I

    const/4 v9, 0x0

    const/4 v10, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eqz v3, :cond_5

    if-eq v3, v11, :cond_4

    if-eq v3, v5, :cond_3

    if-eq v3, v4, :cond_2

    if-ne v3, v10, :cond_1

    iget-object v2, v8, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v8, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/Result;

    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v1

    goto/16 :goto_c

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v3, v8, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->L$2:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    iget-object v4, v8, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v8, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_3
    iget-object v3, v8, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->L$2:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    iget-object v4, v8, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v8, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_4
    iget-object v3, v8, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->L$2:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;

    iget-object v6, v8, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v7, v8, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v13, v7

    goto :goto_3

    :cond_5
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 28
    iget-object v1, v0, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult;->consumerSessionProvider:Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;

    invoke-interface {v1}, Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;->provideConsumerSession()Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 30
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;->getClientSecret()Ljava/lang/String;

    move-result-object v1

    move-object v6, v1

    goto :goto_1

    :cond_6
    move-object v6, v12

    :goto_1
    if-eqz v6, :cond_15

    .line 34
    iget-object v1, v0, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/ElementsSessionContext;->getBillingDetails()Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;

    move-result-object v1

    move-object v3, v1

    goto :goto_2

    :cond_7
    move-object v3, v12

    .line 36
    :goto_2
    iget-object v1, v0, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult;->consumerRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;

    iput-object v0, v8, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->L$0:Ljava/lang/Object;

    iput-object v6, v8, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->L$1:Ljava/lang/Object;

    iput-object v3, v8, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->L$2:Ljava/lang/Object;

    iput v11, v8, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->label:I

    move-object/from16 v7, p1

    invoke-interface {v1, v7, v6, v3, v8}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;->createPaymentDetails(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_8

    goto/16 :goto_b

    :cond_8
    move-object v13, v0

    .line 25
    :goto_3
    check-cast v1, Lcom/stripe/android/model/ConsumerPaymentDetails;

    .line 42
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails;->getPaymentDetails()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 85
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    check-cast v7, Ljava/util/Collection;

    .line 94
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_9
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    instance-of v15, v14, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    if-eqz v15, :cond_9

    invoke-interface {v7, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 95
    :cond_a
    check-cast v7, Ljava/util/List;

    .line 42
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    .line 44
    iget-object v7, v13, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    if-eqz v7, :cond_b

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/ElementsSessionContext;->getLinkMode()Lcom/stripe/android/model/LinkMode;

    move-result-object v7

    goto :goto_5

    :cond_b
    move-object v7, v12

    .line 45
    :goto_5
    sget-object v14, Lcom/stripe/android/model/LinkMode;->LinkCardBrand:Lcom/stripe/android/model/LinkMode;

    if-ne v7, v14, :cond_e

    .line 46
    iget-object v3, v13, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult;->consumerRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;

    .line 47
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;->getId()Ljava/lang/String;

    move-result-object v4

    .line 49
    invoke-virtual {v7}, Lcom/stripe/android/model/LinkMode;->getExpectedPaymentMethodType()Ljava/lang/String;

    move-result-object v7

    .line 50
    iget-object v14, v13, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    if-eqz v14, :cond_c

    invoke-virtual {v14}, Lcom/stripe/android/financialconnections/ElementsSessionContext;->getBillingDetails()Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;

    move-result-object v14

    if-eqz v14, :cond_c

    invoke-virtual {v14}, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;->getPhone()Ljava/lang/String;

    move-result-object v14

    goto :goto_6

    :cond_c
    move-object v14, v12

    .line 46
    :goto_6
    iput-object v13, v8, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->L$0:Ljava/lang/Object;

    iput-object v6, v8, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->L$1:Ljava/lang/Object;

    iput-object v1, v8, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->L$2:Ljava/lang/Object;

    iput v5, v8, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->label:I

    move-object v5, v6

    move-object v6, v7

    move-object v7, v14

    invoke-interface/range {v3 .. v8}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;->sharePaymentDetails(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_d

    goto :goto_b

    :cond_d
    move-object v4, v3

    move-object v3, v1

    move-object v1, v4

    move-object v4, v5

    move-object v5, v13

    .line 25
    :goto_7
    check-cast v1, Lcom/stripe/android/model/SharePaymentDetails;

    .line 53
    invoke-virtual {v1}, Lcom/stripe/android/model/SharePaymentDetails;->getEncodedPaymentMethod()Ljava/lang/String;

    move-result-object v1

    goto :goto_9

    :cond_e
    move-object v5, v6

    .line 55
    iget-object v6, v13, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult;->repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;

    .line 56
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;->getId()Ljava/lang/String;

    move-result-object v7

    .line 55
    iput-object v13, v8, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->L$0:Ljava/lang/Object;

    iput-object v5, v8, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->L$1:Ljava/lang/Object;

    iput-object v1, v8, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->L$2:Ljava/lang/Object;

    iput v4, v8, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->label:I

    invoke-interface {v6, v7, v5, v3, v8}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;->createPaymentMethod(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_f

    goto :goto_b

    :cond_f
    move-object v4, v3

    move-object v3, v1

    move-object v1, v4

    move-object v4, v5

    move-object v5, v13

    .line 25
    :goto_8
    check-cast v1, Ljava/lang/String;

    .line 62
    :goto_9
    iget-object v6, v5, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    if-eqz v6, :cond_10

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/ElementsSessionContext;->getIncentiveEligibilitySession()Lcom/stripe/android/model/IncentiveEligibilitySession;

    move-result-object v6

    if-eqz v6, :cond_10

    invoke-interface {v6}, Lcom/stripe/android/model/IncentiveEligibilitySession;->getId()Ljava/lang/String;

    move-result-object v6

    goto :goto_a

    :cond_10
    move-object v6, v12

    :goto_a
    if-eqz v6, :cond_14

    .line 65
    iget-object v5, v5, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult;->consumerRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;

    .line 67
    invoke-virtual {v3}, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;->getId()Ljava/lang/String;

    move-result-object v7

    .line 65
    iput-object v3, v8, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->L$0:Ljava/lang/Object;

    iput-object v1, v8, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->L$1:Ljava/lang/Object;

    iput-object v12, v8, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->L$2:Ljava/lang/Object;

    iput v10, v8, Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult$invoke$1;->label:I

    invoke-interface {v5, v6, v7, v4, v8}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;->updateAvailableIncentives-BWLJW6A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_11

    :goto_b
    return-object v2

    :cond_11
    move-object v2, v1

    move-object v1, v4

    .line 69
    :goto_c
    invoke-static {v1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_12

    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast v1, Lcom/stripe/android/model/UpdateAvailableIncentives;

    .line 70
    invoke-virtual {v1}, Lcom/stripe/android/model/UpdateAvailableIncentives;->getData()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/2addr v1, v11

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 69
    :cond_12
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 71
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_13

    move-object v1, v4

    :cond_13
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    move-object v1, v2

    .line 78
    :cond_14
    invoke-virtual {v3}, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;->getBankName()Ljava/lang/String;

    move-result-object v2

    .line 79
    invoke-virtual {v3}, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;->getLast4()Ljava/lang/String;

    move-result-object v3

    .line 76
    new-instance v4, Lcom/stripe/android/financialconnections/launcher/InstantDebitsResult;

    invoke-direct {v4, v1, v3, v2, v9}, Lcom/stripe/android/financialconnections/launcher/InstantDebitsResult;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v4

    .line 30
    :cond_15
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Consumer session client secret cannot be null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
