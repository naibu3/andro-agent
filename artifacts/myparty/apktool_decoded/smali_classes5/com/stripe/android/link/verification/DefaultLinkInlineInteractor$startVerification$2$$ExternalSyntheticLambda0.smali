.class public final synthetic Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$startVerification$2$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$startVerification$2$$ExternalSyntheticLambda0;->f$0:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$startVerification$2$$ExternalSyntheticLambda0;->f$0:Ljava/lang/Throwable;

    check-cast p1, Lcom/stripe/android/link/ui/verification/VerificationViewState;

    invoke-static {v0, p1}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$startVerification$2;->$r8$lambda$lrbVms-vGGNPxXsaj9OWX8sfG5g(Ljava/lang/Throwable;Lcom/stripe/android/link/ui/verification/VerificationViewState;)Lcom/stripe/android/link/ui/verification/VerificationViewState;

    move-result-object p1

    return-object p1
.end method
