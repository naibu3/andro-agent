.class public final synthetic Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2NextActionHandler$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2NextActionHandler;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2NextActionHandler;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2NextActionHandler$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2NextActionHandler;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2NextActionHandler$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2NextActionHandler;

    check-cast p1, Lcom/stripe/android/view/AuthActivityStarterHost;

    invoke-static {v0, p1}, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2NextActionHandler;->$r8$lambda$Dwt7TnafcPxteBIr0EpEfo9Jckc(Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2NextActionHandler;Lcom/stripe/android/view/AuthActivityStarterHost;)Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionStarter;

    move-result-object p1

    return-object p1
.end method
