.class public final synthetic Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher$Companion$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher$Companion$$ExternalSyntheticLambda0;->f$0:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher$Companion$$ExternalSyntheticLambda0;->f$0:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;

    invoke-static {v0, p1}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher$Companion;->$r8$lambda$4qcqc2JAsrNNIMNAQdgRjgvzCt0(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;)V

    return-void
.end method
