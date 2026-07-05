.class public final Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;
.super Ljava/lang/Object;
.source "LinkInlineSignupConfirmationDefinition.kt"

# interfaces
.implements Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Launcher;,
        Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$LauncherArguments;,
        Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Result;,
        Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition<",
        "Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;",
        "Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Launcher;",
        "Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$LauncherArguments;",
        "Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Result;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0003@ABB\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J$\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@\u00a2\u0006\u0002\u0010\u0019J$\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J(\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J*\u0010#\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0008\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020\u0005H\u0016J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0002H\u0082@\u00a2\u0006\u0002\u0010+J\u001e\u0010,\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010-\u001a\u00020.H\u0082@\u00a2\u0006\u0002\u0010/J\u001c\u00100\u001a\u000201*\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0002J&\u00107\u001a\u000208*\u0002092\u0006\u00105\u001a\u0002062\u0006\u0010:\u001a\u00020;2\u0008\u0010<\u001a\u0004\u0018\u00010=H\u0002J\u000c\u00107\u001a\u000208*\u00020\u0002H\u0002J\u000c\u0010>\u001a\u00020?*\u000206H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006C"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;",
        "Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;",
        "Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Launcher;",
        "Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$LauncherArguments;",
        "Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Result;",
        "linkConfigurationCoordinator",
        "Lcom/stripe/android/link/LinkConfigurationCoordinator;",
        "linkAnalyticsHelper",
        "Lcom/stripe/android/link/analytics/LinkAnalyticsHelper;",
        "linkStore",
        "Lcom/stripe/android/link/account/LinkStore;",
        "<init>",
        "(Lcom/stripe/android/link/LinkConfigurationCoordinator;Lcom/stripe/android/link/analytics/LinkAnalyticsHelper;Lcom/stripe/android/link/account/LinkStore;)V",
        "key",
        "",
        "getKey",
        "()Ljava/lang/String;",
        "option",
        "confirmationOption",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;",
        "action",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action;",
        "confirmationParameters",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;",
        "(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createLauncher",
        "activityResultCaller",
        "Landroidx/activity/result/ActivityResultCaller;",
        "onResult",
        "Lkotlin/Function1;",
        "",
        "launch",
        "launcher",
        "arguments",
        "toResult",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;",
        "deferredIntentConfirmationType",
        "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;",
        "result",
        "createPaymentMethodConfirmationOption",
        "Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;",
        "linkInlineSignupConfirmationOption",
        "(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createOptionAfterAttachingToLink",
        "userInput",
        "Lcom/stripe/android/link/ui/inline/UserInput;",
        "(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;Lcom/stripe/android/link/ui/inline/UserInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "toSavedOption",
        "Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$Saved;",
        "Lcom/stripe/android/link/LinkPaymentDetails$Saved;",
        "createParams",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "saveOption",
        "Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption$PaymentMethodSaveOption;",
        "toNewOption",
        "Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$New;",
        "Lcom/stripe/android/link/LinkPaymentDetails$New;",
        "configuration",
        "Lcom/stripe/android/link/LinkConfiguration;",
        "extraParams",
        "Lcom/stripe/android/model/PaymentMethodExtraParams;",
        "shouldSave",
        "",
        "Result",
        "LauncherArguments",
        "Launcher",
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

.field private final linkAnalyticsHelper:Lcom/stripe/android/link/analytics/LinkAnalyticsHelper;

.field private final linkConfigurationCoordinator:Lcom/stripe/android/link/LinkConfigurationCoordinator;

.field private final linkStore:Lcom/stripe/android/link/account/LinkStore;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/LinkConfigurationCoordinator;Lcom/stripe/android/link/analytics/LinkAnalyticsHelper;Lcom/stripe/android/link/account/LinkStore;)V
    .locals 1

    const-string v0, "linkConfigurationCoordinator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAnalyticsHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkStore"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->linkConfigurationCoordinator:Lcom/stripe/android/link/LinkConfigurationCoordinator;

    .line 27
    iput-object p2, p0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->linkAnalyticsHelper:Lcom/stripe/android/link/analytics/LinkAnalyticsHelper;

    .line 28
    iput-object p3, p0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->linkStore:Lcom/stripe/android/link/account/LinkStore;

    .line 35
    const-string p1, "LinkInlineSignup"

    iput-object p1, p0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->key:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$createOptionAfterAttachingToLink(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;Lcom/stripe/android/link/ui/inline/UserInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->createOptionAfterAttachingToLink(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;Lcom/stripe/android/link/ui/inline/UserInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$createPaymentMethodConfirmationOption(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->createPaymentMethodConfirmationOption(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final createOptionAfterAttachingToLink(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;Lcom/stripe/android/link/ui/inline/UserInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;",
            "Lcom/stripe/android/link/ui/inline/UserInput;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createOptionAfterAttachingToLink$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createOptionAfterAttachingToLink$1;

    iget v1, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createOptionAfterAttachingToLink$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createOptionAfterAttachingToLink$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createOptionAfterAttachingToLink$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createOptionAfterAttachingToLink$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createOptionAfterAttachingToLink$1;-><init>(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createOptionAfterAttachingToLink$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 111
    iget v2, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createOptionAfterAttachingToLink$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createOptionAfterAttachingToLink$1;->L$5:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/LinkConfiguration;

    iget-object p2, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createOptionAfterAttachingToLink$1;->L$4:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/model/PaymentMethodExtraParams;

    iget-object v1, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createOptionAfterAttachingToLink$1;->L$3:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption$PaymentMethodSaveOption;

    iget-object v2, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createOptionAfterAttachingToLink$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/model/PaymentMethodCreateParams;

    iget-object v3, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createOptionAfterAttachingToLink$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;

    iget-object v0, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createOptionAfterAttachingToLink$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p3

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 115
    instance-of p2, p2, Lcom/stripe/android/link/ui/inline/UserInput$SignIn;

    if-eqz p2, :cond_3

    .line 116
    iget-object p2, p0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->linkAnalyticsHelper:Lcom/stripe/android/link/analytics/LinkAnalyticsHelper;

    invoke-interface {p2}, Lcom/stripe/android/link/analytics/LinkAnalyticsHelper;->onLinkPopupSkipped()V

    .line 118
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->toNewOption(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;)Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$New;

    move-result-object p1

    return-object p1

    .line 121
    :cond_3
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;->getCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v2

    .line 122
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;->getSaveOption()Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption$PaymentMethodSaveOption;

    move-result-object p2

    .line 123
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;->getExtraParams()Lcom/stripe/android/model/PaymentMethodExtraParams;

    move-result-object p3

    .line 124
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;->getLinkConfiguration()Lcom/stripe/android/link/LinkConfiguration;

    move-result-object v4

    .line 126
    iget-object v5, p0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->linkConfigurationCoordinator:Lcom/stripe/android/link/LinkConfigurationCoordinator;

    iput-object p0, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createOptionAfterAttachingToLink$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createOptionAfterAttachingToLink$1;->L$1:Ljava/lang/Object;

    iput-object v2, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createOptionAfterAttachingToLink$1;->L$2:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createOptionAfterAttachingToLink$1;->L$3:Ljava/lang/Object;

    iput-object p3, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createOptionAfterAttachingToLink$1;->L$4:Ljava/lang/Object;

    iput-object v4, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createOptionAfterAttachingToLink$1;->L$5:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createOptionAfterAttachingToLink$1;->label:I

    invoke-interface {v5, v4, v2, v0}, Lcom/stripe/android/link/LinkConfigurationCoordinator;->attachNewCardToAccount-0E7RQCE(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_4

    return-object v1

    :cond_4
    move-object v3, p1

    move-object v1, p2

    move-object p2, p3

    move-object p3, v0

    move-object p1, v4

    move-object v0, p0

    .line 129
    :goto_1
    invoke-static {p3}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/4 p3, 0x0

    :cond_5
    check-cast p3, Lcom/stripe/android/link/LinkPaymentDetails;

    .line 132
    instance-of v4, p3, Lcom/stripe/android/link/LinkPaymentDetails$New;

    if-eqz v4, :cond_6

    .line 133
    iget-object v2, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->linkStore:Lcom/stripe/android/link/account/LinkStore;

    invoke-virtual {v2}, Lcom/stripe/android/link/account/LinkStore;->markLinkAsUsed()V

    .line 135
    check-cast p3, Lcom/stripe/android/link/LinkPaymentDetails$New;

    invoke-direct {v0, p3, v1, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->toNewOption(Lcom/stripe/android/link/LinkPaymentDetails$New;Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption$PaymentMethodSaveOption;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/model/PaymentMethodExtraParams;)Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$New;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;

    return-object p1

    .line 137
    :cond_6
    instance-of p1, p3, Lcom/stripe/android/link/LinkPaymentDetails$Saved;

    if-eqz p1, :cond_7

    .line 138
    iget-object p1, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->linkStore:Lcom/stripe/android/link/account/LinkStore;

    invoke-virtual {p1}, Lcom/stripe/android/link/account/LinkStore;->markLinkAsUsed()V

    .line 140
    check-cast p3, Lcom/stripe/android/link/LinkPaymentDetails$Saved;

    invoke-direct {v0, p3, v2, v1}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->toSavedOption(Lcom/stripe/android/link/LinkPaymentDetails$Saved;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption$PaymentMethodSaveOption;)Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$Saved;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;

    return-object p1

    :cond_7
    if-nez p3, :cond_8

    .line 142
    invoke-direct {v0, v3}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->toNewOption(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;)Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$New;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;

    return-object p1

    .line 131
    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final createPaymentMethodConfirmationOption(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;

    iget v1, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;-><init>(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 82
    iget v2, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;->label:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_4

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
    iget-object p1, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;

    iget-object v2, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    goto/16 :goto_3

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object p2

    :cond_4
    iget-object p1, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;->L$3:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/ui/inline/UserInput;

    iget-object v2, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/link/LinkConfiguration;

    iget-object v8, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;->L$1:Ljava/lang/Object;

    check-cast v8, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;

    iget-object v9, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;->L$0:Ljava/lang/Object;

    check-cast v9, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v11, p2

    move-object p2, p1

    move-object p1, v8

    move-object v8, v11

    move-object v11, v9

    move-object v9, v2

    move-object v2, v11

    goto :goto_1

    :cond_5
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 85
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;->getLinkConfiguration()Lcom/stripe/android/link/LinkConfiguration;

    move-result-object v2

    .line 86
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;->getUserInput()Lcom/stripe/android/link/ui/inline/UserInput;

    move-result-object p2

    .line 88
    iget-object v8, p0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->linkConfigurationCoordinator:Lcom/stripe/android/link/LinkConfigurationCoordinator;

    invoke-interface {v8, v2}, Lcom/stripe/android/link/LinkConfigurationCoordinator;->getAccountStatusFlow(Lcom/stripe/android/link/LinkConfiguration;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v8

    iput-object p0, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;->L$1:Ljava/lang/Object;

    iput-object v2, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;->L$2:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;->L$3:Ljava/lang/Object;

    iput v6, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;->label:I

    invoke-static {v8, v0}, Lkotlinx/coroutines/flow/FlowKt;->first(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v1, :cond_6

    goto/16 :goto_5

    :cond_6
    move-object v9, v2

    move-object v2, p0

    :goto_1
    check-cast v8, Lcom/stripe/android/link/model/AccountStatus;

    sget-object v10, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v8}, Lcom/stripe/android/link/model/AccountStatus;->ordinal()I

    move-result v8

    aget v8, v10, v8

    if-eq v8, v6, :cond_d

    if-eq v8, v5, :cond_c

    if-eq v8, v4, :cond_c

    if-eq v8, v3, :cond_8

    const/4 v5, 0x5

    if-ne v8, v5, :cond_7

    goto :goto_2

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 98
    :cond_8
    :goto_2
    iget-object v5, v2, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->linkConfigurationCoordinator:Lcom/stripe/android/link/LinkConfigurationCoordinator;

    iput-object v2, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;->L$1:Ljava/lang/Object;

    iput-object v7, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;->L$2:Ljava/lang/Object;

    iput-object v7, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;->L$3:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;->label:I

    invoke-interface {v5, v9, p2, v0}, Lcom/stripe/android/link/LinkConfigurationCoordinator;->signInWithUserInput-0E7RQCE(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/ui/inline/UserInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_9

    goto :goto_5

    :cond_9
    :goto_3
    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-nez v4, :cond_b

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 101
    iput-object v7, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;->label:I

    invoke-direct {v2, p1, v0}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->createPaymentMethodConfirmationOption(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_a

    goto :goto_5

    :cond_a
    :goto_4
    check-cast p2, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;

    return-object p2

    .line 104
    :cond_b
    invoke-direct {v2, p1}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->toNewOption(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;)Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$New;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;

    return-object p1

    .line 92
    :cond_c
    iget-object p2, v2, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->linkAnalyticsHelper:Lcom/stripe/android/link/analytics/LinkAnalyticsHelper;

    invoke-interface {p2}, Lcom/stripe/android/link/analytics/LinkAnalyticsHelper;->onLinkPopupSkipped()V

    .line 94
    invoke-direct {v2, p1}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->toNewOption(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;)Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$New;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;

    return-object p1

    .line 89
    :cond_d
    iput-object v7, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;->L$1:Ljava/lang/Object;

    iput-object v7, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;->L$2:Ljava/lang/Object;

    iput-object v7, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;->L$3:Ljava/lang/Object;

    iput v5, v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1;->label:I

    invoke-direct {v2, p1, p2, v0}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->createOptionAfterAttachingToLink(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;Lcom/stripe/android/link/ui/inline/UserInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_e

    :goto_5
    return-object v1

    :cond_e
    return-object p1
.end method

.method private final shouldSave(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption$PaymentMethodSaveOption;)Z
    .locals 1

    .line 204
    sget-object v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption$PaymentMethodSaveOption;->RequestedReuse:Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption$PaymentMethodSaveOption;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final toNewOption(Lcom/stripe/android/link/LinkPaymentDetails$New;Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption$PaymentMethodSaveOption;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/model/PaymentMethodExtraParams;)Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$New;
    .locals 9

    .line 178
    invoke-virtual {p3}, Lcom/stripe/android/link/LinkConfiguration;->getPassthroughModeEnabled()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 181
    new-instance v0, Lcom/stripe/android/model/PaymentMethodOptionsParams$Card;

    invoke-virtual {p2}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption$PaymentMethodSaveOption;->getSetupFutureUsage()Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    move-result-object v3

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/model/PaymentMethodOptionsParams$Card;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lcom/stripe/android/model/PaymentMethodOptionsParams;

    goto :goto_0

    .line 183
    :cond_0
    new-instance p3, Lcom/stripe/android/model/PaymentMethodOptionsParams$Link;

    invoke-virtual {p2}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption$PaymentMethodSaveOption;->getSetupFutureUsage()Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    move-result-object v0

    invoke-direct {p3, v0}, Lcom/stripe/android/model/PaymentMethodOptionsParams$Link;-><init>(Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)V

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/model/PaymentMethodOptionsParams;

    :goto_0
    move-object v3, v0

    .line 186
    new-instance v1, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$New;

    .line 187
    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentDetails$New;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v2

    .line 190
    invoke-direct {p0, p2}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->shouldSave(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption$PaymentMethodSaveOption;)Z

    move-result v5

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v4, p4

    .line 186
    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$New;-><init>(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;ZLcom/stripe/android/model/PassiveCaptchaParams;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private final toNewOption(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;)Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$New;
    .locals 8

    .line 195
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$New;

    .line 196
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;->getCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v1

    .line 197
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;->getOptionsParams()Lcom/stripe/android/model/PaymentMethodOptionsParams;

    move-result-object v2

    .line 198
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;->getExtraParams()Lcom/stripe/android/model/PaymentMethodExtraParams;

    move-result-object v3

    .line 199
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;->getSaveOption()Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption$PaymentMethodSaveOption;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->shouldSave(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption$PaymentMethodSaveOption;)Z

    move-result v4

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    .line 195
    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$New;-><init>(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;ZLcom/stripe/android/model/PassiveCaptchaParams;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final toSavedOption(Lcom/stripe/android/link/LinkPaymentDetails$Saved;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption$PaymentMethodSaveOption;)Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$Saved;
    .locals 16

    .line 150
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/link/LinkPaymentDetails$Saved;->getPaymentDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$Passthrough;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Passthrough;->getLast4()Ljava/lang/String;

    move-result-object v9

    .line 153
    new-instance v0, Lcom/stripe/android/model/PaymentMethod$Builder;

    invoke-direct {v0}, Lcom/stripe/android/model/PaymentMethod$Builder;-><init>()V

    .line 154
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/link/LinkPaymentDetails$Saved;->getPaymentDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$Passthrough;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$Passthrough;->getPaymentMethodId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/model/PaymentMethod$Builder;->setId(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$Builder;

    move-result-object v0

    .line 155
    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/model/PaymentMethodCreateParams;->getTypeCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/model/PaymentMethod$Builder;->setCode(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$Builder;

    move-result-object v0

    .line 157
    new-instance v1, Lcom/stripe/android/model/PaymentMethod$Card;

    .line 159
    new-instance v2, Lcom/stripe/android/model/wallets/Wallet$LinkWallet;

    invoke-direct {v2, v9}, Lcom/stripe/android/model/wallets/Wallet$LinkWallet;-><init>(Ljava/lang/String;)V

    move-object v11, v2

    check-cast v11, Lcom/stripe/android/model/wallets/Wallet;

    const/16 v14, 0xd7f

    const/4 v15, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 157
    invoke-direct/range {v1 .. v15}, Lcom/stripe/android/model/PaymentMethod$Card;-><init>(Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/model/PaymentMethod$Card$Checks;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;Lcom/stripe/android/model/wallets/Wallet;Lcom/stripe/android/model/PaymentMethod$Card$Networks;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 156
    invoke-virtual {v0, v1}, Lcom/stripe/android/model/PaymentMethod$Builder;->setCard(Lcom/stripe/android/model/PaymentMethod$Card;)Lcom/stripe/android/model/PaymentMethod$Builder;

    move-result-object v0

    .line 162
    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {v0, v1}, Lcom/stripe/android/model/PaymentMethod$Builder;->setType(Lcom/stripe/android/model/PaymentMethod$Type;)Lcom/stripe/android/model/PaymentMethod$Builder;

    move-result-object v0

    .line 163
    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentMethod$Builder;->build()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v0

    .line 165
    sget-object v1, Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;->OffSession:Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    move-object/from16 v2, p0

    move-object/from16 v3, p3

    .line 166
    invoke-direct {v2, v3}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->shouldSave(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption$PaymentMethodSaveOption;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    .line 167
    sget-object v1, Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;->Blank:Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    :cond_1
    move-object v6, v1

    .line 164
    new-instance v3, Lcom/stripe/android/model/PaymentMethodOptionsParams$Card;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x3

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/model/PaymentMethodOptionsParams$Card;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v3, Lcom/stripe/android/model/PaymentMethodOptionsParams;

    .line 152
    new-instance v1, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$Saved;

    const/4 v4, 0x1

    invoke-direct {v1, v0, v3, v4}, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$Saved;-><init>(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Z)V

    return-object v1
.end method


# virtual methods
.method public bridge synthetic action(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 25
    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->action(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public action(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action<",
            "Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$LauncherArguments;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p3, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$action$1;

    if-eqz p2, :cond_0

    move-object p2, p3

    check-cast p2, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$action$1;

    iget v0, p2, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$action$1;->label:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    iget p3, p2, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$action$1;->label:I

    sub-int/2addr p3, v1

    iput p3, p2, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$action$1;->label:I

    goto :goto_0

    :cond_0
    new-instance p2, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$action$1;

    invoke-direct {p2, p0, p3}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$action$1;-><init>(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, p2, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$action$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 41
    iget v1, p2, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$action$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 45
    iput v2, p2, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$action$1;->label:I

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->createPaymentMethodConfirmationOption(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_3

    return-object v0

    .line 41
    :cond_3
    :goto_1
    check-cast p3, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;

    .line 47
    new-instance p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;

    .line 48
    new-instance p2, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$LauncherArguments;

    invoke-direct {p2, p3}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$LauncherArguments;-><init>(Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;)V

    const/4 p3, 0x0

    .line 47
    invoke-direct {p1, p2, v2, p3}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;-><init>(Ljava/lang/Object;ZLcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;)V

    return-object p1
.end method

.method public bridge synthetic canConfirm(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)Z
    .locals 0

    .line 25
    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->canConfirm(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)Z

    move-result p1

    return p1
.end method

.method public canConfirm(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)Z
    .locals 0

    .line 25
    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$DefaultImpls;->canConfirm(Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)Z

    move-result p1

    return p1
.end method

.method public createLauncher(Landroidx/activity/result/ActivityResultCaller;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Launcher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/activity/result/ActivityResultCaller;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Result;",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Launcher;"
        }
    .end annotation

    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onResult"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    new-instance p1, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Launcher;

    invoke-direct {p1, p2}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Launcher;-><init>(Lkotlin/jvm/functions/Function1;)V

    return-object p1
.end method

.method public bridge synthetic createLauncher(Landroidx/activity/result/ActivityResultCaller;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->createLauncher(Landroidx/activity/result/ActivityResultCaller;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Launcher;

    move-result-object p1

    return-object p1
.end method

.method public getKey()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->key:Ljava/lang/String;

    return-object v0
.end method

.method public launch(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Launcher;Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$LauncherArguments;Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)V
    .locals 1

    const-string v0, "launcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationOption"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "confirmationParameters"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Launcher;->getOnResult()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    new-instance p3, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Result;

    invoke-virtual {p2}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$LauncherArguments;->getNextConfirmationOption()Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;

    move-result-object p2

    invoke-direct {p3, p2}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Result;-><init>(Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;)V

    invoke-interface {p1, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic launch(Ljava/lang/Object;Ljava/lang/Object;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)V
    .locals 0

    .line 25
    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Launcher;

    check-cast p2, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$LauncherArguments;

    check-cast p3, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->launch(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Launcher;Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$LauncherArguments;Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)V

    return-void
.end method

.method public bridge synthetic option(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->option(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;)Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    return-object p1
.end method

.method public option(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;)Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;
    .locals 1

    const-string v0, "confirmationOption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    instance-of v0, p1, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic toResult(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;Landroid/os/Parcelable;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;
    .locals 0

    .line 25
    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;

    check-cast p4, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Result;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->toResult(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Result;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;

    move-result-object p1

    return-object p1
.end method

.method public toResult(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Result;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;
    .locals 0

    const-string p3, "confirmationOption"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "confirmationParameters"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "result"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    new-instance p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$NextStep;

    .line 77
    invoke-virtual {p4}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Result;->getNextConfirmationOption()Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;

    move-result-object p3

    check-cast p3, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    .line 76
    invoke-direct {p1, p3, p2}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$NextStep;-><init>(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)V

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;

    return-object p1
.end method

.method public unregister(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Launcher;)V
    .locals 0

    .line 25
    invoke-static {p0, p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$DefaultImpls;->unregister(Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic unregister(Ljava/lang/Object;)V
    .locals 0

    .line 25
    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Launcher;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;->unregister(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Launcher;)V

    return-void
.end method
