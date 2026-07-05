.class final Lcom/stripe/android/link/ui/verification/VerificationDialogKt$VerificationDialogBody$1$1$1$1;
.super Ljava/lang/Object;
.source "VerificationDialog.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/verification/VerificationDialogKt$VerificationDialogBody$1$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $didShowCodeSentNotification:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onBack:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onChangeEmailClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onFocusRequested:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onResendCodeClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

.field final synthetic $state:Lcom/stripe/android/link/ui/verification/VerificationViewState;


# direct methods
.method constructor <init>(Lcom/stripe/android/link/ui/verification/VerificationViewState;Lcom/stripe/android/uicore/elements/OTPElement;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/verification/VerificationViewState;",
            "Lcom/stripe/android/uicore/elements/OTPElement;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$VerificationDialogBody$1$1$1$1;->$state:Lcom/stripe/android/link/ui/verification/VerificationViewState;

    iput-object p2, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$VerificationDialogBody$1$1$1$1;->$otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

    iput-object p3, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$VerificationDialogBody$1$1$1$1;->$onBack:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$VerificationDialogBody$1$1$1$1;->$onFocusRequested:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$VerificationDialogBody$1$1$1$1;->$didShowCodeSentNotification:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$VerificationDialogBody$1$1$1$1;->$onChangeEmailClick:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$VerificationDialogBody$1$1$1$1;->$onResendCodeClick:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 98
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$VerificationDialogBody$1$1$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 12

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 99
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 107
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 99
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.link.ui.verification.VerificationDialogBody.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VerificationDialog.kt:98)"

    const v2, 0xb3dbffb

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 100
    :cond_2
    iget-object v3, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$VerificationDialogBody$1$1$1$1;->$state:Lcom/stripe/android/link/ui/verification/VerificationViewState;

    .line 101
    iget-object v4, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$VerificationDialogBody$1$1$1$1;->$otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

    .line 102
    iget-object v5, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$VerificationDialogBody$1$1$1$1;->$onBack:Lkotlin/jvm/functions/Function0;

    .line 105
    iget-object v6, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$VerificationDialogBody$1$1$1$1;->$onFocusRequested:Lkotlin/jvm/functions/Function0;

    .line 106
    iget-object v7, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$VerificationDialogBody$1$1$1$1;->$didShowCodeSentNotification:Lkotlin/jvm/functions/Function0;

    .line 103
    iget-object v8, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$VerificationDialogBody$1$1$1$1;->$onChangeEmailClick:Lkotlin/jvm/functions/Function0;

    .line 104
    iget-object v9, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$VerificationDialogBody$1$1$1$1;->$onResendCodeClick:Lkotlin/jvm/functions/Function0;

    sget p2, Lcom/stripe/android/uicore/elements/OTPElement;->$stable:I

    shl-int/lit8 v11, p2, 0x3

    move-object v10, p1

    .line 99
    invoke-static/range {v3 .. v11}, Lcom/stripe/android/link/ui/verification/VerificationBodyKt;->VerificationBody(Lcom/stripe/android/link/ui/verification/VerificationViewState;Lcom/stripe/android/uicore/elements/OTPElement;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    return-void
.end method
