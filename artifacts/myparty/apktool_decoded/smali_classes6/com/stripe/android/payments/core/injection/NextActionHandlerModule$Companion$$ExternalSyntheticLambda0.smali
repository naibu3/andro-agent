.class public final synthetic Lcom/stripe/android/payments/core/injection/NextActionHandlerModule$Companion$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Ldagger/Lazy;

.field public final synthetic f$1:Lcom/stripe/android/payments/DefaultReturnUrl;


# direct methods
.method public synthetic constructor <init>(Ldagger/Lazy;Lcom/stripe/android/payments/DefaultReturnUrl;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/NextActionHandlerModule$Companion$$ExternalSyntheticLambda0;->f$0:Ldagger/Lazy;

    iput-object p2, p0, Lcom/stripe/android/payments/core/injection/NextActionHandlerModule$Companion$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/payments/DefaultReturnUrl;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/stripe/android/payments/core/injection/NextActionHandlerModule$Companion$$ExternalSyntheticLambda0;->f$0:Ldagger/Lazy;

    iget-object v1, p0, Lcom/stripe/android/payments/core/injection/NextActionHandlerModule$Companion$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/payments/DefaultReturnUrl;

    check-cast p1, Lcom/stripe/android/view/AuthActivityStarterHost;

    invoke-static {v0, v1, p1}, Lcom/stripe/android/payments/core/injection/NextActionHandlerModule$Companion;->$r8$lambda$5axHYznuu_Ra3ObfZYjECOiafWE(Ldagger/Lazy;Lcom/stripe/android/payments/DefaultReturnUrl;Lcom/stripe/android/view/AuthActivityStarterHost;)Lcom/stripe/android/PaymentBrowserAuthStarter;

    move-result-object p1

    return-object p1
.end method
