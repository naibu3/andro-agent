.class public final synthetic Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;

.field public final synthetic f$1:Lcom/stripe/android/core/networking/StripeRequest;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;Lcom/stripe/android/core/networking/StripeRequest;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;

    iput-object p2, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/core/networking/StripeRequest;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;

    iget-object v1, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/core/networking/StripeRequest;

    invoke-static {v0, v1}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;->$r8$lambda$b-WZ-dcbvPC_-S4iskaZteg1AF4(Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;Lcom/stripe/android/core/networking/StripeRequest;)Lcom/stripe/android/core/networking/StripeResponse;

    move-result-object v0

    return-object v0
.end method
