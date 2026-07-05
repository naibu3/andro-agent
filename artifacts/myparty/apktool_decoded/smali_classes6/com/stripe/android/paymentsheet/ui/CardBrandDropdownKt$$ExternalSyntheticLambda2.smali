.class public final synthetic Lcom/stripe/android/paymentsheet/ui/CardBrandDropdownKt$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$1:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/CardBrandDropdownKt$$ExternalSyntheticLambda2;->f$0:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/CardBrandDropdownKt$$ExternalSyntheticLambda2;->f$1:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/CardBrandDropdownKt$$ExternalSyntheticLambda2;->f$0:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/CardBrandDropdownKt$$ExternalSyntheticLambda2;->f$1:Landroidx/compose/runtime/MutableState;

    check-cast p1, Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    invoke-static {v0, v1, p1}, Lcom/stripe/android/paymentsheet/ui/CardBrandDropdownKt;->$r8$lambda$Jag1hqHKh8kdpE676G9QZPrBFvo(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
