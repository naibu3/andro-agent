.class final Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$loadNoticeSheetContent$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "NoticeSheetViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;->loadNoticeSheetContent()V
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
    c = "com.stripe.android.financialconnections.features.notice.NoticeSheetViewModel$loadNoticeSheetContent$1"
    f = "NoticeSheetViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;


# direct methods
.method public static synthetic $r8$lambda$fksuyqug8JS7-3d5SHagZlE1gnY(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$loadNoticeSheetContent$1;->invokeSuspend$lambda$0(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$loadNoticeSheetContent$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$loadNoticeSheetContent$1;->this$0:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$0(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;
    .locals 6

    const/4 v4, 0x5

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object v2, p0

    move-object v0, p1

    .line 48
    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;->copy$default(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;

    move-result-object p0

    return-object p0
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

    new-instance p1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$loadNoticeSheetContent$1;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$loadNoticeSheetContent$1;->this$0:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;

    invoke-direct {p1, v0, p2}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$loadNoticeSheetContent$1;-><init>(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$loadNoticeSheetContent$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$loadNoticeSheetContent$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$loadNoticeSheetContent$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$loadNoticeSheetContent$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 45
    iget v0, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$loadNoticeSheetContent$1;->label:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 46
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$loadNoticeSheetContent$1;->this$0:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;->access$getNoticeSheetContentRepository$p(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;)Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;->get()Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository$State;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository$State;->getContent()Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 48
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$loadNoticeSheetContent$1;->this$0:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;

    new-instance v1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$loadNoticeSheetContent$1$$ExternalSyntheticLambda0;

    invoke-direct {v1, p1}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$loadNoticeSheetContent$1$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;)V

    invoke-static {v0, v1}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;->access$setState(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;Lkotlin/jvm/functions/Function1;)V

    goto :goto_1

    .line 50
    :cond_1
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$loadNoticeSheetContent$1;->this$0:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;->access$getNavigationManager$p(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;)Lcom/stripe/android/uicore/navigation/NavigationManager;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/uicore/navigation/NavigationManager;->tryNavigateBack()V

    .line 52
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 45
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
