.class public final synthetic Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$$ExternalSyntheticLambda1;
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
    check-cast p1, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredState;

    check-cast p2, Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-static {p1, p2}, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->$r8$lambda$i0UClGvRC4tyrECfkS0D2mg3fLc(Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredState;

    move-result-object p1

    return-object p1
.end method
