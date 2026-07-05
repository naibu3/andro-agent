.class public final Lcom/stripe/android/financialconnections/domain/LookupAccount;
.super Ljava/lang/Object;
.source "LookupAccount.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B)\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJJ\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0086B\u00a2\u0006\u0002\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/LookupAccount;",
        "",
        "application",
        "Landroid/app/Application;",
        "requestIntegrityToken",
        "Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;",
        "consumerSessionRepository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;",
        "configuration",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;",
        "<init>",
        "(Landroid/app/Application;Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)V",
        "getConfiguration",
        "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;",
        "invoke",
        "Lcom/stripe/android/model/ConsumerSessionLookup;",
        "email",
        "",
        "phone",
        "phoneCountryCode",
        "emailSource",
        "Lcom/stripe/android/model/EmailSource;",
        "verifiedFlow",
        "",
        "sessionId",
        "pane",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/EmailSource;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
.field private final application:Landroid/app/Application;

.field private final configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

.field private final consumerSessionRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;

.field private final requestIntegrityToken:Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestIntegrityToken"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consumerSessionRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/LookupAccount;->application:Landroid/app/Application;

    .line 16
    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/LookupAccount;->requestIntegrityToken:Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;

    .line 17
    iput-object p3, p0, Lcom/stripe/android/financialconnections/domain/LookupAccount;->consumerSessionRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;

    .line 18
    iput-object p4, p0, Lcom/stripe/android/financialconnections/domain/LookupAccount;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    return-void
.end method


# virtual methods
.method public final getConfiguration()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/LookupAccount;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    return-object v0
.end method

.method public final invoke(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/EmailSource;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/EmailSource;",
            "Z",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/ConsumerSessionLookup;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v0, p8

    instance-of v5, v0, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;

    if-eqz v5, :cond_0

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;

    iget v6, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->label:I

    const/high16 v7, -0x80000000

    and-int/2addr v6, v7

    if-eqz v6, :cond_0

    iget v0, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->label:I

    sub-int/2addr v0, v7

    iput v0, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;

    invoke-direct {v5, v1, v0}, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;-><init>(Lcom/stripe/android/financialconnections/domain/LookupAccount;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v6

    .line 21
    iget v7, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->label:I

    const-string v8, "toLowerCase(...)"

    const-string v9, "Required value was null."

    const/4 v10, 0x3

    const/4 v11, 0x2

    const/4 v12, 0x1

    if-eqz v7, :cond_4

    if-eq v7, v12, :cond_3

    if-eq v7, v11, :cond_2

    if-ne v7, v10, :cond_1

    iget-object v2, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->L$2:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->L$0:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v15, v4

    move-object v4, v2

    move-object v2, v15

    goto/16 :goto_4

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v2, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->L$2:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->L$0:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    :try_start_1
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v7, v2

    move-object v10, v3

    move-object v12, v4

    goto/16 :goto_2

    :catchall_0
    move-exception v0

    move-object v15, v4

    move-object v4, v2

    move-object v2, v15

    goto/16 :goto_6

    :cond_3
    iget-object v2, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->L$5:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/domain/LookupAccount;

    iget-object v3, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->L$4:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->L$3:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/model/EmailSource;

    iget-object v7, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->L$2:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v10, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->L$1:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v12, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->L$0:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    :try_start_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object v13, v3

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v4, v7

    move-object v3, v10

    move-object v2, v12

    goto/16 :goto_6

    :cond_4
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 30
    :try_start_3
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/stripe/android/financialconnections/domain/LookupAccount;

    if-eqz p5, :cond_8

    .line 32
    iget-object v0, v1, Lcom/stripe/android/financialconnections/domain/LookupAccount;->requestIntegrityToken:Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;

    sget-object v7, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationEndpoint;->LOOKUP:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationEndpoint;

    iput-object v2, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->L$0:Ljava/lang/Object;

    iput-object v3, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->L$1:Ljava/lang/Object;

    iput-object v4, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->L$2:Ljava/lang/Object;

    move-object/from16 v10, p4

    iput-object v10, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->L$3:Ljava/lang/Object;

    move-object/from16 v13, p6

    iput-object v13, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->L$4:Ljava/lang/Object;

    iput-object v1, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->L$5:Ljava/lang/Object;

    iput v12, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->label:I

    move-object/from16 v12, p7

    invoke-virtual {v0, v7, v12, v5}, Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;->invoke(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationEndpoint;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne v0, v6, :cond_5

    goto/16 :goto_3

    :cond_5
    move-object v12, v2

    move-object v7, v4

    move-object v4, v10

    move-object v2, v1

    move-object v10, v3

    .line 34
    :goto_1
    :try_start_4
    check-cast v0, Ljava/lang/String;

    iget-object v3, v2, Lcom/stripe/android/financialconnections/domain/LookupAccount;->consumerSessionRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;

    .line 35
    sget-object v14, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v12, v14}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v14, Ljava/lang/CharSequence;

    invoke-static {v14}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    .line 38
    iget-object v2, v2, Lcom/stripe/android/financialconnections/domain/LookupAccount;->application:Landroid/app/Application;

    invoke-virtual {v2}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const-string v14, "getPackageName(...)"

    invoke-static {v2, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    iput-object v12, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->L$0:Ljava/lang/Object;

    iput-object v10, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->L$1:Ljava/lang/Object;

    iput-object v7, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->L$2:Ljava/lang/Object;

    const/4 v14, 0x0

    iput-object v14, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->L$3:Ljava/lang/Object;

    iput-object v14, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->L$4:Ljava/lang/Object;

    iput-object v14, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->L$5:Ljava/lang/Object;

    iput v11, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->label:I

    move-object/from16 p4, v0

    move-object/from16 p6, v2

    move-object/from16 p1, v3

    move-object/from16 p3, v4

    move-object/from16 p7, v5

    move-object/from16 p2, v8

    move-object/from16 p5, v13

    invoke-interface/range {p1 .. p7}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;->mobileLookupConsumerSession(Ljava/lang/String;Lcom/stripe/android/model/EmailSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    if-eqz v0, :cond_7

    .line 33
    check-cast v0, Lcom/stripe/android/model/ConsumerSessionLookup;

    goto :goto_5

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 44
    :cond_8
    :try_start_5
    iget-object v0, v1, Lcom/stripe/android/financialconnections/domain/LookupAccount;->consumerSessionRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;

    .line 45
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Ljava/lang/CharSequence;

    invoke-static {v7}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    .line 46
    iget-object v8, v1, Lcom/stripe/android/financialconnections/domain/LookupAccount;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    invoke-virtual {v8}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;->getFinancialConnectionsSessionClientSecret()Ljava/lang/String;

    move-result-object v8

    .line 44
    iput-object v2, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->L$0:Ljava/lang/Object;

    iput-object v3, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->L$1:Ljava/lang/Object;

    iput-object v4, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->L$2:Ljava/lang/Object;

    iput v10, v5, Lcom/stripe/android/financialconnections/domain/LookupAccount$invoke$1;->label:I

    invoke-interface {v0, v7, v8, v5}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;->postConsumerSession(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_9

    :goto_3
    return-object v6

    :cond_9
    :goto_4
    if-eqz v0, :cond_a

    check-cast v0, Lcom/stripe/android/model/ConsumerSessionLookup;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    move-object v12, v2

    move-object v10, v3

    move-object v7, v4

    .line 30
    :goto_5
    :try_start_6
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_7

    .line 44
    :cond_a
    :try_start_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catchall_2
    move-exception v0

    .line 30
    :goto_6
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v2

    move-object v10, v3

    move-object v7, v4

    .line 50
    :goto_7
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_b

    return-object v0

    .line 52
    :cond_b
    new-instance v0, Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;

    invoke-direct {v0, v12, v10, v7}, Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    invoke-static {v2, v0}, Lcom/stripe/android/financialconnections/features/error/ErrorExtKt;->toAttestationErrorIfApplicable(Ljava/lang/Throwable;Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;)Ljava/lang/Throwable;

    move-result-object v0

    throw v0
.end method
