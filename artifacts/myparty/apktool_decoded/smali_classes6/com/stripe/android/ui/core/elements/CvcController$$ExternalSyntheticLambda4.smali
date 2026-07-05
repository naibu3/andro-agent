.class public final synthetic Lcom/stripe/android/ui/core/elements/CvcController$$ExternalSyntheticLambda4;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/ui/core/elements/CvcController;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/ui/core/elements/CvcController;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/CvcController$$ExternalSyntheticLambda4;->f$0:Lcom/stripe/android/ui/core/elements/CvcController;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController$$ExternalSyntheticLambda4;->f$0:Lcom/stripe/android/ui/core/elements/CvcController;

    check-cast p1, Lcom/stripe/android/model/CardBrand;

    check-cast p2, Ljava/lang/String;

    invoke-static {v0, p1, p2}, Lcom/stripe/android/ui/core/elements/CvcController;->$r8$lambda$zKQE7GEwYBl6HCslipw8EbRGc3E(Lcom/stripe/android/ui/core/elements/CvcController;Lcom/stripe/android/model/CardBrand;Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;

    move-result-object p1

    return-object p1
.end method
