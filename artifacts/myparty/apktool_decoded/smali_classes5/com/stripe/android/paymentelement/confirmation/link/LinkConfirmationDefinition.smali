.class public final Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition;
.super Ljava/lang/Object;
.source "LinkConfirmationDefinition.kt"

# interfaces
.implements Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition<",
        "Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;",
        "Lcom/stripe/android/link/LinkPaymentLauncher;",
        "Lkotlin/Unit;",
        "Lcom/stripe/android/link/LinkActivityResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001B!\u0008\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J$\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0003H\u0016J$\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u001c2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001eH\u0096@\u00a2\u0006\u0002\u0010\u001fJ-\u0010 \u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001eH\u0016\u00a2\u0006\u0002\u0010\"J*\u0010#\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0008\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020\u0005H\u0016J\u000c\u0010(\u001a\u00020\u0004*\u00020)H\u0002R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006*"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition;",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;",
        "Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;",
        "Lcom/stripe/android/link/LinkPaymentLauncher;",
        "",
        "Lcom/stripe/android/link/LinkActivityResult;",
        "linkPaymentLauncher",
        "linkStore",
        "Lcom/stripe/android/link/account/LinkStore;",
        "linkAccountHolder",
        "Lcom/stripe/android/link/account/LinkAccountHolder;",
        "<init>",
        "(Lcom/stripe/android/link/LinkPaymentLauncher;Lcom/stripe/android/link/account/LinkStore;Lcom/stripe/android/link/account/LinkAccountHolder;)V",
        "key",
        "",
        "getKey",
        "()Ljava/lang/String;",
        "option",
        "confirmationOption",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;",
        "createLauncher",
        "activityResultCaller",
        "Landroidx/activity/result/ActivityResultCaller;",
        "onResult",
        "Lkotlin/Function1;",
        "unregister",
        "launcher",
        "action",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action;",
        "confirmationParameters",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;",
        "(Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "launch",
        "arguments",
        "(Lcom/stripe/android/link/LinkPaymentLauncher;Lkotlin/Unit;Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)V",
        "toResult",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;",
        "deferredIntentConfirmationType",
        "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;",
        "result",
        "updateLinkAccount",
        "Lcom/stripe/android/link/LinkAccountUpdate;",
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
.field private final key:Ljava/lang/String;

.field private final linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

.field private final linkPaymentLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

.field private final linkStore:Lcom/stripe/android/link/account/LinkStore;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/LinkPaymentLauncher;Lcom/stripe/android/link/account/LinkStore;Lcom/stripe/android/link/account/LinkAccountHolder;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "linkPaymentLauncher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkStore"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccountHolder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition;->linkPaymentLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

    .line 18
    iput-object p2, p0, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition;->linkStore:Lcom/stripe/android/link/account/LinkStore;

    .line 19
    iput-object p3, p0, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    .line 21
    const-string p1, "Link"

    iput-object p1, p0, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition;->key:Ljava/lang/String;

    return-void
.end method

.method private final updateLinkAccount(Lcom/stripe/android/link/LinkAccountUpdate;)V
    .locals 1

    .line 115
    instance-of v0, p1, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    if-eqz v0, :cond_0

    .line 116
    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    check-cast p1, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-virtual {v0, p1}, Lcom/stripe/android/link/account/LinkAccountHolder;->set(Lcom/stripe/android/link/LinkAccountUpdate$Value;)V

    return-void

    .line 118
    :cond_0
    sget-object v0, Lcom/stripe/android/link/LinkAccountUpdate$None;->INSTANCE:Lcom/stripe/android/link/LinkAccountUpdate$None;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    .line 114
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public bridge synthetic action(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 16
    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition;->action(Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public action(Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action<",
            "Lkotlin/Unit;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 44
    new-instance p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;

    .line 45
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    const/4 p3, 0x0

    const/4 v0, 0x0

    .line 44
    invoke-direct {p1, p2, p3, v0}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;-><init>(Ljava/lang/Object;ZLcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;)V

    return-object p1
.end method

.method public bridge synthetic canConfirm(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)Z
    .locals 0

    .line 16
    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition;->canConfirm(Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)Z

    move-result p1

    return p1
.end method

.method public canConfirm(Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)Z
    .locals 0

    .line 16
    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$DefaultImpls;->canConfirm(Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)Z

    move-result p1

    return p1
.end method

.method public createLauncher(Landroidx/activity/result/ActivityResultCaller;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/link/LinkPaymentLauncher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/activity/result/ActivityResultCaller;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/LinkActivityResult;",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/stripe/android/link/LinkPaymentLauncher;"
        }
    .end annotation

    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition;->linkPaymentLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

    .line 32
    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/link/LinkPaymentLauncher;->register(Landroidx/activity/result/ActivityResultCaller;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public bridge synthetic createLauncher(Landroidx/activity/result/ActivityResultCaller;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 0

    .line 16
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition;->createLauncher(Landroidx/activity/result/ActivityResultCaller;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/link/LinkPaymentLauncher;

    move-result-object p1

    return-object p1
.end method

.method public getKey()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition;->key:Ljava/lang/String;

    return-object v0
.end method

.method public launch(Lcom/stripe/android/link/LinkPaymentLauncher;Lkotlin/Unit;Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)V
    .locals 1

    const-string v0, "launcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "confirmationOption"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "confirmationParameters"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    invoke-virtual {p3}, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;->getConfiguration()Lcom/stripe/android/link/LinkConfiguration;

    move-result-object p2

    .line 59
    iget-object p4, p0, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    invoke-virtual {p4}, Lcom/stripe/android/link/account/LinkAccountHolder;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p4

    invoke-interface {p4}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    .line 60
    invoke-virtual {p3}, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;->getLinkLaunchMode()Lcom/stripe/android/link/LinkLaunchMode;

    move-result-object v0

    .line 61
    invoke-virtual {p3}, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;->getLinkExpressMode()Lcom/stripe/android/link/LinkExpressMode;

    move-result-object p3

    .line 57
    invoke-virtual {p1, p2, p4, v0, p3}, Lcom/stripe/android/link/LinkPaymentLauncher;->present(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/LinkAccountUpdate$Value;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/link/LinkExpressMode;)V

    return-void
.end method

.method public bridge synthetic launch(Ljava/lang/Object;Ljava/lang/Object;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)V
    .locals 0

    .line 16
    check-cast p1, Lcom/stripe/android/link/LinkPaymentLauncher;

    check-cast p2, Lkotlin/Unit;

    check-cast p3, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition;->launch(Lcom/stripe/android/link/LinkPaymentLauncher;Lkotlin/Unit;Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)V

    return-void
.end method

.method public bridge synthetic option(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;
    .locals 0

    .line 16
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition;->option(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;)Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    return-object p1
.end method

.method public option(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;)Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;
    .locals 1

    const-string v0, "confirmationOption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    instance-of v0, p1, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic toResult(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;Landroid/os/Parcelable;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;
    .locals 0

    .line 16
    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;

    check-cast p4, Lcom/stripe/android/link/LinkActivityResult;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition;->toResult(Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;Lcom/stripe/android/link/LinkActivityResult;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;

    move-result-object p1

    return-object p1
.end method

.method public toResult(Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;Lcom/stripe/android/link/LinkActivityResult;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;
    .locals 6

    const-string v0, "confirmationOption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "confirmationParameters"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "result"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    instance-of p1, p4, Lcom/stripe/android/link/LinkActivityResult$Canceled;

    if-eqz p1, :cond_0

    .line 73
    move-object v0, p4

    check-cast v0, Lcom/stripe/android/link/LinkActivityResult$Canceled;

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkActivityResult$Canceled;->getReason()Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;->BackPressed:Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;

    if-eq v0, v1, :cond_1

    .line 75
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition;->linkStore:Lcom/stripe/android/link/account/LinkStore;

    invoke-virtual {v0}, Lcom/stripe/android/link/account/LinkStore;->markLinkAsUsed()V

    .line 79
    :cond_1
    instance-of v0, p4, Lcom/stripe/android/link/LinkActivityResult$PaymentMethodObtained;

    if-eqz v0, :cond_2

    .line 80
    new-instance p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$NextStep;

    .line 81
    new-instance p3, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$Saved;

    .line 82
    check-cast p4, Lcom/stripe/android/link/LinkActivityResult$PaymentMethodObtained;

    invoke-virtual {p4}, Lcom/stripe/android/link/LinkActivityResult$PaymentMethodObtained;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p4

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 81
    invoke-direct {p3, p4, v0, v1}, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$Saved;-><init>(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Z)V

    check-cast p3, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    .line 80
    invoke-direct {p1, p3, p2}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$NextStep;-><init>(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)V

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;

    return-object p1

    .line 89
    :cond_2
    instance-of v0, p4, Lcom/stripe/android/link/LinkActivityResult$Failed;

    if-eqz v0, :cond_3

    .line 90
    check-cast p4, Lcom/stripe/android/link/LinkActivityResult$Failed;

    invoke-virtual {p4}, Lcom/stripe/android/link/LinkActivityResult$Failed;->getLinkAccountUpdate()Lcom/stripe/android/link/LinkAccountUpdate;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition;->updateLinkAccount(Lcom/stripe/android/link/LinkAccountUpdate;)V

    .line 91
    new-instance p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Failed;

    .line 92
    invoke-virtual {p4}, Lcom/stripe/android/link/LinkActivityResult$Failed;->getError()Ljava/lang/Throwable;

    move-result-object p2

    .line 93
    invoke-virtual {p4}, Lcom/stripe/android/link/LinkActivityResult$Failed;->getError()Ljava/lang/Throwable;

    move-result-object p3

    invoke-static {p3}, Lcom/stripe/android/common/exception/ExceptionKtKt;->stripeErrorMessage(Ljava/lang/Throwable;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p3

    .line 94
    sget-object p4, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType$Payment;->INSTANCE:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType$Payment;

    check-cast p4, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;

    .line 91
    invoke-direct {p1, p2, p3, p4}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Failed;-><init>(Ljava/lang/Throwable;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;)V

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;

    return-object p1

    :cond_3
    if-eqz p1, :cond_4

    .line 98
    check-cast p4, Lcom/stripe/android/link/LinkActivityResult$Canceled;

    invoke-virtual {p4}, Lcom/stripe/android/link/LinkActivityResult$Canceled;->getLinkAccountUpdate()Lcom/stripe/android/link/LinkAccountUpdate;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition;->updateLinkAccount(Lcom/stripe/android/link/LinkAccountUpdate;)V

    .line 99
    new-instance p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Canceled;

    .line 100
    sget-object p2, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Canceled$Action;->InformCancellation:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Canceled$Action;

    .line 99
    invoke-direct {p1, p2}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Canceled;-><init>(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Canceled$Action;)V

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;

    return-object p1

    .line 103
    :cond_4
    instance-of p1, p4, Lcom/stripe/android/link/LinkActivityResult$Completed;

    if-eqz p1, :cond_5

    .line 104
    check-cast p4, Lcom/stripe/android/link/LinkActivityResult$Completed;

    invoke-virtual {p4}, Lcom/stripe/android/link/LinkActivityResult$Completed;->getLinkAccountUpdate()Lcom/stripe/android/link/LinkAccountUpdate;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition;->updateLinkAccount(Lcom/stripe/android/link/LinkAccountUpdate;)V

    .line 105
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Succeeded;

    .line 106
    invoke-virtual {p2}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;->getIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v1

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v2, p3

    .line 105
    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Succeeded;-><init>(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;

    return-object v0

    .line 78
    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public unregister(Lcom/stripe/android/link/LinkPaymentLauncher;)V
    .locals 1

    const-string v0, "launcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentLauncher;->unregister()V

    return-void
.end method

.method public bridge synthetic unregister(Ljava/lang/Object;)V
    .locals 0

    .line 16
    check-cast p1, Lcom/stripe/android/link/LinkPaymentLauncher;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition;->unregister(Lcom/stripe/android/link/LinkPaymentLauncher;)V

    return-void
.end method
