.class public final Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;
.super Ljava/lang/Object;
.source "DefaultLinkInlineInteractor.kt"

# interfaces
.implements Lcom/stripe/android/link/verification/LinkInlineInteractor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$Companion;
    }
.end annotation

.annotation runtime Ljavax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u0000 12\u00020\u0001:\u00011B3\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dJ!\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 2\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020#0\"\u00a2\u0006\u0002\u0010$J\u0014\u0010%\u001a\u00020 *\u00020#2\u0006\u0010&\u001a\u00020\'H\u0002J\u001c\u0010(\u001a\u00020\u00182\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140*H\u0002J\u001c\u0010+\u001a\u00020\u00182\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020,0*H\u0002J\u000c\u0010\u001c\u001a\u00020\u001d*\u00020 H\u0002J\u0006\u0010-\u001a\u00020\u0018J\u0008\u0010.\u001a\u00020\u0018H\u0016J\u0008\u0010/\u001a\u00020\u0018H\u0016J\u0008\u00100\u001a\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u00062"
    }
    d2 = {
        "Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;",
        "Lcom/stripe/android/link/verification/LinkInlineInteractor;",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "linkConfigurationCoordinator",
        "Lcom/stripe/android/link/LinkConfigurationCoordinator;",
        "linkLauncher",
        "Lcom/stripe/android/link/LinkPaymentLauncher;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "<init>",
        "(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/link/LinkConfigurationCoordinator;Lcom/stripe/android/link/LinkPaymentLauncher;Lcom/stripe/android/core/Logger;Landroidx/lifecycle/SavedStateHandle;)V",
        "otpElement",
        "Lcom/stripe/android/uicore/elements/OTPElement;",
        "getOtpElement",
        "()Lcom/stripe/android/uicore/elements/OTPElement;",
        "state",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/link/verification/LinkInlineState;",
        "getState",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "setup",
        "",
        "paymentMethodMetadata",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
        "observeOtp",
        "linkAccountManager",
        "Lcom/stripe/android/link/account/LinkAccountManager;",
        "onConfirmationResult",
        "verificationState",
        "Lcom/stripe/android/link/verification/VerificationState$Render2FA;",
        "result",
        "Lkotlin/Result;",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "(Lcom/stripe/android/link/verification/VerificationState$Render2FA;Ljava/lang/Object;)V",
        "initial2FAState",
        "linkConfiguration",
        "Lcom/stripe/android/link/LinkConfiguration;",
        "updateState",
        "block",
        "Lkotlin/Function1;",
        "update2FAState",
        "Lcom/stripe/android/link/ui/verification/VerificationViewState;",
        "onLinkResult",
        "resendCode",
        "didShowCodeSentNotification",
        "startVerification",
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

.field public static final Companion:Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$Companion;

.field private static final LINK_EMBEDDED_STATE_KEY:Ljava/lang/String; = "LINK_EMBEDDED_STATE_KEY"


# instance fields
.field private final coroutineScope:Lkotlinx/coroutines/CoroutineScope;

.field private final linkConfigurationCoordinator:Lcom/stripe/android/link/LinkConfigurationCoordinator;

.field private final linkLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

.field private final savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

.field private final state:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/link/verification/LinkInlineState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$0qmqO9HHA5clqmii-eK8pI_1uNc(Lcom/stripe/android/link/ui/verification/VerificationViewState;)Lcom/stripe/android/link/ui/verification/VerificationViewState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->resendCode$lambda$10(Lcom/stripe/android/link/ui/verification/VerificationViewState;)Lcom/stripe/android/link/ui/verification/VerificationViewState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$3qAN3WZz11yQfylA6smKZM_xwIw(Lcom/stripe/android/link/verification/LinkInlineState;)Lcom/stripe/android/link/verification/LinkInlineState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->update2FAState$lambda$8(Lcom/stripe/android/link/verification/LinkInlineState;)Lcom/stripe/android/link/verification/LinkInlineState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$GB1tXtx86RueKFT5tQ132CxuXOY(Lcom/stripe/android/link/ui/verification/VerificationViewState;)Lcom/stripe/android/link/ui/verification/VerificationViewState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->didShowCodeSentNotification$lambda$11(Lcom/stripe/android/link/ui/verification/VerificationViewState;)Lcom/stripe/android/link/ui/verification/VerificationViewState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$LHCUmUkvEsH2WYj2ve7qtrEKe7k(Lcom/stripe/android/link/verification/LinkInlineState;)Lcom/stripe/android/link/verification/LinkInlineState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->setup$lambda$2(Lcom/stripe/android/link/verification/LinkInlineState;)Lcom/stripe/android/link/verification/LinkInlineState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$U87yBeAILTZqgJWui7juTYJM1g4(Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/verification/LinkInlineState;)Lcom/stripe/android/link/verification/LinkInlineState;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->setup$lambda$3(Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/verification/LinkInlineState;)Lcom/stripe/android/link/verification/LinkInlineState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$XY-WTCPCMX2xpZ4eRV7b6S94xp4(Lcom/stripe/android/link/verification/LinkInlineState;)Lcom/stripe/android/link/verification/LinkInlineState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->onLinkResult$lambda$9(Lcom/stripe/android/link/verification/LinkInlineState;)Lcom/stripe/android/link/verification/LinkInlineState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$_7fQ30Clb7utKRzOQ7jsa2aQiLw(Lcom/stripe/android/link/verification/LinkInlineState;)Lcom/stripe/android/link/verification/LinkInlineState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->setup$lambda$1(Lcom/stripe/android/link/verification/LinkInlineState;)Lcom/stripe/android/link/verification/LinkInlineState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$eg4jusoyoEANSUILpjwRKco0vBg(Ljava/lang/Throwable;Lcom/stripe/android/link/ui/verification/VerificationViewState;)Lcom/stripe/android/link/ui/verification/VerificationViewState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->onConfirmationResult$lambda$6$lambda$5(Ljava/lang/Throwable;Lcom/stripe/android/link/ui/verification/VerificationViewState;)Lcom/stripe/android/link/ui/verification/VerificationViewState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$eqekvaQUsNF-a7f0dsqS3Cs0B4w(Lcom/stripe/android/link/ui/verification/VerificationViewState;)Lcom/stripe/android/link/ui/verification/VerificationViewState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->startVerification$lambda$12(Lcom/stripe/android/link/ui/verification/VerificationViewState;)Lcom/stripe/android/link/ui/verification/VerificationViewState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$fDH_Difb0KzhQPpdMJvvQGwyxhE(Lcom/stripe/android/link/verification/LinkInlineState;)Lcom/stripe/android/link/verification/LinkInlineState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->setup$lambda$0(Lcom/stripe/android/link/verification/LinkInlineState;)Lcom/stripe/android/link/verification/LinkInlineState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$iHWFZUlfCzLBVlNNLotqe0v8mgg(Lcom/stripe/android/link/verification/VerificationState$Render2FA;Lcom/stripe/android/link/verification/LinkInlineState;)Lcom/stripe/android/link/verification/LinkInlineState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->update2FAState$lambda$7(Lcom/stripe/android/link/verification/VerificationState$Render2FA;Lcom/stripe/android/link/verification/LinkInlineState;)Lcom/stripe/android/link/verification/LinkInlineState;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->Companion:Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->$stable:I

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/link/LinkConfigurationCoordinator;Lcom/stripe/android/link/LinkPaymentLauncher;Lcom/stripe/android/core/Logger;Landroidx/lifecycle/SavedStateHandle;)V
    .locals 1
    .param p3    # Lcom/stripe/android/link/LinkPaymentLauncher;
        .annotation runtime Ljavax/inject/Named;
            value = "LinkPaymentLauncher_WalletsButton"
        .end annotation
    .end param
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkConfigurationCoordinator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkLauncher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    .line 33
    iput-object p2, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->linkConfigurationCoordinator:Lcom/stripe/android/link/LinkConfigurationCoordinator;

    .line 34
    iput-object p3, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->linkLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

    .line 35
    iput-object p4, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->logger:Lcom/stripe/android/core/Logger;

    .line 36
    iput-object p5, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    .line 39
    sget-object p1, Lcom/stripe/android/ui/core/elements/OTPSpec;->INSTANCE:Lcom/stripe/android/ui/core/elements/OTPSpec;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/OTPSpec;->transform()Lcom/stripe/android/uicore/elements/OTPElement;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

    .line 43
    new-instance p1, Lcom/stripe/android/link/verification/LinkInlineState;

    .line 44
    sget-object p2, Lcom/stripe/android/link/verification/VerificationState$Loading;->INSTANCE:Lcom/stripe/android/link/verification/VerificationState$Loading;

    check-cast p2, Lcom/stripe/android/link/verification/VerificationState;

    .line 43
    invoke-direct {p1, p2}, Lcom/stripe/android/link/verification/LinkInlineState;-><init>(Lcom/stripe/android/link/verification/VerificationState;)V

    .line 41
    const-string p2, "LINK_EMBEDDED_STATE_KEY"

    invoke-virtual {p5, p2, p1}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->state:Lkotlinx/coroutines/flow/StateFlow;

    return-void
.end method

.method public static final synthetic access$linkAccountManager(Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;Lcom/stripe/android/link/verification/VerificationState$Render2FA;)Lcom/stripe/android/link/account/LinkAccountManager;
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->linkAccountManager(Lcom/stripe/android/link/verification/VerificationState$Render2FA;)Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$update2FAState(Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->update2FAState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final didShowCodeSentNotification$lambda$11(Lcom/stripe/android/link/ui/verification/VerificationViewState;)Lcom/stripe/android/link/ui/verification/VerificationViewState;
    .locals 14

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v12, 0x3ef

    const/4 v13, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v1, p0

    .line 186
    invoke-static/range {v1 .. v13}, Lcom/stripe/android/link/ui/verification/VerificationViewState;->copy$default(Lcom/stripe/android/link/ui/verification/VerificationViewState;ZZLcom/stripe/android/core/strings/ResolvableString;ZZLjava/lang/String;Ljava/lang/String;ZZLcom/stripe/android/link/ui/wallet/DefaultPaymentUI;ILjava/lang/Object;)Lcom/stripe/android/link/ui/verification/VerificationViewState;

    move-result-object p0

    return-object p0
.end method

.method private final initial2FAState(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/verification/VerificationState$Render2FA;
    .locals 11

    .line 128
    invoke-virtual {p1}, Lcom/stripe/android/link/model/LinkAccount;->getEmail()Ljava/lang/String;

    move-result-object v7

    .line 129
    invoke-virtual {p1}, Lcom/stripe/android/link/model/LinkAccount;->getRedactedPhoneNumber()Ljava/lang/String;

    move-result-object v6

    .line 136
    invoke-virtual {p1}, Lcom/stripe/android/link/model/LinkAccount;->getDisplayablePaymentDetails()Lcom/stripe/android/model/DisplayablePaymentDetails;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 137
    invoke-virtual {p2}, Lcom/stripe/android/link/LinkConfiguration;->getEnableDisplayableDefaultValuesInEce()Z

    move-result v0

    .line 136
    invoke-static {p1, v0}, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUIKt;->toDefaultPaymentUI(Lcom/stripe/android/model/DisplayablePaymentDetails;Z)Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    move-object v10, p1

    .line 127
    new-instance v0, Lcom/stripe/android/link/ui/verification/VerificationViewState;

    const/4 v8, 0x1

    const/4 v9, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v10}, Lcom/stripe/android/link/ui/verification/VerificationViewState;-><init>(ZZLcom/stripe/android/core/strings/ResolvableString;ZZLjava/lang/String;Ljava/lang/String;ZZLcom/stripe/android/link/ui/wallet/DefaultPaymentUI;)V

    .line 125
    new-instance p1, Lcom/stripe/android/link/verification/VerificationState$Render2FA;

    invoke-direct {p1, v0, p2}, Lcom/stripe/android/link/verification/VerificationState$Render2FA;-><init>(Lcom/stripe/android/link/ui/verification/VerificationViewState;Lcom/stripe/android/link/LinkConfiguration;)V

    return-object p1
.end method

.method private final linkAccountManager(Lcom/stripe/android/link/verification/VerificationState$Render2FA;)Lcom/stripe/android/link/account/LinkAccountManager;
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->linkConfigurationCoordinator:Lcom/stripe/android/link/LinkConfigurationCoordinator;

    invoke-virtual {p1}, Lcom/stripe/android/link/verification/VerificationState$Render2FA;->getLinkConfiguration()Lcom/stripe/android/link/LinkConfiguration;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/stripe/android/link/LinkConfigurationCoordinator;->getComponent(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/injection/LinkComponent;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/link/injection/LinkComponent;->getLinkAccountManager$paymentsheet_release()Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object p1

    return-object p1
.end method

.method private static final onConfirmationResult$lambda$6$lambda$5(Ljava/lang/Throwable;Lcom/stripe/android/link/ui/verification/VerificationViewState;)Lcom/stripe/android/link/ui/verification/VerificationViewState;
    .locals 14

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    invoke-static {p0}, Lcom/stripe/android/link/utils/ErrorsKt;->getErrorMessage(Ljava/lang/Throwable;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v4

    const/16 v12, 0x3fa

    const/4 v13, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v1, p1

    .line 115
    invoke-static/range {v1 .. v13}, Lcom/stripe/android/link/ui/verification/VerificationViewState;->copy$default(Lcom/stripe/android/link/ui/verification/VerificationViewState;ZZLcom/stripe/android/core/strings/ResolvableString;ZZLjava/lang/String;Ljava/lang/String;ZZLcom/stripe/android/link/ui/wallet/DefaultPaymentUI;ILjava/lang/Object;)Lcom/stripe/android/link/ui/verification/VerificationViewState;

    move-result-object p0

    return-object p0
.end method

.method private static final onLinkResult$lambda$9(Lcom/stripe/android/link/verification/LinkInlineState;)Lcom/stripe/android/link/verification/LinkInlineState;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    sget-object v0, Lcom/stripe/android/link/verification/VerificationState$RenderButton;->INSTANCE:Lcom/stripe/android/link/verification/VerificationState$RenderButton;

    check-cast v0, Lcom/stripe/android/link/verification/VerificationState;

    invoke-virtual {p0, v0}, Lcom/stripe/android/link/verification/LinkInlineState;->copy(Lcom/stripe/android/link/verification/VerificationState;)Lcom/stripe/android/link/verification/LinkInlineState;

    move-result-object p0

    return-object p0
.end method

.method private static final resendCode$lambda$10(Lcom/stripe/android/link/ui/verification/VerificationViewState;)Lcom/stripe/android/link/ui/verification/VerificationViewState;
    .locals 14

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v12, 0x3f3

    const/4 v13, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v1, p0

    .line 176
    invoke-static/range {v1 .. v13}, Lcom/stripe/android/link/ui/verification/VerificationViewState;->copy$default(Lcom/stripe/android/link/ui/verification/VerificationViewState;ZZLcom/stripe/android/core/strings/ResolvableString;ZZLjava/lang/String;Ljava/lang/String;ZZLcom/stripe/android/link/ui/wallet/DefaultPaymentUI;ILjava/lang/Object;)Lcom/stripe/android/link/ui/verification/VerificationViewState;

    move-result-object p0

    return-object p0
.end method

.method private static final setup$lambda$0(Lcom/stripe/android/link/verification/LinkInlineState;)Lcom/stripe/android/link/verification/LinkInlineState;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    sget-object v0, Lcom/stripe/android/link/verification/VerificationState$RenderButton;->INSTANCE:Lcom/stripe/android/link/verification/VerificationState$RenderButton;

    check-cast v0, Lcom/stripe/android/link/verification/VerificationState;

    invoke-virtual {p0, v0}, Lcom/stripe/android/link/verification/LinkInlineState;->copy(Lcom/stripe/android/link/verification/VerificationState;)Lcom/stripe/android/link/verification/LinkInlineState;

    move-result-object p0

    return-object p0
.end method

.method private static final setup$lambda$1(Lcom/stripe/android/link/verification/LinkInlineState;)Lcom/stripe/android/link/verification/LinkInlineState;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    sget-object v0, Lcom/stripe/android/link/verification/VerificationState$RenderButton;->INSTANCE:Lcom/stripe/android/link/verification/VerificationState$RenderButton;

    check-cast v0, Lcom/stripe/android/link/verification/VerificationState;

    invoke-virtual {p0, v0}, Lcom/stripe/android/link/verification/LinkInlineState;->copy(Lcom/stripe/android/link/verification/VerificationState;)Lcom/stripe/android/link/verification/LinkInlineState;

    move-result-object p0

    return-object p0
.end method

.method private static final setup$lambda$2(Lcom/stripe/android/link/verification/LinkInlineState;)Lcom/stripe/android/link/verification/LinkInlineState;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    sget-object v0, Lcom/stripe/android/link/verification/VerificationState$RenderButton;->INSTANCE:Lcom/stripe/android/link/verification/VerificationState$RenderButton;

    check-cast v0, Lcom/stripe/android/link/verification/VerificationState;

    invoke-virtual {p0, v0}, Lcom/stripe/android/link/verification/LinkInlineState;->copy(Lcom/stripe/android/link/verification/VerificationState;)Lcom/stripe/android/link/verification/LinkInlineState;

    move-result-object p0

    return-object p0
.end method

.method private static final setup$lambda$3(Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/verification/LinkInlineState;)Lcom/stripe/android/link/verification/LinkInlineState;
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->initial2FAState(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/verification/VerificationState$Render2FA;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/link/verification/VerificationState;

    invoke-virtual {p3, p0}, Lcom/stripe/android/link/verification/LinkInlineState;->copy(Lcom/stripe/android/link/verification/VerificationState;)Lcom/stripe/android/link/verification/LinkInlineState;

    move-result-object p0

    return-object p0
.end method

.method private final startVerification()V
    .locals 7

    .line 191
    new-instance v0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda2;

    invoke-direct {v0}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda2;-><init>()V

    invoke-direct {p0, v0}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->update2FAState(Lkotlin/jvm/functions/Function1;)V

    .line 195
    iget-object v1, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$startVerification$2;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$startVerification$2;-><init>(Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private static final startVerification$lambda$12(Lcom/stripe/android/link/ui/verification/VerificationViewState;)Lcom/stripe/android/link/ui/verification/VerificationViewState;
    .locals 14

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v12, 0x3fb

    const/4 v13, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v1, p0

    .line 192
    invoke-static/range {v1 .. v13}, Lcom/stripe/android/link/ui/verification/VerificationViewState;->copy$default(Lcom/stripe/android/link/ui/verification/VerificationViewState;ZZLcom/stripe/android/core/strings/ResolvableString;ZZLjava/lang/String;Ljava/lang/String;ZZLcom/stripe/android/link/ui/wallet/DefaultPaymentUI;ILjava/lang/Object;)Lcom/stripe/android/link/ui/verification/VerificationViewState;

    move-result-object p0

    return-object p0
.end method

.method private final update2FAState(Lkotlin/jvm/functions/Function1;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/ui/verification/VerificationViewState;",
            "Lcom/stripe/android/link/ui/verification/VerificationViewState;",
            ">;)V"
        }
    .end annotation

    .line 151
    invoke-virtual {p0}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->getState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/verification/LinkInlineState;

    invoke-virtual {v0}, Lcom/stripe/android/link/verification/LinkInlineState;->getVerificationState()Lcom/stripe/android/link/verification/VerificationState;

    move-result-object v0

    .line 152
    instance-of v1, v0, Lcom/stripe/android/link/verification/VerificationState$Render2FA;

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    .line 153
    check-cast v0, Lcom/stripe/android/link/verification/VerificationState$Render2FA;

    invoke-virtual {v0}, Lcom/stripe/android/link/verification/VerificationState$Render2FA;->getViewState()Lcom/stripe/android/link/ui/verification/VerificationViewState;

    move-result-object v1

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/ui/verification/VerificationViewState;

    invoke-static {v0, p1, v3, v2, v3}, Lcom/stripe/android/link/verification/VerificationState$Render2FA;->copy$default(Lcom/stripe/android/link/verification/VerificationState$Render2FA;Lcom/stripe/android/link/ui/verification/VerificationViewState;Lcom/stripe/android/link/LinkConfiguration;ILjava/lang/Object;)Lcom/stripe/android/link/verification/VerificationState$Render2FA;

    move-result-object p1

    .line 154
    new-instance v0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda6;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda6;-><init>(Lcom/stripe/android/link/verification/VerificationState$Render2FA;)V

    invoke-direct {p0, v0}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->updateState(Lkotlin/jvm/functions/Function1;)V

    return-void

    .line 156
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->logger:Lcom/stripe/android/core/Logger;

    .line 157
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "Expected Render2FA state but found "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ". Resetting to RenderButton."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 156
    invoke-static {p1, v0, v3, v2, v3}, Lcom/stripe/android/core/Logger$DefaultImpls;->error$default(Lcom/stripe/android/core/Logger;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 159
    new-instance p1, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda7;

    invoke-direct {p1}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda7;-><init>()V

    invoke-direct {p0, p1}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->updateState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final update2FAState$lambda$7(Lcom/stripe/android/link/verification/VerificationState$Render2FA;Lcom/stripe/android/link/verification/LinkInlineState;)Lcom/stripe/android/link/verification/LinkInlineState;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    check-cast p0, Lcom/stripe/android/link/verification/VerificationState;

    invoke-virtual {p1, p0}, Lcom/stripe/android/link/verification/LinkInlineState;->copy(Lcom/stripe/android/link/verification/VerificationState;)Lcom/stripe/android/link/verification/LinkInlineState;

    move-result-object p0

    return-object p0
.end method

.method private static final update2FAState$lambda$8(Lcom/stripe/android/link/verification/LinkInlineState;)Lcom/stripe/android/link/verification/LinkInlineState;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    sget-object v0, Lcom/stripe/android/link/verification/VerificationState$RenderButton;->INSTANCE:Lcom/stripe/android/link/verification/VerificationState$RenderButton;

    check-cast v0, Lcom/stripe/android/link/verification/VerificationState;

    invoke-virtual {p0, v0}, Lcom/stripe/android/link/verification/LinkInlineState;->copy(Lcom/stripe/android/link/verification/VerificationState;)Lcom/stripe/android/link/verification/LinkInlineState;

    move-result-object p0

    return-object p0
.end method

.method private final updateState(Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/verification/LinkInlineState;",
            "Lcom/stripe/android/link/verification/LinkInlineState;",
            ">;)V"
        }
    .end annotation

    .line 144
    invoke-virtual {p0}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->getState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/verification/LinkInlineState;

    .line 145
    iget-object v1, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v2, "LINK_EMBEDDED_STATE_KEY"

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public didShowCodeSentNotification()V
    .locals 1

    .line 185
    new-instance v0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda4;

    invoke-direct {v0}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda4;-><init>()V

    invoke-direct {p0, v0}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->update2FAState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public getOtpElement()Lcom/stripe/android/uicore/elements/OTPElement;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

    return-object v0
.end method

.method public getState()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/link/verification/LinkInlineState;",
            ">;"
        }
    .end annotation

    .line 41
    iget-object v0, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->state:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final observeOtp(Lcom/stripe/android/link/account/LinkAccountManager;)V
    .locals 7

    const-string v0, "linkAccountManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    iget-object v1, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1;-><init>(Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;Lcom/stripe/android/link/account/LinkAccountManager;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final onConfirmationResult(Lcom/stripe/android/link/verification/VerificationState$Render2FA;Ljava/lang/Object;)V
    .locals 8

    const-string v0, "verificationState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    invoke-static {p2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/model/LinkAccount;

    .line 105
    invoke-direct {p0, p1}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->linkAccountManager(Lcom/stripe/android/link/verification/VerificationState$Render2FA;)Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object v0

    .line 106
    iget-object v1, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->linkLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

    .line 107
    invoke-virtual {p1}, Lcom/stripe/android/link/verification/VerificationState$Render2FA;->getLinkConfiguration()Lcom/stripe/android/link/LinkConfiguration;

    move-result-object p1

    .line 108
    invoke-interface {v0}, Lcom/stripe/android/link/account/LinkAccountManager;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    .line 109
    new-instance v2, Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;-><init>(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Lcom/stripe/android/link/LinkLaunchMode;

    .line 110
    sget-object v3, Lcom/stripe/android/link/LinkExpressMode;->ENABLED:Lcom/stripe/android/link/LinkExpressMode;

    .line 106
    invoke-virtual {v1, p1, v0, v2, v3}, Lcom/stripe/android/link/LinkPaymentLauncher;->present(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/LinkAccountUpdate$Value;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/link/LinkExpressMode;)V

    .line 113
    :cond_0
    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 114
    new-instance p2, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda3;

    invoke-direct {p2, p1}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda3;-><init>(Ljava/lang/Throwable;)V

    invoke-direct {p0, p2}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->update2FAState(Lkotlin/jvm/functions/Function1;)V

    :cond_1
    return-void
.end method

.method public final onLinkResult()V
    .locals 1

    .line 170
    new-instance v0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda0;-><init>()V

    invoke-direct {p0, v0}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->updateState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public resendCode()V
    .locals 1

    .line 174
    invoke-virtual {p0}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->getOtpElement()Lcom/stripe/android/uicore/elements/OTPElement;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/OTPElement;->getController()Lcom/stripe/android/uicore/elements/OTPController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/OTPController;->reset()V

    .line 175
    new-instance v0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda5;

    invoke-direct {v0}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda5;-><init>()V

    invoke-direct {p0, v0}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->update2FAState(Lkotlin/jvm/functions/Function1;)V

    .line 181
    invoke-direct {p0}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->startVerification()V

    return-void
.end method

.method public setup(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)V
    .locals 4

    const-string v0, "paymentMethodMetadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-virtual {p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getLinkState()Lcom/stripe/android/paymentsheet/state/LinkState;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/LinkState;->getConfiguration()Lcom/stripe/android/link/LinkConfiguration;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    .line 55
    new-instance p1, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda8;

    invoke-direct {p1}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda8;-><init>()V

    invoke-direct {p0, p1}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->updateState(Lkotlin/jvm/functions/Function1;)V

    return-void

    .line 59
    :cond_1
    iget-object v0, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->linkConfigurationCoordinator:Lcom/stripe/android/link/LinkConfigurationCoordinator;

    invoke-interface {v0, p1}, Lcom/stripe/android/link/LinkConfigurationCoordinator;->linkGate(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/gate/LinkGate;

    move-result-object v0

    invoke-interface {v0}, Lcom/stripe/android/link/gate/LinkGate;->getUseInlineOtpInWalletButtons()Z

    move-result v0

    if-nez v0, :cond_2

    .line 61
    new-instance p1, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda9;

    invoke-direct {p1}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda9;-><init>()V

    invoke-direct {p0, p1}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->updateState(Lkotlin/jvm/functions/Function1;)V

    return-void

    .line 65
    :cond_2
    iget-object v0, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->linkConfigurationCoordinator:Lcom/stripe/android/link/LinkConfigurationCoordinator;

    .line 66
    invoke-interface {v0, p1}, Lcom/stripe/android/link/LinkConfigurationCoordinator;->getComponent(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/injection/LinkComponent;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/link/injection/LinkComponent;->getLinkAccountManager$paymentsheet_release()Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object v0

    .line 67
    invoke-interface {v0}, Lcom/stripe/android/link/account/LinkAccountManager;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkAccountUpdate$Value;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 68
    invoke-virtual {v1}, Lcom/stripe/android/link/model/LinkAccount;->getAccountStatus()Lcom/stripe/android/link/model/AccountStatus;

    move-result-object v2

    sget-object v3, Lcom/stripe/android/link/model/AccountStatus;->NeedsVerification:Lcom/stripe/android/link/model/AccountStatus;

    if-eq v2, v3, :cond_3

    goto :goto_1

    .line 73
    :cond_3
    new-instance v2, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda1;

    invoke-direct {v2, p0, v1, p1}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkConfiguration;)V

    invoke-direct {p0, v2}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->updateState(Lkotlin/jvm/functions/Function1;)V

    .line 74
    invoke-virtual {p0, v0}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->observeOtp(Lcom/stripe/android/link/account/LinkAccountManager;)V

    .line 75
    invoke-direct {p0}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->startVerification()V

    return-void

    .line 70
    :cond_4
    :goto_1
    new-instance p1, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda10;

    invoke-direct {p1}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda10;-><init>()V

    invoke-direct {p0, p1}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->updateState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
