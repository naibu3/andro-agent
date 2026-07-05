.class final Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SuccessViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;-><init>(Lcom/stripe/android/financialconnections/features/success/SuccessState;Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSuccessViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuccessViewModel.kt\ncom/stripe/android/financialconnections/features/success/SuccessViewModel$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n1#2:133\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;"
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
    c = "com.stripe.android.financialconnections.features.success.SuccessViewModel$1"
    f = "SuccessViewModel.kt"
    i = {
        0x1
    }
    l = {
        0x2e,
        0x2f
    }
    m = "invokeSuspend"
    n = {
        "manifest"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field final synthetic $getCachedAccounts:Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;

.field final synthetic $getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;


# direct methods
.method constructor <init>(Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;",
            "Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;",
            "Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->$getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->$getCachedAccounts:Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->$getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->$getCachedAccounts:Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;-><init>(Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 45
    iget v1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->label:I

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 46
    iget-object v4, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->$getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    move-object v7, p0

    check-cast v7, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->label:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x3

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;->invoke$default(Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object p1

    .line 47
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->$getCachedAccounts:Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;

    move-object v2, p0

    check-cast v2, Lkotlin/coroutines/Continuation;

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->L$0:Ljava/lang/Object;

    iput v3, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->label:I

    invoke-virtual {v1, v2}, Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    move-object v0, p1

    move-object p1, v1

    .line 45
    :goto_2
    check-cast p1, Ljava/util/List;

    .line 48
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;

    invoke-static {v1}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->access$getSuccessContentRepository$p(Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;)Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;->get()Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    .line 49
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;->getHeading()Lcom/stripe/android/financialconnections/ui/TextResource;

    move-result-object v4

    if-nez v4, :cond_6

    :cond_5
    new-instance v4, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;

    sget v5, Lcom/stripe/android/financialconnections/R$string;->stripe_success_pane_title:I

    invoke-direct {v4, v5, v2, v3, v2}, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v4, Lcom/stripe/android/financialconnections/ui/TextResource;

    :cond_6
    if-eqz v1, :cond_7

    .line 50
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;->getMessage()Lcom/stripe/android/financialconnections/ui/TextResource;

    move-result-object v1

    if-nez v1, :cond_8

    :cond_7
    new-instance v5, Lcom/stripe/android/financialconnections/ui/TextResource$PluralId;

    .line 51
    sget v6, Lcom/stripe/android/financialconnections/R$string;->stripe_success_pane_desc_singular:I

    .line 52
    sget v7, Lcom/stripe/android/financialconnections/R$string;->stripe_success_pane_desc_plural:I

    .line 53
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v8

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v9, 0x0

    .line 50
    invoke-direct/range {v5 .. v11}, Lcom/stripe/android/financialconnections/ui/TextResource$PluralId;-><init>(IIILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v5

    check-cast v1, Lcom/stripe/android/financialconnections/ui/TextResource;

    .line 56
    :cond_8
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getSkipSuccessPane()Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_3

    :cond_9
    const/4 p1, 0x0

    .line 60
    :goto_3
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getBusinessName()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_a

    invoke-static {v0}, Lcom/stripe/android/financialconnections/features/common/ManifestExtensionsKt;->useContinueWithMerchantText(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z

    move-result v0

    if-eqz v0, :cond_a

    move-object v2, v3

    .line 55
    :cond_a
    new-instance v0, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;

    invoke-direct {v0, v2, v4, v1, p1}, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;Z)V

    return-object v0
.end method
