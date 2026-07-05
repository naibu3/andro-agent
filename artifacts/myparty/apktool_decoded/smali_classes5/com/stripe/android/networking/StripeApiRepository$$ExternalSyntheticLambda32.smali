.class public final synthetic Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda32;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/model/ConfirmPaymentIntentParams;

.field public final synthetic f$1:Lcom/stripe/android/networking/StripeApiRepository;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/networking/StripeApiRepository;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda32;->f$0:Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    iput-object p2, p0, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda32;->f$1:Lcom/stripe/android/networking/StripeApiRepository;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda32;->f$0:Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    iget-object v1, p0, Lcom/stripe/android/networking/StripeApiRepository$$ExternalSyntheticLambda32;->f$1:Lcom/stripe/android/networking/StripeApiRepository;

    check-cast p1, Lkotlin/Result;

    invoke-static {v0, v1, p1}, Lcom/stripe/android/networking/StripeApiRepository;->$r8$lambda$Cr9W6RvRFFfmmUGwYBdyFr-x4LY(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/networking/StripeApiRepository;Lkotlin/Result;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
