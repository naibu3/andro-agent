.class public final synthetic Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda3;->f$0:Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda3;->f$0:Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/util/List;

    check-cast p3, Lcom/stripe/android/model/CardBrand;

    invoke-static {v0, p1, p2, p3}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->$r8$lambda$eVou5LjE1vFyQ13syyXsaKbfN4Q(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/CardBrand;)Lcom/stripe/android/uicore/elements/TextFieldIcon;

    move-result-object p1

    return-object p1
.end method
