.class final Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$new$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SaveAccountToLink.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;->new(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/util/Set<",
        "+",
        "Ljava/lang/String;",
        ">;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
        "selectedAccountIds",
        "",
        ""
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
    c = "com.stripe.android.financialconnections.domain.SaveAccountToLink$new$2"
    f = "SaveAccountToLink.kt"
    i = {}
    l = {
        0x26
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $country:Ljava/lang/String;

.field final synthetic $email:Ljava/lang/String;

.field final synthetic $phoneNumber:Ljava/lang/String;

.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;


# direct methods
.method constructor <init>(Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$new$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$new$2;->this$0:Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$new$2;->$email:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$new$2;->$country:Ljava/lang/String;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$new$2;->$phoneNumber:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
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

    new-instance v0, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$new$2;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$new$2;->this$0:Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$new$2;->$email:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$new$2;->$country:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$new$2;->$phoneNumber:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$new$2;-><init>(Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$new$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Set;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$new$2;->invoke(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$new$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$new$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$new$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 37
    iget v1, p0, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$new$2;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$new$2;->L$0:Ljava/lang/Object;

    move-object v10, p1

    check-cast v10, Ljava/util/Set;

    .line 38
    iget-object p1, p0, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$new$2;->this$0:Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;->access$getRepository$p(Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;

    move-result-object v3

    .line 39
    iget-object p1, p0, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$new$2;->this$0:Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;->access$getConfiguration$p(Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;->getFinancialConnectionsSessionClientSecret()Ljava/lang/String;

    move-result-object v4

    .line 43
    iget-object p1, p0, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$new$2;->this$0:Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;->access$getLocale$p(Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;)Ljava/util/Locale;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p1

    :cond_2
    invoke-virtual {p1}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object v7

    .line 40
    iget-object v5, p0, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$new$2;->$email:Ljava/lang/String;

    .line 41
    iget-object v6, p0, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$new$2;->$country:Ljava/lang/String;

    .line 42
    iget-object v8, p0, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$new$2;->$phoneNumber:Ljava/lang/String;

    .line 45
    move-object v11, p0

    check-cast v11, Lkotlin/coroutines/Continuation;

    .line 38
    iput v2, p0, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink$new$2;->label:I

    const/4 v9, 0x0

    invoke-interface/range {v3 .. v11}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;->postSaveAccountsToLink(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    return-object p1
.end method
