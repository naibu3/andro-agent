.class public final Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;
.super Ljava/lang/Object;
.source "DefaultLinkConfirmationHandler.kt"

# interfaces
.implements Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001:\u0001!B!\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ2\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096@\u00a2\u0006\u0002\u0010\u0013J2\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096@\u00a2\u0006\u0002\u0010\u0015J\u001c\u0010\n\u001a\u00020\u000b2\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017H\u0082@\u00a2\u0006\u0002\u0010\u0019J\u0012\u0010\u001a\u001a\u00020\u000b2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J,\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u000c\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J,\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J\u001a\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u000c\u001a\u00020 2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""
    }
    d2 = {
        "Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;",
        "Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;",
        "configuration",
        "Lcom/stripe/android/link/LinkConfiguration;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "confirmationHandler",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;",
        "<init>",
        "(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/core/Logger;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;)V",
        "confirm",
        "Lcom/stripe/android/link/confirmation/Result;",
        "paymentDetails",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "linkAccount",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "cvc",
        "",
        "billingPhone",
        "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/stripe/android/link/LinkPaymentDetails;",
        "(Lcom/stripe/android/link/LinkPaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createArgs",
        "Lkotlin/Function0;",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;",
        "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "transformResult",
        "result",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;",
        "confirmationArgs",
        "newConfirmationArgs",
        "savedConfirmationArgs",
        "Lcom/stripe/android/link/LinkPaymentDetails$Saved;",
        "Factory",
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
.field private final configuration:Lcom/stripe/android/link/LinkConfiguration;

.field private final confirmationHandler:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;

.field private final logger:Lcom/stripe/android/core/Logger;


# direct methods
.method public static synthetic $r8$lambda$D0MHiev8HVTI_uzvusr1kbHrbNI(Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;Lcom/stripe/android/link/LinkPaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;->confirm$lambda$1(Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;Lcom/stripe/android/link/LinkPaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$bEG7PEctK0zXUdQlvLjGN3k-1eA(Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;->confirm$lambda$0(Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/core/Logger;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationHandler"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    .line 26
    iput-object p2, p0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;->logger:Lcom/stripe/android/core/Logger;

    .line 27
    iput-object p3, p0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;->confirmationHandler:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;

    return-void
.end method

.method public static final synthetic access$confirm(Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;->confirm(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final confirm(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/confirmation/Result;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$confirm$5;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$confirm$5;

    iget v1, v0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$confirm$5;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$confirm$5;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$confirm$5;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$confirm$5;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$confirm$5;-><init>(Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$confirm$5;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 61
    iget v2, v0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$confirm$5;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$confirm$5;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;

    iget-object v0, v0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$confirm$5;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;

    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$confirm$5;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;

    iget-object v2, v0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$confirm$5;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;

    :try_start_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    move-object v0, v2

    goto :goto_4

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 64
    :try_start_2
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object p2, p0

    check-cast p2, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;

    .line 65
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;

    .line 66
    iget-object p2, p0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;->confirmationHandler:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;

    iput-object p0, v0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$confirm$5;->L$0:Ljava/lang/Object;

    iput-object p0, v0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$confirm$5;->L$1:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$confirm$5;->label:I

    invoke-interface {p2, p1, v0}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;->start(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, p0

    move-object v2, p1

    .line 67
    :goto_1
    :try_start_3
    iget-object p2, p1, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;->confirmationHandler:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;

    iput-object v2, v0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$confirm$5;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$confirm$5;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$confirm$5;->label:I

    invoke-interface {p2, v0}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;->awaitResult(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne p2, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v0, v2

    .line 61
    :goto_3
    :try_start_4
    check-cast p2, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;

    .line 68
    invoke-direct {p1, p2}, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;->transformResult(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;)Lcom/stripe/android/link/confirmation/Result;

    move-result-object p1

    .line 64
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_5

    :catchall_2
    move-exception p1

    move-object v0, p0

    :goto_4
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 69
    :goto_5
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_6

    goto :goto_6

    .line 70
    :cond_6
    iget-object p1, v0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;->logger:Lcom/stripe/android/core/Logger;

    .line 71
    const-string v0, "DefaultLinkConfirmationHandler: Failed to confirm payment"

    .line 70
    invoke-interface {p1, v0, p2}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 74
    new-instance p1, Lcom/stripe/android/link/confirmation/Result$Failed;

    sget p2, Lcom/stripe/android/paymentsheet/R$string;->stripe_something_went_wrong:I

    invoke-static {p2}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/stripe/android/link/confirmation/Result$Failed;-><init>(Lcom/stripe/android/core/strings/ResolvableString;)V

    check-cast p1, Lcom/stripe/android/link/confirmation/Result;

    :goto_6
    return-object p1
.end method

.method private static final confirm$lambda$0(Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;->newConfirmationArgs(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;

    move-result-object p0

    return-object p0
.end method

.method private static final confirm$lambda$1(Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;Lcom/stripe/android/link/LinkPaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;->confirmationArgs(Lcom/stripe/android/link/LinkPaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;

    move-result-object p0

    return-object p0
.end method

.method private final confirmationArgs(Lcom/stripe/android/link/LinkPaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;
    .locals 1

    .line 103
    instance-of v0, p1, Lcom/stripe/android/link/LinkPaymentDetails$New;

    if-eqz v0, :cond_0

    .line 105
    check-cast p1, Lcom/stripe/android/link/LinkPaymentDetails$New;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentDetails$New;->getPaymentDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object p1

    .line 104
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;->newConfirmationArgs(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;

    move-result-object p1

    return-object p1

    .line 111
    :cond_0
    instance-of p2, p1, Lcom/stripe/android/link/LinkPaymentDetails$Saved;

    if-eqz p2, :cond_1

    .line 113
    check-cast p1, Lcom/stripe/android/link/LinkPaymentDetails$Saved;

    .line 112
    invoke-direct {p0, p1, p3}, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;->savedConfirmationArgs(Lcom/stripe/android/link/LinkPaymentDetails$Saved;Ljava/lang/String;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;

    move-result-object p1

    return-object p1

    .line 102
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final newConfirmationArgs(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;
    .locals 8

    .line 126
    iget-object v0, p0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkConfiguration;->getPassthroughModeEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 127
    new-instance p2, Lcom/stripe/android/paymentelement/confirmation/link/LinkPassthroughConfirmationOption;

    .line 128
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v0

    .line 129
    iget-object v1, p0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-static {v1, p1}, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandlerKt;->computeExpectedPaymentMethodType(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)Ljava/lang/String;

    move-result-object p1

    .line 127
    invoke-direct {p2, v0, p1, p3, p4}, Lcom/stripe/android/paymentelement/confirmation/link/LinkPassthroughConfirmationOption;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    check-cast p2, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    goto :goto_0

    .line 137
    :cond_0
    invoke-virtual {p2}, Lcom/stripe/android/link/model/LinkAccount;->getClientSecret()Ljava/lang/String;

    move-result-object p2

    .line 135
    invoke-static {p1, p2, p3, p4}, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandlerKt;->createPaymentMethodCreateParams(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v1

    .line 134
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$New;

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$New;-><init>(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;ZLcom/stripe/android/model/PassiveCaptchaParams;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p2, v0

    check-cast p2, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    :goto_0
    move-object v2, p2

    .line 147
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;

    .line 148
    iget-object p1, p0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkConfiguration;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v1

    .line 150
    new-instance v3, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    invoke-direct {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;-><init>()V

    .line 151
    iget-object p1, p0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkConfiguration;->getInitializationMode()Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    move-result-object v4

    .line 152
    iget-object p1, p0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkConfiguration;->getShippingDetails()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object v5

    .line 147
    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;-><init>(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V

    return-object v0
.end method

.method private final savedConfirmationArgs(Lcom/stripe/android/link/LinkPaymentDetails$Saved;Ljava/lang/String;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;
    .locals 19

    move-object/from16 v0, p0

    .line 161
    iget-object v1, v0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkConfiguration;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v3

    .line 163
    new-instance v1, Lcom/stripe/android/model/PaymentMethod$Builder;

    invoke-direct {v1}, Lcom/stripe/android/model/PaymentMethod$Builder;-><init>()V

    .line 164
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/link/LinkPaymentDetails$Saved;->getPaymentDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$Passthrough;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/model/ConsumerPaymentDetails$Passthrough;->getPaymentMethodId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/stripe/android/model/PaymentMethod$Builder;->setId(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$Builder;

    move-result-object v1

    .line 165
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/link/LinkPaymentDetails$Saved;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/model/PaymentMethodCreateParams;->getTypeCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/stripe/android/model/PaymentMethod$Builder;->setCode(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$Builder;

    move-result-object v1

    .line 167
    new-instance v4, Lcom/stripe/android/model/PaymentMethod$Card;

    .line 168
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/link/LinkPaymentDetails$Saved;->getPaymentDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$Passthrough;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/model/ConsumerPaymentDetails$Passthrough;->getLast4()Ljava/lang/String;

    move-result-object v12

    .line 169
    new-instance v2, Lcom/stripe/android/model/wallets/Wallet$LinkWallet;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/link/LinkPaymentDetails$Saved;->getPaymentDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$Passthrough;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/model/ConsumerPaymentDetails$Passthrough;->getLast4()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v5}, Lcom/stripe/android/model/wallets/Wallet$LinkWallet;-><init>(Ljava/lang/String;)V

    move-object v14, v2

    check-cast v14, Lcom/stripe/android/model/wallets/Wallet;

    const/16 v17, 0xd7f

    const/16 v18, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    .line 167
    invoke-direct/range {v4 .. v18}, Lcom/stripe/android/model/PaymentMethod$Card;-><init>(Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/model/PaymentMethod$Card$Checks;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;Lcom/stripe/android/model/wallets/Wallet;Lcom/stripe/android/model/PaymentMethod$Card$Networks;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 166
    invoke-virtual {v1, v4}, Lcom/stripe/android/model/PaymentMethod$Builder;->setCard(Lcom/stripe/android/model/PaymentMethod$Card;)Lcom/stripe/android/model/PaymentMethod$Builder;

    move-result-object v1

    .line 172
    sget-object v2, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {v1, v2}, Lcom/stripe/android/model/PaymentMethod$Builder;->setType(Lcom/stripe/android/model/PaymentMethod$Type;)Lcom/stripe/android/model/PaymentMethod$Builder;

    move-result-object v1

    .line 173
    invoke-virtual {v1}, Lcom/stripe/android/model/PaymentMethod$Builder;->build()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v5

    .line 175
    sget-object v9, Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;->OffSession:Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    .line 177
    iget-object v2, v0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v2}, Lcom/stripe/android/link/LinkConfiguration;->getPassthroughModeEnabled()Z

    move-result v2

    if-nez v2, :cond_0

    move-object/from16 v7, p2

    goto :goto_0

    :cond_0
    move-object v7, v1

    .line 174
    :goto_0
    new-instance v6, Lcom/stripe/android/model/PaymentMethodOptionsParams$Card;

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v6 .. v11}, Lcom/stripe/android/model/PaymentMethodOptionsParams$Card;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v6, Lcom/stripe/android/model/PaymentMethodOptionsParams;

    .line 162
    new-instance v4, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$Saved;

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$Saved;-><init>(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v4, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    .line 181
    new-instance v5, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    invoke-direct {v5}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;-><init>()V

    .line 182
    iget-object v1, v0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkConfiguration;->getInitializationMode()Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    move-result-object v6

    .line 183
    iget-object v1, v0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkConfiguration;->getShippingDetails()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object v7

    .line 160
    new-instance v2, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;

    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;-><init>(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V

    return-object v2
.end method

.method private final transformResult(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;)Lcom/stripe/android/link/confirmation/Result;
    .locals 3

    .line 80
    instance-of v0, p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Canceled;

    if-eqz v0, :cond_0

    sget-object p1, Lcom/stripe/android/link/confirmation/Result$Canceled;->INSTANCE:Lcom/stripe/android/link/confirmation/Result$Canceled;

    check-cast p1, Lcom/stripe/android/link/confirmation/Result;

    return-object p1

    .line 81
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed;

    if-eqz v0, :cond_1

    .line 82
    iget-object v0, p0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;->logger:Lcom/stripe/android/core/Logger;

    .line 84
    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed;

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    .line 82
    const-string v2, "DefaultLinkConfirmationHandler: Failed to confirm payment"

    invoke-interface {v0, v2, v1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 86
    new-instance v0, Lcom/stripe/android/link/confirmation/Result$Failed;

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed;->getMessage()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/stripe/android/link/confirmation/Result$Failed;-><init>(Lcom/stripe/android/core/strings/ResolvableString;)V

    check-cast v0, Lcom/stripe/android/link/confirmation/Result;

    return-object v0

    .line 88
    :cond_1
    instance-of v0, p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Succeeded;

    if-eqz v0, :cond_2

    sget-object p1, Lcom/stripe/android/link/confirmation/Result$Succeeded;->INSTANCE:Lcom/stripe/android/link/confirmation/Result$Succeeded;

    check-cast p1, Lcom/stripe/android/link/confirmation/Result;

    return-object p1

    :cond_2
    if-nez p1, :cond_3

    .line 90
    iget-object p1, p0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;->logger:Lcom/stripe/android/core/Logger;

    const-string v0, "DefaultLinkConfirmationHandler: Payment confirmation returned null"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v0, v2, v1, v2}, Lcom/stripe/android/core/Logger$DefaultImpls;->error$default(Lcom/stripe/android/core/Logger;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 91
    new-instance p1, Lcom/stripe/android/link/confirmation/Result$Failed;

    sget v0, Lcom/stripe/android/paymentsheet/R$string;->stripe_something_went_wrong:I

    invoke-static {v0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/stripe/android/link/confirmation/Result$Failed;-><init>(Lcom/stripe/android/core/strings/ResolvableString;)V

    check-cast p1, Lcom/stripe/android/link/confirmation/Result;

    return-object p1

    .line 79
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public confirm(Lcom/stripe/android/link/LinkPaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkPaymentDetails;",
            "Lcom/stripe/android/link/model/LinkAccount;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/confirmation/Result;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 51
    new-instance v0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$$ExternalSyntheticLambda0;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;Lcom/stripe/android/link/LinkPaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v0, p5}, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;->confirm(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public confirm(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Lcom/stripe/android/link/model/LinkAccount;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/confirmation/Result;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 35
    new-instance v0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$$ExternalSyntheticLambda1;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v0, p5}, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;->confirm(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
