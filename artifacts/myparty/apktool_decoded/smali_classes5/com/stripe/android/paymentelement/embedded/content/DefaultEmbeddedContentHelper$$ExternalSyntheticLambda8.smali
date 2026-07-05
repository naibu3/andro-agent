.class public final synthetic Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda8;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda8;->f$0:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda8;->f$0:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;

    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->$r8$lambda$tSgSQG6YrifSB17O7EXu_yg8-0U(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Z)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
