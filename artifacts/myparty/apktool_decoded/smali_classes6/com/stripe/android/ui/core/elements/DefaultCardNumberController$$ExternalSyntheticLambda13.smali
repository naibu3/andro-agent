.class public final synthetic Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda13;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda13;->f$0:Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda13;->f$0:Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;

    check-cast p1, Lcom/stripe/android/model/CardBrand;

    check-cast p2, Ljava/util/List;

    invoke-static {v0, p1, p2}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->$r8$lambda$WDaEejnuKpJYf-marJ7LZ2Z6Kaw(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;Lcom/stripe/android/model/CardBrand;Ljava/util/List;)Lcom/stripe/android/model/CardBrand;

    move-result-object p1

    return-object p1
.end method
