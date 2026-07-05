.class public final synthetic Lcom/stripe/android/link/LinkPaymentLauncher$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/link/LinkPaymentLauncher;

.field public final synthetic f$1:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/link/LinkPaymentLauncher;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/LinkPaymentLauncher$$ExternalSyntheticLambda1;->f$0:Lcom/stripe/android/link/LinkPaymentLauncher;

    iput-object p2, p0, Lcom/stripe/android/link/LinkPaymentLauncher$$ExternalSyntheticLambda1;->f$1:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/stripe/android/link/LinkPaymentLauncher$$ExternalSyntheticLambda1;->f$0:Lcom/stripe/android/link/LinkPaymentLauncher;

    iget-object v1, p0, Lcom/stripe/android/link/LinkPaymentLauncher$$ExternalSyntheticLambda1;->f$1:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lcom/stripe/android/link/LinkActivityResult;

    invoke-static {v0, v1, p1}, Lcom/stripe/android/link/LinkPaymentLauncher;->$r8$lambda$xhKWp918uVeM8x9p-ajP_T7WoqM(Lcom/stripe/android/link/LinkPaymentLauncher;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/LinkActivityResult;)V

    return-void
.end method
