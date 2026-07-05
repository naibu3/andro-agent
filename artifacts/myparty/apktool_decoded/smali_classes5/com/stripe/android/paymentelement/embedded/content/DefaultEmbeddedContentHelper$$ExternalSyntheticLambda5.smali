.class public final synthetic Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda5;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentsheet/FormHelper;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/FormHelper;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda5;->f$0:Lcom/stripe/android/paymentsheet/FormHelper;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper$$ExternalSyntheticLambda5;->f$0:Lcom/stripe/android/paymentsheet/FormHelper;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;->$r8$lambda$AF3TmDdm_0pS9MwcMHrA6SrzD-c(Lcom/stripe/android/paymentsheet/FormHelper;Ljava/lang/String;)Lcom/stripe/android/paymentsheet/FormHelper$FormType;

    move-result-object p1

    return-object p1
.end method
