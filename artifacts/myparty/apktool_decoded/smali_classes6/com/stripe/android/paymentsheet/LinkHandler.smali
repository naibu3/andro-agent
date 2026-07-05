.class public final Lcom/stripe/android/paymentsheet/LinkHandler;
.super Ljava/lang/Object;
.source "LinkHandler.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/LinkHandler$WhenMappings;
    }
.end annotation

.annotation runtime Ljavax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0018\u0010\u0016\u001a\u00020\n2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0086@\u00a2\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u000fH\u0082@\u00a2\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0016\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\rR\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\r\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/LinkHandler;",
        "",
        "linkConfigurationCoordinator",
        "Lcom/stripe/android/link/LinkConfigurationCoordinator;",
        "<init>",
        "(Lcom/stripe/android/link/LinkConfigurationCoordinator;)V",
        "getLinkConfigurationCoordinator",
        "()Lcom/stripe/android/link/LinkConfigurationCoordinator;",
        "_isLinkEnabled",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "",
        "isLinkEnabled",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "_linkConfiguration",
        "Lcom/stripe/android/link/LinkConfiguration;",
        "linkConfiguration",
        "getLinkConfiguration",
        "setupLink",
        "",
        "state",
        "Lcom/stripe/android/paymentsheet/state/LinkState;",
        "setupLinkWithEagerLaunch",
        "(Lcom/stripe/android/paymentsheet/state/LinkState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "attestationCheckPassed",
        "configuration",
        "(Lcom/stripe/android/link/LinkConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "logOut",
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
.field private final _isLinkEnabled:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final _linkConfiguration:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/link/LinkConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private final isLinkEnabled:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final linkConfiguration:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/link/LinkConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private final linkConfigurationCoordinator:Lcom/stripe/android/link/LinkConfigurationCoordinator;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/LinkConfigurationCoordinator;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "linkConfigurationCoordinator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->linkConfigurationCoordinator:Lcom/stripe/android/link/LinkConfigurationCoordinator;

    const/4 p1, 0x0

    .line 20
    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->_isLinkEnabled:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 21
    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->isLinkEnabled:Lkotlinx/coroutines/flow/StateFlow;

    .line 23
    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->_linkConfiguration:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 24
    invoke-static {p1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->linkConfiguration:Lkotlinx/coroutines/flow/StateFlow;

    return-void
.end method

.method public static final synthetic access$attestationCheckPassed(Lcom/stripe/android/paymentsheet/LinkHandler;Lcom/stripe/android/link/LinkConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 16
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/LinkHandler;->attestationCheckPassed(Lcom/stripe/android/link/LinkConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final attestationCheckPassed(Lcom/stripe/android/link/LinkConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkConfiguration;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/paymentsheet/LinkHandler$attestationCheckPassed$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/paymentsheet/LinkHandler$attestationCheckPassed$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/LinkHandler$attestationCheckPassed$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/paymentsheet/LinkHandler$attestationCheckPassed$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/paymentsheet/LinkHandler$attestationCheckPassed$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/LinkHandler$attestationCheckPassed$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/paymentsheet/LinkHandler$attestationCheckPassed$1;-><init>(Lcom/stripe/android/paymentsheet/LinkHandler;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/paymentsheet/LinkHandler$attestationCheckPassed$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 56
    iget v2, v0, Lcom/stripe/android/paymentsheet/LinkHandler$attestationCheckPassed$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 57
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->linkConfigurationCoordinator:Lcom/stripe/android/link/LinkConfigurationCoordinator;

    .line 58
    invoke-interface {p2, p1}, Lcom/stripe/android/link/LinkConfigurationCoordinator;->linkAttestationCheck(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/attestation/LinkAttestationCheck;

    move-result-object p1

    .line 59
    iput v3, v0, Lcom/stripe/android/paymentsheet/LinkHandler$attestationCheckPassed$1;->label:I

    invoke-interface {p1, v0}, Lcom/stripe/android/link/attestation/LinkAttestationCheck;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    .line 56
    :cond_3
    :goto_1
    check-cast p2, Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result;

    .line 61
    instance-of p1, p2, Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result$AccountError;

    if-nez p1, :cond_6

    .line 62
    instance-of p1, p2, Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result$AttestationFailed;

    if-nez p1, :cond_6

    .line 63
    instance-of p1, p2, Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result$Error;

    if-eqz p1, :cond_4

    goto :goto_2

    .line 66
    :cond_4
    sget-object p1, Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result$Successful;->INSTANCE:Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result$Successful;

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_3

    .line 60
    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    :goto_2
    const/4 v3, 0x0

    :goto_3
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final getLinkConfiguration()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/link/LinkConfiguration;",
            ">;"
        }
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->linkConfiguration:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getLinkConfigurationCoordinator()Lcom/stripe/android/link/LinkConfigurationCoordinator;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->linkConfigurationCoordinator:Lcom/stripe/android/link/LinkConfigurationCoordinator;

    return-object v0
.end method

.method public final isLinkEnabled()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 21
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->isLinkEnabled:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final logOut()V
    .locals 8

    .line 74
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->linkConfiguration:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/LinkConfiguration;

    if-nez v0, :cond_0

    return-void

    .line 76
    :cond_0
    sget-object v1, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object v2, v1

    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    new-instance v1, Lcom/stripe/android/paymentsheet/LinkHandler$logOut$1;

    const/4 v3, 0x0

    invoke-direct {v1, p0, v0, v3}, Lcom/stripe/android/paymentsheet/LinkHandler$logOut$1;-><init>(Lcom/stripe/android/paymentsheet/LinkHandler;Lcom/stripe/android/link/LinkConfiguration;Lkotlin/coroutines/Continuation;)V

    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function2;

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final setupLink(Lcom/stripe/android/paymentsheet/state/LinkState;)V
    .locals 2

    .line 27
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->_isLinkEnabled:Lkotlinx/coroutines/flow/MutableStateFlow;

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    if-nez p1, :cond_1

    return-void

    .line 31
    :cond_1
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->_linkConfiguration:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/LinkState;->getConfiguration()Lcom/stripe/android/link/LinkConfiguration;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 35
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->linkConfigurationCoordinator:Lcom/stripe/android/link/LinkConfigurationCoordinator;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/LinkState;->getConfiguration()Lcom/stripe/android/link/LinkConfiguration;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/stripe/android/link/LinkConfigurationCoordinator;->getComponent(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/injection/LinkComponent;

    return-void
.end method

.method public final setupLinkWithEagerLaunch(Lcom/stripe/android/paymentsheet/state/LinkState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/state/LinkState;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 39
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/LinkHandler;->setupLink(Lcom/stripe/android/paymentsheet/state/LinkState;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    .line 41
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/LinkState;->getConfiguration()Lcom/stripe/android/link/LinkConfiguration;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 42
    :cond_0
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->linkConfigurationCoordinator:Lcom/stripe/android/link/LinkConfigurationCoordinator;

    invoke-interface {v2, v1}, Lcom/stripe/android/link/LinkConfigurationCoordinator;->linkGate(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/gate/LinkGate;

    move-result-object v2

    .line 43
    invoke-interface {v2}, Lcom/stripe/android/link/gate/LinkGate;->getSuppress2faModal()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 45
    :cond_1
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/LinkState;->getLoginState()Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    move-result-object p1

    sget-object v2, Lcom/stripe/android/paymentsheet/LinkHandler$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;->ordinal()I

    move-result p1

    aget p1, v2, p1

    const/4 v2, 0x1

    if-eq p1, v2, :cond_3

    const/4 v2, 0x2

    if-eq p1, v2, :cond_3

    const/4 p2, 0x3

    if-ne p1, p2, :cond_2

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 48
    :cond_3
    invoke-direct {p0, v1, p2}, Lcom/stripe/android/paymentsheet/LinkHandler;->attestationCheckPassed(Lcom/stripe/android/link/LinkConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 41
    :cond_4
    :goto_0
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
