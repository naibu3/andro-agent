.class public final synthetic Lcom/stripe/android/ui/core/elements/CardDetailsSectionElementUIKt$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsSectionElementUIKt$$ExternalSyntheticLambda1;->f$0:Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsSectionElementUIKt$$ExternalSyntheticLambda1;->f$0:Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;

    check-cast p1, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;

    invoke-static {v0, p1}, Lcom/stripe/android/ui/core/elements/CardDetailsSectionElementUIKt;->$r8$lambda$l85Cm53bjOHjim47kc2ALA751sw(Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
