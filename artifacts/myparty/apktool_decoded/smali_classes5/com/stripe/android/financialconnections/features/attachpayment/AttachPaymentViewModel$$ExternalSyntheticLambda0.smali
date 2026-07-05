.class public final synthetic Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    check-cast p1, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;

    check-cast p2, Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-static {p1, p2}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->$r8$lambda$7eGlpAnsUDj5rQkxqbhkkUPmvPo(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;

    move-result-object p1

    return-object p1
.end method
