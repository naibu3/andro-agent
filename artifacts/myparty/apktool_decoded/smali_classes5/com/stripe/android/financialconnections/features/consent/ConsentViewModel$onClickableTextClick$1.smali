.class final Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ConsentViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->onClickableTextClick(Ljava/lang/String;)Lkotlinx/coroutines/Job;
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
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
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
    c = "com.stripe.android.financialconnections.features.consent.ConsentViewModel$onClickableTextClick$1"
    f = "ConsentViewModel.kt"
    i = {}
    l = {
        0xa0
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $uri:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;


# direct methods
.method public static synthetic $r8$lambda$ZiQ6ShqDe8WIGCNHuMxUXOMsSs4(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1;->invokeSuspend$lambda$1(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$pA_5i1A5CWgOOPGuBWZDgWd0UY4(Ljava/lang/String;Ljava/util/Date;Lcom/stripe/android/financialconnections/features/consent/ConsentState;)Lcom/stripe/android/financialconnections/features/consent/ConsentState;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1;->invokeSuspend$lambda$1$lambda$0(Ljava/lang/String;Ljava/util/Date;Lcom/stripe/android/financialconnections/features/consent/ConsentState;)Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1;->this$0:Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1;->$uri:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$1(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 163
    new-instance p3, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1$$ExternalSyntheticLambda1;

    invoke-direct {p3, p1, p2}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1$$ExternalSyntheticLambda1;-><init>(Ljava/lang/String;Ljava/util/Date;)V

    invoke-static {p0, p3}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->access$setState(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final invokeSuspend$lambda$1$lambda$0(Ljava/lang/String;Ljava/util/Date;Lcom/stripe/android/financialconnections/features/consent/ConsentState;)Lcom/stripe/android/financialconnections/features/consent/ConsentState;
    .locals 10

    .line 163
    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect$OpenUrl;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-direct {v0, p0, v1, v2}, Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect$OpenUrl;-><init>(Ljava/lang/String;J)V

    move-object v7, v0

    check-cast v7, Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, p2

    invoke-static/range {v3 .. v9}, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->copy$default(Lcom/stripe/android/financialconnections/features/consent/ConsentState;Lcom/stripe/android/financialconnections/presentation/Async;Ljava/util/List;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
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

    new-instance p1, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1;->this$0:Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1;->$uri:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 158
    iget v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 159
    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    .line 160
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1;->this$0:Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;

    invoke-static {v1}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->access$getHandleClickableUrl$p(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;)Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;

    move-result-object v3

    .line 161
    sget-object v4, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->CONSENT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 162
    iget-object v5, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1;->$uri:Ljava/lang/String;

    .line 160
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1;->this$0:Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;

    new-instance v6, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1$$ExternalSyntheticLambda0;

    invoke-direct {v6, v1, v5, p1}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Ljava/lang/String;Ljava/util/Date;)V

    const/4 p1, 0x5

    .line 166
    new-array p1, p1, [Lkotlin/Pair;

    sget-object v1, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;->DATA:Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;->getValue()Ljava/lang/String;

    move-result-object v1

    new-instance v7, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1$2;

    iget-object v8, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1;->this$0:Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;

    const/4 v9, 0x0

    invoke-direct {v7, v8, v9}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1$2;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Lkotlin/coroutines/Continuation;)V

    invoke-static {v1, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v7, 0x0

    aput-object v1, p1, v7

    .line 170
    sget-object v1, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;->LEGAL_DETAILS:Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;->getValue()Ljava/lang/String;

    move-result-object v1

    new-instance v7, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1$3;

    iget-object v8, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1;->this$0:Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;

    invoke-direct {v7, v8, v9}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1$3;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Lkotlin/coroutines/Continuation;)V

    invoke-static {v1, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, p1, v2

    .line 174
    sget-object v1, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;->MANUAL_ENTRY:Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;->getValue()Ljava/lang/String;

    move-result-object v1

    new-instance v7, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1$4;

    iget-object v8, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1;->this$0:Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;

    invoke-direct {v7, v8, v9}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1$4;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Lkotlin/coroutines/Continuation;)V

    invoke-static {v1, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v7, 0x2

    aput-object v1, p1, v7

    .line 178
    sget-object v1, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;->LINK_LOGIN_WARMUP:Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;->getValue()Ljava/lang/String;

    move-result-object v1

    new-instance v7, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1$5;

    iget-object v8, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1;->this$0:Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;

    invoke-direct {v7, v8, v9}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1$5;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Lkotlin/coroutines/Continuation;)V

    invoke-static {v1, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v7, 0x3

    aput-object v1, p1, v7

    .line 187
    sget-object v1, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;->LINK_ACCOUNT_PICKER:Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;->getValue()Ljava/lang/String;

    move-result-object v1

    new-instance v7, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1$6;

    iget-object v8, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1;->this$0:Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;

    invoke-direct {v7, v8, v9}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1$6;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Lkotlin/coroutines/Continuation;)V

    invoke-static {v1, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v7, 0x4

    aput-object v1, p1, v7

    .line 164
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    move-object v8, p0

    check-cast v8, Lkotlin/coroutines/Continuation;

    .line 160
    iput v2, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1;->label:I

    invoke-virtual/range {v3 .. v8}, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;->invoke(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    .line 194
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
