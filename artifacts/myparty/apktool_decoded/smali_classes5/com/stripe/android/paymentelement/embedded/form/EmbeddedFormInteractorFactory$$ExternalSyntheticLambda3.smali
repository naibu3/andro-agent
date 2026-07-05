.class public final synthetic Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    check-cast p1, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;

    invoke-static {p1}, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->$r8$lambda$KbxQrCVAlS03fBbVHnPFpWXTbgE(Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
