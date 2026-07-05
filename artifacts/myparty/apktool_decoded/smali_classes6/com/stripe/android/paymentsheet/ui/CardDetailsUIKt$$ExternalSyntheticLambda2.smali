.class public final synthetic Lcom/stripe/android/paymentsheet/ui/CardDetailsUIKt$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsUIKt$$ExternalSyntheticLambda2;->f$0:Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/CardDetailsUIKt$$ExternalSyntheticLambda2;->f$0:Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;

    check-cast p1, Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    invoke-static {v0, p1}, Lcom/stripe/android/paymentsheet/ui/CardDetailsUIKt;->$r8$lambda$hvcBmB0huURiM48pabvu44i7w18(Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
