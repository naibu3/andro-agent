.class final Lcom/stripe/android/Stripe$createRadarSession$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "Stripe.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/Stripe;->createRadarSession(Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;Landroidx/appcompat/app/AppCompatActivity;)V
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
        "Lkotlin/Result<",
        "+",
        "Lcom/stripe/android/model/RadarSession;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStripe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Stripe.kt\ncom/stripe/android/Stripe$createRadarSession$1\n+ 2 Stripe.kt\ncom/stripe/android/Stripe\n*L\n1#1,1908:1\n1859#2,2:1909\n*S KotlinDebug\n*F\n+ 1 Stripe.kt\ncom/stripe/android/Stripe$createRadarSession$1\n*L\n1644#1:1909,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lkotlin/Result;",
        "Lcom/stripe/android/model/RadarSession;"
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
    c = "com.stripe.android.Stripe$createRadarSession$1"
    f = "Stripe.kt"
    i = {
        0x1
    }
    l = {
        0x667,
        0x678,
        0x67e
    }
    m = "invokeSuspend"
    n = {
        "radarSession"
    }
    s = {
        "L$2"
    }
.end annotation


# instance fields
.field final synthetic $activity:Landroidx/appcompat/app/AppCompatActivity;

.field final synthetic $stripeAccountId:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/Stripe;


# direct methods
.method constructor <init>(Lcom/stripe/android/Stripe;Ljava/lang/String;Landroidx/appcompat/app/AppCompatActivity;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/Stripe;",
            "Ljava/lang/String;",
            "Landroidx/appcompat/app/AppCompatActivity;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/Stripe$createRadarSession$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/Stripe$createRadarSession$1;->this$0:Lcom/stripe/android/Stripe;

    iput-object p2, p0, Lcom/stripe/android/Stripe$createRadarSession$1;->$stripeAccountId:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/Stripe$createRadarSession$1;->$activity:Landroidx/appcompat/app/AppCompatActivity;

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

    new-instance v0, Lcom/stripe/android/Stripe$createRadarSession$1;

    iget-object v1, p0, Lcom/stripe/android/Stripe$createRadarSession$1;->this$0:Lcom/stripe/android/Stripe;

    iget-object v2, p0, Lcom/stripe/android/Stripe$createRadarSession$1;->$stripeAccountId:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/Stripe$createRadarSession$1;->$activity:Landroidx/appcompat/app/AppCompatActivity;

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/stripe/android/Stripe$createRadarSession$1;-><init>(Lcom/stripe/android/Stripe;Ljava/lang/String;Landroidx/appcompat/app/AppCompatActivity;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/stripe/android/Stripe$createRadarSession$1;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/RadarSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/stripe/android/Stripe$createRadarSession$1;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/Stripe$createRadarSession$1;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/stripe/android/Stripe$createRadarSession$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 1638
    iget v1, p0, Lcom/stripe/android/Stripe$createRadarSession$1;->label:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/stripe/android/Stripe$createRadarSession$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/model/RadarSessionWithHCaptcha;

    iget-object v3, p0, Lcom/stripe/android/Stripe$createRadarSession$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/Stripe$createRadarSession$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/Stripe;

    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v5, v3

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_5

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1639
    iget-object p1, p0, Lcom/stripe/android/Stripe$createRadarSession$1;->this$0:Lcom/stripe/android/Stripe;

    invoke-virtual {p1}, Lcom/stripe/android/Stripe;->getStripeRepository$payments_core_release()Lcom/stripe/android/networking/StripeRepository;

    move-result-object p1

    .line 1640
    new-instance v5, Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 1641
    iget-object v1, p0, Lcom/stripe/android/Stripe$createRadarSession$1;->this$0:Lcom/stripe/android/Stripe;

    invoke-virtual {v1}, Lcom/stripe/android/Stripe;->getPublishableKey$payments_core_release()Ljava/lang/String;

    move-result-object v6

    .line 1642
    iget-object v7, p0, Lcom/stripe/android/Stripe$createRadarSession$1;->$stripeAccountId:Ljava/lang/String;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    .line 1640
    invoke-direct/range {v5 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    .line 1639
    iput v4, p0, Lcom/stripe/android/Stripe$createRadarSession$1;->label:I

    invoke-interface {p1, v5, v1}, Lcom/stripe/android/networking/StripeRepository;->createRadarSession-gIAlu-s(Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto/16 :goto_2

    .line 1644
    :cond_4
    :goto_0
    iget-object v1, p0, Lcom/stripe/android/Stripe$createRadarSession$1;->$activity:Landroidx/appcompat/app/AppCompatActivity;

    iget-object v4, p0, Lcom/stripe/android/Stripe$createRadarSession$1;->this$0:Lcom/stripe/android/Stripe;

    iget-object v5, p0, Lcom/stripe/android/Stripe$createRadarSession$1;->$stripeAccountId:Ljava/lang/String;

    .line 1909
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    :try_start_2
    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 1910
    check-cast p1, Lcom/stripe/android/model/RadarSessionWithHCaptcha;

    .line 1645
    invoke-virtual {p1}, Lcom/stripe/android/model/RadarSessionWithHCaptcha;->getPassiveCaptchaSiteKey()Ljava/lang/String;

    move-result-object v6

    .line 1646
    move-object v7, v6

    check-cast v7, Ljava/lang/CharSequence;

    if-eqz v7, :cond_8

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-nez v7, :cond_5

    goto :goto_3

    :cond_5
    if-nez v1, :cond_6

    .line 1653
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_4

    .line 1657
    :cond_6
    check-cast v1, Landroidx/fragment/app/FragmentActivity;

    .line 1659
    invoke-virtual {p1}, Lcom/stripe/android/model/RadarSessionWithHCaptcha;->getPassiveCaptchaRqdata()Ljava/lang/String;

    move-result-object v7

    .line 1656
    iput-object v4, p0, Lcom/stripe/android/Stripe$createRadarSession$1;->L$0:Ljava/lang/Object;

    iput-object v5, p0, Lcom/stripe/android/Stripe$createRadarSession$1;->L$1:Ljava/lang/Object;

    iput-object p1, p0, Lcom/stripe/android/Stripe$createRadarSession$1;->L$2:Ljava/lang/Object;

    iput v3, p0, Lcom/stripe/android/Stripe$createRadarSession$1;->label:I

    invoke-static {v1, v6, v7, p0}, Lcom/stripe/android/hcaptcha/HCaptchaInterfaceKt;->performPassiveHCaptcha(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_7

    goto :goto_2

    :cond_7
    move-object v12, v1

    move-object v1, p1

    move-object p1, v12

    .line 1638
    :goto_1
    check-cast p1, Ljava/lang/String;

    .line 1662
    invoke-virtual {v4}, Lcom/stripe/android/Stripe;->getStripeRepository$payments_core_release()Lcom/stripe/android/networking/StripeRepository;

    move-result-object v9

    .line 1663
    invoke-virtual {v1}, Lcom/stripe/android/model/RadarSessionWithHCaptcha;->getId()Ljava/lang/String;

    move-result-object v1

    .line 1666
    new-instance v3, Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 1667
    invoke-virtual {v4}, Lcom/stripe/android/Stripe;->getPublishableKey$payments_core_release()Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    .line 1666
    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x0

    .line 1662
    iput-object v4, p0, Lcom/stripe/android/Stripe$createRadarSession$1;->L$0:Ljava/lang/Object;

    iput-object v4, p0, Lcom/stripe/android/Stripe$createRadarSession$1;->L$1:Ljava/lang/Object;

    iput-object v4, p0, Lcom/stripe/android/Stripe$createRadarSession$1;->L$2:Ljava/lang/Object;

    iput v2, p0, Lcom/stripe/android/Stripe$createRadarSession$1;->label:I

    move-object v6, v9

    const/4 v9, 0x0

    move-object v11, p0

    move-object v8, p1

    move-object v7, v1

    move-object v10, v3

    invoke-interface/range {v6 .. v11}, Lcom/stripe/android/networking/StripeRepository;->attachHCaptchaToRadarSession-yxL6bBk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    :goto_2
    return-object v0

    .line 1647
    :cond_8
    :goto_3
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 1910
    :cond_9
    :goto_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1909
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_6

    :goto_5
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    :cond_a
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 1671
    :goto_6
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p1, Lcom/stripe/android/model/RadarSessionWithHCaptcha;

    .line 1672
    new-instance v0, Lcom/stripe/android/model/RadarSession;

    invoke-virtual {p1}, Lcom/stripe/android/model/RadarSessionWithHCaptcha;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/stripe/android/model/RadarSession;-><init>(Ljava/lang/String;)V

    .line 1671
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_7

    :cond_b
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_7
    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    return-object p1
.end method
