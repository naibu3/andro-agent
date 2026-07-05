.class public final synthetic Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;

.field public final synthetic f$1:Lcom/stripe/android/link/LinkPaymentDetails;

.field public final synthetic f$2:Lcom/stripe/android/link/model/LinkAccount;

.field public final synthetic f$3:Ljava/lang/String;

.field public final synthetic f$4:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;Lcom/stripe/android/link/LinkPaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;

    iput-object p2, p0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/link/LinkPaymentDetails;

    iput-object p3, p0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$$ExternalSyntheticLambda0;->f$2:Lcom/stripe/android/link/model/LinkAccount;

    iput-object p4, p0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$$ExternalSyntheticLambda0;->f$3:Ljava/lang/String;

    iput-object p5, p0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$$ExternalSyntheticLambda0;->f$4:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 0
    iget-object v0, p0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;

    iget-object v1, p0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/link/LinkPaymentDetails;

    iget-object v2, p0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$$ExternalSyntheticLambda0;->f$2:Lcom/stripe/android/link/model/LinkAccount;

    iget-object v3, p0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$$ExternalSyntheticLambda0;->f$3:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$$ExternalSyntheticLambda0;->f$4:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;->$r8$lambda$D0MHiev8HVTI_uzvusr1kbHrbNI(Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;Lcom/stripe/android/link/LinkPaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;

    move-result-object v0

    return-object v0
.end method
