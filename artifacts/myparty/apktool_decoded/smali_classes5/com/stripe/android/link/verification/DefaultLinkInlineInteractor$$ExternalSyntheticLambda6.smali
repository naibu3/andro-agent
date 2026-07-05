.class public final synthetic Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda6;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/link/verification/VerificationState$Render2FA;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/link/verification/VerificationState$Render2FA;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda6;->f$0:Lcom/stripe/android/link/verification/VerificationState$Render2FA;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda6;->f$0:Lcom/stripe/android/link/verification/VerificationState$Render2FA;

    check-cast p1, Lcom/stripe/android/link/verification/LinkInlineState;

    invoke-static {v0, p1}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->$r8$lambda$iHWFZUlfCzLBVlNNLotqe0v8mgg(Lcom/stripe/android/link/verification/VerificationState$Render2FA;Lcom/stripe/android/link/verification/LinkInlineState;)Lcom/stripe/android/link/verification/LinkInlineState;

    move-result-object p1

    return-object p1
.end method
