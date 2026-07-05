.class public final Lcom/stripe/android/link/RealLinkConfigurationCoordinator;
.super Ljava/lang/Object;
.source "LinkConfigurationCoordinator.kt"

# interfaces
.implements Lcom/stripe/android/link/LinkConfigurationCoordinator;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLinkConfigurationCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkConfigurationCoordinator.kt\ncom/stripe/android/link/RealLinkConfigurationCoordinator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n1#2:140\n*E\n"
.end annotation

.annotation runtime Ljavax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u0011\u0008\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0016\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J&\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ&\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020 0\u00192\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H\u0096@\u00a2\u0006\u0004\u0008#\u0010$J\u001e\u0010%\u001a\u0008\u0012\u0004\u0012\u00020&0\u00192\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006*"
    }
    d2 = {
        "Lcom/stripe/android/link/RealLinkConfigurationCoordinator;",
        "Lcom/stripe/android/link/LinkConfigurationCoordinator;",
        "linkComponentBuilder",
        "Lcom/stripe/android/link/injection/LinkComponent$Builder;",
        "<init>",
        "(Lcom/stripe/android/link/injection/LinkComponent$Builder;)V",
        "componentFlow",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/stripe/android/link/injection/LinkComponent;",
        "emailFlow",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "",
        "getEmailFlow",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "getComponent",
        "configuration",
        "Lcom/stripe/android/link/LinkConfiguration;",
        "getAccountStatusFlow",
        "Lkotlinx/coroutines/flow/Flow;",
        "Lcom/stripe/android/link/model/AccountStatus;",
        "linkGate",
        "Lcom/stripe/android/link/gate/LinkGate;",
        "linkAttestationCheck",
        "Lcom/stripe/android/link/attestation/LinkAttestationCheck;",
        "signInWithUserInput",
        "Lkotlin/Result;",
        "",
        "userInput",
        "Lcom/stripe/android/link/ui/inline/UserInput;",
        "signInWithUserInput-0E7RQCE",
        "(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/ui/inline/UserInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "attachNewCardToAccount",
        "Lcom/stripe/android/link/LinkPaymentDetails;",
        "paymentMethodCreateParams",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "attachNewCardToAccount-0E7RQCE",
        "(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "logOut",
        "Lcom/stripe/android/model/ConsumerSession;",
        "logOut-gIAlu-s",
        "(Lcom/stripe/android/link/LinkConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getLinkPaymentLauncherComponent",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final componentFlow:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/link/injection/LinkComponent;",
            ">;"
        }
    .end annotation
.end field

.field private final emailFlow:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final linkComponentBuilder:Lcom/stripe/android/link/injection/LinkComponent$Builder;


# direct methods
.method public static synthetic $r8$lambda$8_Pb_cMmFt1ObXAW55YGV6NPH3k(Lcom/stripe/android/link/injection/LinkComponent;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/RealLinkConfigurationCoordinator;->emailFlow$lambda$1(Lcom/stripe/android/link/injection/LinkComponent;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$HCylK16PeZHYb6LNlXDLG-DLuh8(Lcom/stripe/android/link/model/LinkAccount;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/RealLinkConfigurationCoordinator;->emailFlow$lambda$2(Lcom/stripe/android/link/model/LinkAccount;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$gyRHCSbaIsEYntd-PeEobWeXtk4(Lcom/stripe/android/link/LinkAccountUpdate$Value;)Lcom/stripe/android/link/model/LinkAccount;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/RealLinkConfigurationCoordinator;->emailFlow$lambda$1$lambda$0(Lcom/stripe/android/link/LinkAccountUpdate$Value;)Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/injection/LinkComponent$Builder;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "linkComponentBuilder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator;->linkComponentBuilder:Lcom/stripe/android/link/injection/LinkComponent$Builder;

    const/4 p1, 0x0

    .line 50
    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator;->componentFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 52
    check-cast p1, Lkotlinx/coroutines/flow/StateFlow;

    new-instance v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$$ExternalSyntheticLambda0;-><init>()V

    .line 53
    invoke-static {p1, v0}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->flatMapLatestAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    new-instance v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$$ExternalSyntheticLambda1;

    invoke-direct {v0}, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$$ExternalSyntheticLambda1;-><init>()V

    .line 60
    invoke-static {p1, v0}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator;->emailFlow:Lkotlinx/coroutines/flow/StateFlow;

    return-void
.end method

.method private static final emailFlow$lambda$1(Lcom/stripe/android/link/injection/LinkComponent;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    .line 54
    invoke-virtual {p0}, Lcom/stripe/android/link/injection/LinkComponent;->getLinkAccountManager$paymentsheet_release()Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/stripe/android/link/account/LinkAccountManager;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_1

    .line 55
    invoke-virtual {p0}, Lcom/stripe/android/link/injection/LinkComponent;->getLinkAccountManager$paymentsheet_release()Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object p0

    invoke-interface {p0}, Lcom/stripe/android/link/account/LinkAccountManager;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    new-instance v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$$ExternalSyntheticLambda2;

    invoke-direct {v0}, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$$ExternalSyntheticLambda2;-><init>()V

    invoke-static {p0, v0}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    return-object p0

    .line 57
    :cond_1
    invoke-static {v0}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    return-object p0
.end method

.method private static final emailFlow$lambda$1$lambda$0(Lcom/stripe/android/link/LinkAccountUpdate$Value;)Lcom/stripe/android/link/model/LinkAccount;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    invoke-virtual {p0}, Lcom/stripe/android/link/LinkAccountUpdate$Value;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p0

    return-object p0
.end method

.method private static final emailFlow$lambda$2(Lcom/stripe/android/link/model/LinkAccount;)Ljava/lang/String;
    .locals 0

    if-eqz p0, :cond_0

    .line 60
    invoke-virtual {p0}, Lcom/stripe/android/link/model/LinkAccount;->getEmail()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private final getLinkPaymentLauncherComponent(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/injection/LinkComponent;
    .locals 2

    .line 131
    iget-object v0, p0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator;->componentFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/injection/LinkComponent;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/stripe/android/link/injection/LinkComponent;->getConfiguration$paymentsheet_release()Lcom/stripe/android/link/LinkConfiguration;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    return-object v0

    .line 132
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator;->linkComponentBuilder:Lcom/stripe/android/link/injection/LinkComponent$Builder;

    .line 133
    invoke-interface {v0, p1}, Lcom/stripe/android/link/injection/LinkComponent$Builder;->configuration(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/injection/LinkComponent$Builder;

    move-result-object p1

    .line 134
    invoke-interface {p1}, Lcom/stripe/android/link/injection/LinkComponent$Builder;->build()Lcom/stripe/android/link/injection/LinkComponent;

    move-result-object p1

    .line 136
    iget-object v0, p0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator;->componentFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-object p1
.end method


# virtual methods
.method public attachNewCardToAccount-0E7RQCE(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkConfiguration;",
            "Lcom/stripe/android/model/PaymentMethodCreateParams;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "+",
            "Lcom/stripe/android/link/LinkPaymentDetails;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$attachNewCardToAccount$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$attachNewCardToAccount$1;

    iget v1, v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$attachNewCardToAccount$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$attachNewCardToAccount$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$attachNewCardToAccount$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$attachNewCardToAccount$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$attachNewCardToAccount$1;-><init>(Lcom/stripe/android/link/RealLinkConfigurationCoordinator;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$attachNewCardToAccount$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 103
    iget v2, v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$attachNewCardToAccount$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$attachNewCardToAccount$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/account/LinkAccountManager;

    iget-object p2, v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$attachNewCardToAccount$1;->L$0:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/link/LinkConfiguration;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p3

    move-object v5, p3

    move-object p3, p1

    move-object p1, p2

    move-object p2, v5

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 107
    invoke-direct {p0, p1}, Lcom/stripe/android/link/RealLinkConfigurationCoordinator;->getLinkPaymentLauncherComponent(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/injection/LinkComponent;

    move-result-object p3

    invoke-virtual {p3}, Lcom/stripe/android/link/injection/LinkComponent;->getLinkAccountManager$paymentsheet_release()Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object p3

    .line 108
    iput-object p1, v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$attachNewCardToAccount$1;->L$0:Ljava/lang/Object;

    iput-object p3, v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$attachNewCardToAccount$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$attachNewCardToAccount$1;->label:I

    invoke-interface {p3, p2, v0}, Lcom/stripe/android/link/account/LinkAccountManager;->createCardPaymentDetails-gIAlu-s(Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    .line 109
    :cond_4
    :goto_1
    invoke-static {p2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    :try_start_1
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p2, Lcom/stripe/android/link/LinkPaymentDetails$New;

    .line 110
    invoke-virtual {p1}, Lcom/stripe/android/link/LinkConfiguration;->getPassthroughModeEnabled()Z

    move-result p1

    if-eqz p1, :cond_6

    const/4 p1, 0x0

    .line 111
    iput-object p1, v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$attachNewCardToAccount$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$attachNewCardToAccount$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$attachNewCardToAccount$1;->label:I

    invoke-interface {p3, p2, v0}, Lcom/stripe/android/link/account/LinkAccountManager;->shareCardPaymentDetails-gIAlu-s(Lcom/stripe/android/link/LinkPaymentDetails$New;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lcom/stripe/android/link/LinkPaymentDetails;

    goto :goto_4

    .line 113
    :cond_6
    move-object p1, p2

    check-cast p1, Lcom/stripe/android/link/LinkPaymentDetails;

    .line 109
    :goto_4
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_6

    :goto_5
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_6
    return-object p1

    :cond_7
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getAccountStatusFlow(Lcom/stripe/android/link/LinkConfiguration;)Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkConfiguration;",
            ")",
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/stripe/android/link/model/AccountStatus;",
            ">;"
        }
    .end annotation

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    invoke-direct {p0, p1}, Lcom/stripe/android/link/RealLinkConfigurationCoordinator;->getLinkPaymentLauncherComponent(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/injection/LinkComponent;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/link/injection/LinkComponent;->getLinkAccountManager$paymentsheet_release()Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/link/account/LinkAccountManager;->getAccountStatus()Lkotlinx/coroutines/flow/Flow;

    move-result-object p1

    return-object p1
.end method

.method public getComponent(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/injection/LinkComponent;
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    invoke-direct {p0, p1}, Lcom/stripe/android/link/RealLinkConfigurationCoordinator;->getLinkPaymentLauncherComponent(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/injection/LinkComponent;

    move-result-object p1

    return-object p1
.end method

.method public getEmailFlow()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator;->emailFlow:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public linkAttestationCheck(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/attestation/LinkAttestationCheck;
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    invoke-direct {p0, p1}, Lcom/stripe/android/link/RealLinkConfigurationCoordinator;->getLinkPaymentLauncherComponent(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/injection/LinkComponent;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/link/injection/LinkComponent;->getLinkAttestationCheck$paymentsheet_release()Lcom/stripe/android/link/attestation/LinkAttestationCheck;

    move-result-object p1

    return-object p1
.end method

.method public linkGate(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/gate/LinkGate;
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-direct {p0, p1}, Lcom/stripe/android/link/RealLinkConfigurationCoordinator;->getLinkPaymentLauncherComponent(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/injection/LinkComponent;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/link/injection/LinkComponent;->getLinkGate$paymentsheet_release()Lcom/stripe/android/link/gate/LinkGate;

    move-result-object p1

    return-object p1
.end method

.method public logOut-gIAlu-s(Lcom/stripe/android/link/LinkConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkConfiguration;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConsumerSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$logOut$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$logOut$1;

    iget v1, v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$logOut$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$logOut$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$logOut$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$logOut$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$logOut$1;-><init>(Lcom/stripe/android/link/RealLinkConfigurationCoordinator;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$logOut$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 118
    iget v2, v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$logOut$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 121
    invoke-direct {p0, p1}, Lcom/stripe/android/link/RealLinkConfigurationCoordinator;->getLinkPaymentLauncherComponent(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/injection/LinkComponent;

    move-result-object p1

    .line 122
    invoke-virtual {p1}, Lcom/stripe/android/link/injection/LinkComponent;->getLinkAccountManager$paymentsheet_release()Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object p1

    .line 123
    iput v3, v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$logOut$1;->label:I

    invoke-interface {p1, v0}, Lcom/stripe/android/link/account/LinkAccountManager;->logOut-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public signInWithUserInput-0E7RQCE(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/ui/inline/UserInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkConfiguration;",
            "Lcom/stripe/android/link/ui/inline/UserInput;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Ljava/lang/Boolean;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$signInWithUserInput$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$signInWithUserInput$1;

    iget v1, v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$signInWithUserInput$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$signInWithUserInput$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$signInWithUserInput$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$signInWithUserInput$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$signInWithUserInput$1;-><init>(Lcom/stripe/android/link/RealLinkConfigurationCoordinator;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$signInWithUserInput$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 89
    iget v2, v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$signInWithUserInput$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 92
    invoke-direct {p0, p1}, Lcom/stripe/android/link/RealLinkConfigurationCoordinator;->getLinkPaymentLauncherComponent(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/injection/LinkComponent;

    move-result-object p1

    .line 93
    invoke-virtual {p1}, Lcom/stripe/android/link/injection/LinkComponent;->getLinkAccountManager$paymentsheet_release()Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object p1

    .line 94
    iput v3, v0, Lcom/stripe/android/link/RealLinkConfigurationCoordinator$signInWithUserInput$1;->label:I

    invoke-interface {p1, p2, v0}, Lcom/stripe/android/link/account/LinkAccountManager;->signInWithUserInput-gIAlu-s(Lcom/stripe/android/link/ui/inline/UserInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    .line 95
    :cond_3
    :goto_1
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p1, Lcom/stripe/android/link/model/LinkAccount;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
