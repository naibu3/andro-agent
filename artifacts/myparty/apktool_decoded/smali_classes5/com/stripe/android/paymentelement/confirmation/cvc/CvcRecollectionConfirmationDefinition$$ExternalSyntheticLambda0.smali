.class public final synthetic Lcom/stripe/android/paymentelement/confirmation/cvc/CvcRecollectionConfirmationDefinition$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionLauncher;

.field public final synthetic f$1:Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionLauncher;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentelement/confirmation/cvc/CvcRecollectionConfirmationDefinition$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionLauncher;

    iput-object p2, p0, Lcom/stripe/android/paymentelement/confirmation/cvc/CvcRecollectionConfirmationDefinition$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/cvc/CvcRecollectionConfirmationDefinition$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionLauncher;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/confirmation/cvc/CvcRecollectionConfirmationDefinition$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;

    check-cast p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionData;

    invoke-static {v0, v1, p1}, Lcom/stripe/android/paymentelement/confirmation/cvc/CvcRecollectionConfirmationDefinition;->$r8$lambda$IS5KsXwv3D38aren2q-kkIv3TIM(Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionLauncher;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionData;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
