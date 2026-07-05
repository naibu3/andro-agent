.class public final Lcom/stripe/android/challenge/PassiveChallengeViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "PassiveChallengeViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/challenge/PassiveChallengeViewModel$Companion;,
        Lcom/stripe/android/challenge/PassiveChallengeViewModel$NoArgsException;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPassiveChallengeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PassiveChallengeViewModel.kt\ncom/stripe/android/challenge/PassiveChallengeViewModel\n+ 2 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,58:1\n35#2:59\n77#2,2:60\n*S KotlinDebug\n*F\n+ 1 PassiveChallengeViewModel.kt\ncom/stripe/android/challenge/PassiveChallengeViewModel\n*L\n45#1:59\n46#1:60,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\u0019\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/stripe/android/challenge/PassiveChallengeViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "passiveCaptchaParams",
        "Lcom/stripe/android/model/PassiveCaptchaParams;",
        "hCaptchaService",
        "Lcom/stripe/android/hcaptcha/HCaptchaService;",
        "<init>",
        "(Lcom/stripe/android/model/PassiveCaptchaParams;Lcom/stripe/android/hcaptcha/HCaptchaService;)V",
        "_result",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "Lcom/stripe/android/challenge/PassiveChallengeActivityResult;",
        "result",
        "Lkotlinx/coroutines/flow/Flow;",
        "getResult",
        "()Lkotlinx/coroutines/flow/Flow;",
        "startPassiveChallenge",
        "",
        "activity",
        "Landroidx/fragment/app/FragmentActivity;",
        "(Landroidx/fragment/app/FragmentActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "NoArgsException",
        "Companion",
        "paymentsheet_release"
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
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/challenge/PassiveChallengeViewModel$Companion;

.field private static final Factory:Landroidx/lifecycle/ViewModelProvider$Factory;


# instance fields
.field private final _result:Lkotlinx/coroutines/flow/MutableSharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableSharedFlow<",
            "Lcom/stripe/android/challenge/PassiveChallengeActivityResult;",
            ">;"
        }
    .end annotation
.end field

.field private final hCaptchaService:Lcom/stripe/android/hcaptcha/HCaptchaService;

.field private final passiveCaptchaParams:Lcom/stripe/android/model/PassiveCaptchaParams;

.field private final result:Lkotlinx/coroutines/flow/Flow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/stripe/android/challenge/PassiveChallengeActivityResult;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$TAiRk_Vd4b81d_CFzDRx4bKjWFw(Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/challenge/PassiveChallengeViewModel;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/challenge/PassiveChallengeViewModel;->Factory$lambda$1$lambda$0(Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/challenge/PassiveChallengeViewModel;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/challenge/PassiveChallengeViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/challenge/PassiveChallengeViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/challenge/PassiveChallengeViewModel;->Companion:Lcom/stripe/android/challenge/PassiveChallengeViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/challenge/PassiveChallengeViewModel;->$stable:I

    .line 59
    new-instance v0, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;

    invoke-direct {v0}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;-><init>()V

    .line 46
    new-instance v1, Lcom/stripe/android/challenge/PassiveChallengeViewModel$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/stripe/android/challenge/PassiveChallengeViewModel$$ExternalSyntheticLambda0;-><init>()V

    .line 60
    const-class v2, Lcom/stripe/android/challenge/PassiveChallengeViewModel;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;->addInitializer(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V

    .line 59
    invoke-virtual {v0}, Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;->build()Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object v0

    .line 45
    sput-object v0, Lcom/stripe/android/challenge/PassiveChallengeViewModel;->Factory:Landroidx/lifecycle/ViewModelProvider$Factory;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/model/PassiveCaptchaParams;Lcom/stripe/android/hcaptcha/HCaptchaService;)V
    .locals 2
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "passiveCaptchaParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hCaptchaService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/stripe/android/challenge/PassiveChallengeViewModel;->passiveCaptchaParams:Lcom/stripe/android/model/PassiveCaptchaParams;

    .line 17
    iput-object p2, p0, Lcom/stripe/android/challenge/PassiveChallengeViewModel;->hCaptchaService:Lcom/stripe/android/hcaptcha/HCaptchaService;

    const/4 p1, 0x0

    const/4 p2, 0x6

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 19
    invoke-static {v0, v1, p1, p2, p1}, Lkotlinx/coroutines/flow/SharedFlowKt;->MutableSharedFlow$default(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/challenge/PassiveChallengeViewModel;->_result:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 20
    check-cast p1, Lkotlinx/coroutines/flow/Flow;

    iput-object p1, p0, Lcom/stripe/android/challenge/PassiveChallengeViewModel;->result:Lkotlinx/coroutines/flow/Flow;

    return-void
.end method

.method private static final Factory$lambda$1$lambda$0(Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/challenge/PassiveChallengeViewModel;
    .locals 1

    const-string v0, "$this$initializer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    sget-object v0, Lcom/stripe/android/challenge/PassiveChallengeActivity;->Companion:Lcom/stripe/android/challenge/PassiveChallengeActivity$Companion;

    invoke-static {p0}, Landroidx/lifecycle/SavedStateHandleSupport;->createSavedStateHandle(Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/SavedStateHandle;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/stripe/android/challenge/PassiveChallengeActivity$Companion;->getArgs$paymentsheet_release(Landroidx/lifecycle/SavedStateHandle;)Lcom/stripe/android/challenge/PassiveChallengeArgs;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 50
    invoke-static {}, Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent;->builder()Lcom/stripe/android/challenge/PassiveChallengeComponent$Builder;

    move-result-object v0

    .line 51
    invoke-virtual {p0}, Lcom/stripe/android/challenge/PassiveChallengeArgs;->getPassiveCaptchaParams()Lcom/stripe/android/model/PassiveCaptchaParams;

    move-result-object p0

    invoke-interface {v0, p0}, Lcom/stripe/android/challenge/PassiveChallengeComponent$Builder;->passiveCaptchaParams(Lcom/stripe/android/model/PassiveCaptchaParams;)Lcom/stripe/android/challenge/PassiveChallengeComponent$Builder;

    move-result-object p0

    .line 52
    invoke-interface {p0}, Lcom/stripe/android/challenge/PassiveChallengeComponent$Builder;->build()Lcom/stripe/android/challenge/PassiveChallengeComponent;

    move-result-object p0

    .line 53
    invoke-interface {p0}, Lcom/stripe/android/challenge/PassiveChallengeComponent;->getPassiveChallengeViewModel()Lcom/stripe/android/challenge/PassiveChallengeViewModel;

    move-result-object p0

    return-object p0

    .line 48
    :cond_0
    new-instance p0, Lcom/stripe/android/challenge/PassiveChallengeViewModel$NoArgsException;

    invoke-direct {p0}, Lcom/stripe/android/challenge/PassiveChallengeViewModel$NoArgsException;-><init>()V

    throw p0
.end method

.method public static final synthetic access$getFactory$cp()Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 1

    .line 15
    sget-object v0, Lcom/stripe/android/challenge/PassiveChallengeViewModel;->Factory:Landroidx/lifecycle/ViewModelProvider$Factory;

    return-object v0
.end method


# virtual methods
.method public final getResult()Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/stripe/android/challenge/PassiveChallengeActivityResult;",
            ">;"
        }
    .end annotation

    .line 20
    iget-object v0, p0, Lcom/stripe/android/challenge/PassiveChallengeViewModel;->result:Lkotlinx/coroutines/flow/Flow;

    return-object v0
.end method

.method public final startPassiveChallenge(Landroidx/fragment/app/FragmentActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/FragmentActivity;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/challenge/PassiveChallengeViewModel$startPassiveChallenge$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/challenge/PassiveChallengeViewModel$startPassiveChallenge$1;

    iget v1, v0, Lcom/stripe/android/challenge/PassiveChallengeViewModel$startPassiveChallenge$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/challenge/PassiveChallengeViewModel$startPassiveChallenge$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/challenge/PassiveChallengeViewModel$startPassiveChallenge$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/challenge/PassiveChallengeViewModel$startPassiveChallenge$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/challenge/PassiveChallengeViewModel$startPassiveChallenge$1;-><init>(Lcom/stripe/android/challenge/PassiveChallengeViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/challenge/PassiveChallengeViewModel$startPassiveChallenge$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 22
    iget v2, v0, Lcom/stripe/android/challenge/PassiveChallengeViewModel$startPassiveChallenge$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p1, v0, Lcom/stripe/android/challenge/PassiveChallengeViewModel$startPassiveChallenge$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/challenge/PassiveChallengeViewModel;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 23
    iget-object p2, p0, Lcom/stripe/android/challenge/PassiveChallengeViewModel;->hCaptchaService:Lcom/stripe/android/hcaptcha/HCaptchaService;

    .line 25
    iget-object v2, p0, Lcom/stripe/android/challenge/PassiveChallengeViewModel;->passiveCaptchaParams:Lcom/stripe/android/model/PassiveCaptchaParams;

    invoke-virtual {v2}, Lcom/stripe/android/model/PassiveCaptchaParams;->getSiteKey()Ljava/lang/String;

    move-result-object v2

    .line 26
    iget-object v6, p0, Lcom/stripe/android/challenge/PassiveChallengeViewModel;->passiveCaptchaParams:Lcom/stripe/android/model/PassiveCaptchaParams;

    invoke-virtual {v6}, Lcom/stripe/android/model/PassiveCaptchaParams;->getRqData()Ljava/lang/String;

    move-result-object v6

    .line 23
    iput-object p0, v0, Lcom/stripe/android/challenge/PassiveChallengeViewModel$startPassiveChallenge$1;->L$0:Ljava/lang/Object;

    iput v5, v0, Lcom/stripe/android/challenge/PassiveChallengeViewModel$startPassiveChallenge$1;->label:I

    invoke-interface {p2, p1, v2, v6, v0}, Lcom/stripe/android/hcaptcha/HCaptchaService;->performPassiveHCaptcha(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_3

    :cond_5
    move-object p1, p0

    .line 22
    :goto_1
    check-cast p2, Lcom/stripe/android/hcaptcha/HCaptchaService$Result;

    .line 29
    instance-of v2, p2, Lcom/stripe/android/hcaptcha/HCaptchaService$Result$Failure;

    const/4 v5, 0x0

    if-eqz v2, :cond_7

    .line 30
    iget-object p1, p1, Lcom/stripe/android/challenge/PassiveChallengeViewModel;->_result:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 31
    new-instance v2, Lcom/stripe/android/challenge/PassiveChallengeActivityResult$Failed;

    check-cast p2, Lcom/stripe/android/hcaptcha/HCaptchaService$Result$Failure;

    invoke-virtual {p2}, Lcom/stripe/android/hcaptcha/HCaptchaService$Result$Failure;->getError()Ljava/lang/Throwable;

    move-result-object p2

    invoke-direct {v2, p2}, Lcom/stripe/android/challenge/PassiveChallengeActivityResult$Failed;-><init>(Ljava/lang/Throwable;)V

    .line 30
    iput-object v5, v0, Lcom/stripe/android/challenge/PassiveChallengeViewModel$startPassiveChallenge$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/challenge/PassiveChallengeViewModel$startPassiveChallenge$1;->label:I

    invoke-interface {p1, v2, v0}, Lkotlinx/coroutines/flow/MutableSharedFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_3

    .line 40
    :cond_6
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 34
    :cond_7
    instance-of v2, p2, Lcom/stripe/android/hcaptcha/HCaptchaService$Result$Success;

    if-eqz v2, :cond_9

    .line 35
    iget-object p1, p1, Lcom/stripe/android/challenge/PassiveChallengeViewModel;->_result:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 36
    new-instance v2, Lcom/stripe/android/challenge/PassiveChallengeActivityResult$Success;

    check-cast p2, Lcom/stripe/android/hcaptcha/HCaptchaService$Result$Success;

    invoke-virtual {p2}, Lcom/stripe/android/hcaptcha/HCaptchaService$Result$Success;->getToken()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v2, p2}, Lcom/stripe/android/challenge/PassiveChallengeActivityResult$Success;-><init>(Ljava/lang/String;)V

    .line 35
    iput-object v5, v0, Lcom/stripe/android/challenge/PassiveChallengeViewModel$startPassiveChallenge$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/challenge/PassiveChallengeViewModel$startPassiveChallenge$1;->label:I

    invoke-interface {p1, v2, v0}, Lkotlinx/coroutines/flow/MutableSharedFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_3
    return-object v1

    .line 40
    :cond_8
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 28
    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
