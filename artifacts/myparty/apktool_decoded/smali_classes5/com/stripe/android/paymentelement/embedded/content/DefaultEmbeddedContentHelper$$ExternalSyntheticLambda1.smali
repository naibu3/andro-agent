.class public final synthetic Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function5;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;

.field public final synthetic f$1:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

.field public final synthetic f$2:Lcom/stripe/android/paymentsheet/CustomerStateHolder;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/CustomerStateHolder;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda1;->f$0:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;

    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda1;->f$1:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    iput-object p3, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda1;->f$2:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda1;->f$0:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda1;->f$1:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    iget-object v2, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda1;->f$2:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    move-object v3, p1

    check-cast v3, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move-object v5, p3

    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v6, p4

    check-cast v6, Lkotlin/jvm/functions/Function2;

    move-object v7, p5

    check-cast v7, Lkotlin/jvm/functions/Function2;

    invoke-static/range {v0 .. v7}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->$r8$lambda$T2vcuXWKFSH7cwmsEGZZVnwwjTg(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/CustomerStateHolder;Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
