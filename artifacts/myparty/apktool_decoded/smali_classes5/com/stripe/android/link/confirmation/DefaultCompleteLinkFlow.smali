.class public final Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;
.super Ljava/lang/Object;
.source "CompleteLinkFlow.kt"

# interfaces
.implements Lcom/stripe/android/link/confirmation/CompleteLinkFlow;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCompleteLinkFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompleteLinkFlow.kt\ncom/stripe/android/link/confirmation/DefaultCompleteLinkFlow\n+ 2 LinkDismissalCoordinator.kt\ncom/stripe/android/link/LinkDismissalCoordinatorKt\n*L\n1#1,123:1\n20#2,6:124\n*S KotlinDebug\n*F\n+ 1 CompleteLinkFlow.kt\ncom/stripe/android/link/confirmation/DefaultCompleteLinkFlow\n*L\n94#1:124,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B)\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001e\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096B\u00a2\u0006\u0002\u0010\u0012J<\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0008\u001a\u00020\t2\u001c\u0010\u0014\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00152\u0006\u0010\u0019\u001a\u00020\u000fH\u0082@\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;",
        "Lcom/stripe/android/link/confirmation/CompleteLinkFlow;",
        "linkConfirmationHandler",
        "Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;",
        "linkAccountManager",
        "Lcom/stripe/android/link/account/LinkAccountManager;",
        "dismissalCoordinator",
        "Lcom/stripe/android/link/LinkDismissalCoordinator;",
        "linkLaunchMode",
        "Lcom/stripe/android/link/LinkLaunchMode;",
        "<init>",
        "(Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/LinkDismissalCoordinator;Lcom/stripe/android/link/LinkLaunchMode;)V",
        "invoke",
        "Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result;",
        "selectedPaymentDetails",
        "Lcom/stripe/android/link/LinkPaymentMethod;",
        "linkAccount",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "(Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/link/model/LinkAccount;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "completeLinkFlow",
        "confirmPayment",
        "Lkotlin/Function1;",
        "Lkotlin/coroutines/Continuation;",
        "Lcom/stripe/android/link/confirmation/Result;",
        "",
        "paymentMethodSelection",
        "(Lcom/stripe/android/link/LinkLaunchMode;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/LinkPaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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


# instance fields
.field private final dismissalCoordinator:Lcom/stripe/android/link/LinkDismissalCoordinator;

.field private final linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

.field private final linkConfirmationHandler:Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;

.field private final linkLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/LinkDismissalCoordinator;Lcom/stripe/android/link/LinkLaunchMode;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "linkConfirmationHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccountManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dismissalCoordinator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkLaunchMode"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;->linkConfirmationHandler:Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;

    .line 55
    iput-object p2, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    .line 56
    iput-object p3, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;->dismissalCoordinator:Lcom/stripe/android/link/LinkDismissalCoordinator;

    .line 57
    iput-object p4, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;->linkLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

    return-void
.end method

.method public static final synthetic access$completeLinkFlow(Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;Lcom/stripe/android/link/LinkLaunchMode;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/LinkPaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 53
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;->completeLinkFlow(Lcom/stripe/android/link/LinkLaunchMode;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/LinkPaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getLinkConfirmationHandler$p(Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;)Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;
    .locals 0

    .line 53
    iget-object p0, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;->linkConfirmationHandler:Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;

    return-object p0
.end method

.method private final completeLinkFlow(Lcom/stripe/android/link/LinkLaunchMode;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/LinkPaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkLaunchMode;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/confirmation/Result;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/stripe/android/link/LinkPaymentMethod;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v2, p4, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$completeLinkFlow$1;

    if-eqz v2, :cond_0

    move-object v2, p4

    check-cast v2, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$completeLinkFlow$1;

    iget v3, v2, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$completeLinkFlow$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v1, v2, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$completeLinkFlow$1;->label:I

    sub-int/2addr v1, v4

    iput v1, v2, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$completeLinkFlow$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$completeLinkFlow$1;

    invoke-direct {v2, p0, p4}, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$completeLinkFlow$1;-><init>(Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v1, v2, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$completeLinkFlow$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 86
    iget v4, v2, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$completeLinkFlow$1;->label:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v0, v2, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$completeLinkFlow$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/link/LinkPaymentMethod;

    iget-object v2, v2, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$completeLinkFlow$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/link/LinkAccountUpdate;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-boolean v3, v2, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$completeLinkFlow$1;->Z$0:Z

    iget-object v0, v2, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$completeLinkFlow$1;->L$0:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/link/LinkDismissalCoordinator;

    :try_start_0
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_3
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 92
    instance-of v1, p1, Lcom/stripe/android/link/LinkLaunchMode$Full;

    if-nez v1, :cond_8

    .line 93
    instance-of v1, p1, Lcom/stripe/android/link/LinkLaunchMode$Confirmation;

    if-eqz v1, :cond_4

    goto :goto_2

    .line 106
    :cond_4
    instance-of v1, p1, Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;

    if-eqz v1, :cond_6

    .line 108
    iget-object v0, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-static {v0}, Lcom/stripe/android/link/account/LinkAccountUtilKt;->getLinkAccountUpdate(Lcom/stripe/android/link/account/LinkAccountManager;)Lcom/stripe/android/link/LinkAccountUpdate;

    move-result-object v0

    .line 110
    iget-object v1, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    iput-object v0, v2, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$completeLinkFlow$1;->L$0:Ljava/lang/Object;

    iput-object p3, v2, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$completeLinkFlow$1;->L$1:Ljava/lang/Object;

    iput v5, v2, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$completeLinkFlow$1;->label:I

    invoke-static {v1, v2}, Lcom/stripe/android/link/account/LinkAccountUtilKt;->loadDefaultShippingAddress(Lcom/stripe/android/link/account/LinkAccountManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_5

    goto :goto_3

    :cond_5
    move-object v2, v0

    move-object v0, p3

    .line 86
    :goto_1
    check-cast v1, Lcom/stripe/android/model/ConsumerShippingAddress;

    .line 107
    new-instance v3, Lcom/stripe/android/link/LinkActivityResult$Completed;

    invoke-direct {v3, v2, v0, v1}, Lcom/stripe/android/link/LinkActivityResult$Completed;-><init>(Lcom/stripe/android/link/LinkAccountUpdate;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/ConsumerShippingAddress;)V

    check-cast v3, Lcom/stripe/android/link/LinkActivityResult;

    .line 106
    new-instance v0, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Completed;

    invoke-direct {v0, v3}, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Completed;-><init>(Lcom/stripe/android/link/LinkActivityResult;)V

    check-cast v0, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result;

    return-object v0

    .line 113
    :cond_6
    instance-of v0, p1, Lcom/stripe/android/link/LinkLaunchMode$Authentication;

    if-eqz v0, :cond_7

    new-instance v0, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Completed;

    .line 114
    new-instance v1, Lcom/stripe/android/link/LinkActivityResult$Completed;

    .line 115
    iget-object v2, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-static {v2}, Lcom/stripe/android/link/account/LinkAccountUtilKt;->getLinkAccountUpdate(Lcom/stripe/android/link/account/LinkAccountManager;)Lcom/stripe/android/link/LinkAccountUpdate;

    move-result-object v2

    .line 114
    invoke-direct {v1, v2, v7, v7}, Lcom/stripe/android/link/LinkActivityResult$Completed;-><init>(Lcom/stripe/android/link/LinkAccountUpdate;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/ConsumerShippingAddress;)V

    check-cast v1, Lcom/stripe/android/link/LinkActivityResult;

    .line 113
    invoke-direct {v0, v1}, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Completed;-><init>(Lcom/stripe/android/link/LinkActivityResult;)V

    check-cast v0, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result;

    return-object v0

    .line 91
    :cond_7
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 94
    :cond_8
    :goto_2
    iget-object v1, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;->dismissalCoordinator:Lcom/stripe/android/link/LinkDismissalCoordinator;

    .line 124
    invoke-interface {v1}, Lcom/stripe/android/link/LinkDismissalCoordinator;->getCanDismiss()Z

    move-result v4

    const/4 v0, 0x0

    .line 125
    invoke-interface {v1, v0}, Lcom/stripe/android/link/LinkDismissalCoordinator;->setDismissible(Z)V

    .line 94
    :try_start_1
    iput-object v1, v2, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$completeLinkFlow$1;->L$0:Ljava/lang/Object;

    iput-boolean v4, v2, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$completeLinkFlow$1;->Z$0:Z

    iput v6, v2, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$completeLinkFlow$1;->label:I

    invoke-interface {p2, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v3, :cond_9

    :goto_3
    return-object v3

    :cond_9
    move-object v2, v1

    move v3, v4

    move-object v1, v0

    :goto_4
    :try_start_2
    check-cast v1, Lcom/stripe/android/link/confirmation/Result;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 129
    invoke-interface {v2, v3}, Lcom/stripe/android/link/LinkDismissalCoordinator;->setDismissible(Z)V

    .line 96
    sget-object v0, Lcom/stripe/android/link/confirmation/Result$Canceled;->INSTANCE:Lcom/stripe/android/link/confirmation/Result$Canceled;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    sget-object v0, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Canceled;->INSTANCE:Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Canceled;

    check-cast v0, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result;

    return-object v0

    .line 97
    :cond_a
    instance-of v0, v1, Lcom/stripe/android/link/confirmation/Result$Failed;

    if-eqz v0, :cond_b

    new-instance v0, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Failed;

    check-cast v1, Lcom/stripe/android/link/confirmation/Result$Failed;

    invoke-virtual {v1}, Lcom/stripe/android/link/confirmation/Result$Failed;->getMessage()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Failed;-><init>(Lcom/stripe/android/core/strings/ResolvableString;)V

    check-cast v0, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result;

    return-object v0

    .line 98
    :cond_b
    sget-object v0, Lcom/stripe/android/link/confirmation/Result$Succeeded;->INSTANCE:Lcom/stripe/android/link/confirmation/Result$Succeeded;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    new-instance v0, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Completed;

    .line 99
    new-instance v1, Lcom/stripe/android/link/LinkActivityResult$Completed;

    .line 100
    new-instance v2, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    sget-object v3, Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;->PaymentConfirmed:Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;

    invoke-direct {v2, v7, v3}, Lcom/stripe/android/link/LinkAccountUpdate$Value;-><init>(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;)V

    check-cast v2, Lcom/stripe/android/link/LinkAccountUpdate;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 99
    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/link/LinkActivityResult$Completed;-><init>(Lcom/stripe/android/link/LinkAccountUpdate;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/ConsumerShippingAddress;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Lcom/stripe/android/link/LinkActivityResult;

    .line 98
    invoke-direct {v0, v1}, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Completed;-><init>(Lcom/stripe/android/link/LinkActivityResult;)V

    check-cast v0, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result;

    return-object v0

    .line 95
    :cond_c
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :catchall_1
    move-exception v0

    move-object v2, v1

    move v3, v4

    .line 129
    :goto_5
    invoke-interface {v2, v3}, Lcom/stripe/android/link/LinkDismissalCoordinator;->setDismissible(Z)V

    throw v0
.end method


# virtual methods
.method public invoke(Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/link/model/LinkAccount;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkPaymentMethod;",
            "Lcom/stripe/android/link/model/LinkAccount;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 65
    iget-object v0, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;->linkLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

    .line 64
    new-instance v1, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, p2, v2}, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$invoke$2;-><init>(Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;Lcom/stripe/android/link/model/LinkAccount;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, v1, p1, p3}, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;->completeLinkFlow(Lcom/stripe/android/link/LinkLaunchMode;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/LinkPaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
