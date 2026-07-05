.class public final Lcom/stripe/android/link/verification/NoOpLinkInlineInteractor;
.super Ljava/lang/Object;
.source "NoOpLinkInlineInteractor.kt"

# interfaces
.implements Lcom/stripe/android/link/verification/LinkInlineInteractor;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0008\u0010\u0011\u001a\u00020\u000eH\u0016J\u0008\u0010\u0012\u001a\u00020\u000eH\u0016R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/link/verification/NoOpLinkInlineInteractor;",
        "Lcom/stripe/android/link/verification/LinkInlineInteractor;",
        "<init>",
        "()V",
        "state",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/link/verification/LinkInlineState;",
        "getState",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "otpElement",
        "Lcom/stripe/android/uicore/elements/OTPElement;",
        "getOtpElement",
        "()Lcom/stripe/android/uicore/elements/OTPElement;",
        "setup",
        "",
        "paymentMethodMetadata",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
        "resendCode",
        "didShowCodeSentNotification",
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
.field private final otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

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
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Lcom/stripe/android/link/verification/LinkInlineState;

    sget-object v1, Lcom/stripe/android/link/verification/VerificationState$RenderButton;->INSTANCE:Lcom/stripe/android/link/verification/VerificationState$RenderButton;

    check-cast v1, Lcom/stripe/android/link/verification/VerificationState;

    invoke-direct {v0, v1}, Lcom/stripe/android/link/verification/LinkInlineState;-><init>(Lcom/stripe/android/link/verification/VerificationState;)V

    .line 14
    invoke-static {v0}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    iput-object v0, p0, Lcom/stripe/android/link/verification/NoOpLinkInlineInteractor;->state:Lkotlinx/coroutines/flow/StateFlow;

    .line 17
    sget-object v0, Lcom/stripe/android/ui/core/elements/OTPSpec;->INSTANCE:Lcom/stripe/android/ui/core/elements/OTPSpec;

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/OTPSpec;->transform()Lcom/stripe/android/uicore/elements/OTPElement;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/link/verification/NoOpLinkInlineInteractor;->otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

    return-void
.end method


# virtual methods
.method public didShowCodeSentNotification()V
    .locals 0

    return-void
.end method

.method public getOtpElement()Lcom/stripe/android/uicore/elements/OTPElement;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/stripe/android/link/verification/NoOpLinkInlineInteractor;->otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

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

    .line 14
    iget-object v0, p0, Lcom/stripe/android/link/verification/NoOpLinkInlineInteractor;->state:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public resendCode()V
    .locals 0

    return-void
.end method

.method public setup(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)V
    .locals 1

    const-string v0, "paymentMethodMetadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
