.class final Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$handleClickableTextClick$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "NoticeSheetViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;->handleClickableTextClick(Ljava/lang/String;)V
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
    c = "com.stripe.android.financialconnections.features.notice.NoticeSheetViewModel$handleClickableTextClick$1"
    f = "NoticeSheetViewModel.kt"
    i = {}
    l = {
        0x40
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $uri:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;


# direct methods
.method public static synthetic $r8$lambda$nNuf8BxvBhivlMLXQ5IiMv7YHWc(Ljava/lang/String;Ljava/util/Date;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$handleClickableTextClick$1;->invokeSuspend$lambda$1$lambda$0(Ljava/lang/String;Ljava/util/Date;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$nfzVkb9zY12seQiSIe3hmuwQoYk(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$handleClickableTextClick$1;->invokeSuspend$lambda$1(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$handleClickableTextClick$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$handleClickableTextClick$1;->this$0:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$handleClickableTextClick$1;->$uri:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$1(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 68
    new-instance p3, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$handleClickableTextClick$1$$ExternalSyntheticLambda1;

    invoke-direct {p3, p1, p2}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$handleClickableTextClick$1$$ExternalSyntheticLambda1;-><init>(Ljava/lang/String;Ljava/util/Date;)V

    invoke-static {p0, p3}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;->access$setState(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;Lkotlin/jvm/functions/Function1;)V

    .line 71
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final invokeSuspend$lambda$1$lambda$0(Ljava/lang/String;Ljava/util/Date;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;
    .locals 9

    .line 69
    new-instance v0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect$OpenUrl;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-direct {v0, p0, v1, v2}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect$OpenUrl;-><init>(Ljava/lang/String;J)V

    move-object v6, v0

    check-cast v6, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, p2

    invoke-static/range {v3 .. v8}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;->copy$default(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;

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

    new-instance p1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$handleClickableTextClick$1;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$handleClickableTextClick$1;->this$0:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$handleClickableTextClick$1;->$uri:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$handleClickableTextClick$1;-><init>(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$handleClickableTextClick$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$handleClickableTextClick$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$handleClickableTextClick$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$handleClickableTextClick$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 60
    iget v1, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$handleClickableTextClick$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 61
    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    .line 62
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$handleClickableTextClick$1;->this$0:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;->getStateFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;->getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v4

    .line 64
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$handleClickableTextClick$1;->this$0:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;

    invoke-static {v1}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;->access$getHandleClickableUrl$p(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;)Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;

    move-result-object v3

    .line 66
    iget-object v5, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$handleClickableTextClick$1;->$uri:Ljava/lang/String;

    .line 64
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$handleClickableTextClick$1;->this$0:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;

    new-instance v6, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$handleClickableTextClick$1$$ExternalSyntheticLambda0;

    invoke-direct {v6, v1, v5, p1}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$handleClickableTextClick$1$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;Ljava/lang/String;Ljava/util/Date;)V

    .line 72
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v7

    move-object v8, p0

    check-cast v8, Lkotlin/coroutines/Continuation;

    .line 64
    iput v2, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$handleClickableTextClick$1;->label:I

    invoke-virtual/range {v3 .. v8}, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;->invoke(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    .line 74
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
