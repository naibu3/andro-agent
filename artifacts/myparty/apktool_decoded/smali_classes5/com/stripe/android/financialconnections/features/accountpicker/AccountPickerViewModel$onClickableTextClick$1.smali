.class final Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onClickableTextClick$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AccountPickerViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->onClickableTextClick(Ljava/lang/String;)Lkotlinx/coroutines/Job;
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
    c = "com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$onClickableTextClick$1"
    f = "AccountPickerViewModel.kt"
    i = {}
    l = {
        0x16c
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $uri:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;


# direct methods
.method public static synthetic $r8$lambda$__NRi8vD0nK0I9m0LIyJl3ekIQw(Ljava/lang/String;Ljava/util/Date;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onClickableTextClick$1;->invokeSuspend$lambda$1$lambda$0(Ljava/lang/String;Ljava/util/Date;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$w9Rk88l1qfSVS6_boAzz40ZCBmY(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onClickableTextClick$1;->invokeSuspend$lambda$1(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onClickableTextClick$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onClickableTextClick$1;->this$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onClickableTextClick$1;->$uri:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$1(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 368
    new-instance p3, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onClickableTextClick$1$$ExternalSyntheticLambda1;

    invoke-direct {p3, p1, p2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onClickableTextClick$1$$ExternalSyntheticLambda1;-><init>(Ljava/lang/String;Ljava/util/Date;)V

    invoke-static {p0, p3}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->access$setState(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lkotlin/jvm/functions/Function1;)V

    .line 369
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final invokeSuspend$lambda$1$lambda$0(Ljava/lang/String;Ljava/util/Date;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
    .locals 12

    .line 368
    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-direct {v0, p0, v1, v2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect$OpenUrl;-><init>(Ljava/lang/String;J)V

    move-object v9, v0

    check-cast v9, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;

    const/16 v10, 0x1f

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, p2

    invoke-static/range {v3 .. v11}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->copy$default(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ZLcom/stripe/android/financialconnections/presentation/Async;Ljava/util/Set;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

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

    new-instance p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onClickableTextClick$1;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onClickableTextClick$1;->this$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onClickableTextClick$1;->$uri:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onClickableTextClick$1;-><init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onClickableTextClick$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onClickableTextClick$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onClickableTextClick$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onClickableTextClick$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 362
    iget v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onClickableTextClick$1;->label:I

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

    .line 363
    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    .line 364
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onClickableTextClick$1;->this$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

    invoke-static {v1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->access$getHandleClickableUrl$p(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;)Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;

    move-result-object v3

    .line 365
    invoke-static {}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->access$getPANE$cp()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v4

    .line 366
    iget-object v5, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onClickableTextClick$1;->$uri:Ljava/lang/String;

    .line 364
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onClickableTextClick$1;->this$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

    new-instance v6, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onClickableTextClick$1$$ExternalSyntheticLambda0;

    invoke-direct {v6, v1, v5, p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onClickableTextClick$1$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Ljava/lang/String;Ljava/util/Date;)V

    .line 371
    sget-object p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerClickableText;->DATA:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerClickableText;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerClickableText;->getValue()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onClickableTextClick$1$2;

    iget-object v7, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onClickableTextClick$1;->this$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

    const/4 v8, 0x0

    invoke-direct {v1, v7, v8}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onClickableTextClick$1$2;-><init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lkotlin/coroutines/Continuation;)V

    invoke-static {p1, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    .line 370
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    move-object v8, p0

    check-cast v8, Lkotlin/coroutines/Continuation;

    .line 364
    iput v2, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onClickableTextClick$1;->label:I

    invoke-virtual/range {v3 .. v8}, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;->invoke(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    .line 376
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
