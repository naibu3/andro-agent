.class public final synthetic Lcom/reactnativestripesdk/EmbeddedPaymentElementView$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/reactnativestripesdk/EmbeddedPaymentElementView;


# direct methods
.method public synthetic constructor <init>(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$$ExternalSyntheticLambda2;->f$0:Lcom/reactnativestripesdk/EmbeddedPaymentElementView;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$$ExternalSyntheticLambda2;->f$0:Lcom/reactnativestripesdk/EmbeddedPaymentElementView;

    check-cast p1, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;

    invoke-static {v0, p1}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->$r8$lambda$XXti3RTcgMl2kL889w5ZzF-5PhM(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
