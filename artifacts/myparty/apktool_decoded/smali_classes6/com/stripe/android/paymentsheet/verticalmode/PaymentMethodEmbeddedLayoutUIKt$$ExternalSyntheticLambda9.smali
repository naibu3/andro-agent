.class public final synthetic Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Ljava/util/List;

.field public final synthetic f$1:Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

.field public final synthetic f$10:Landroidx/compose/ui/Modifier;

.field public final synthetic f$11:I

.field public final synthetic f$12:I

.field public final synthetic f$13:I

.field public final synthetic f$2:Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor$SavedPaymentMethodAction;

.field public final synthetic f$3:Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor$Selection;

.field public final synthetic f$4:Z

.field public final synthetic f$5:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$6:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$7:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$8:Lcom/stripe/android/uicore/image/StripeImageLoader;

.field public final synthetic f$9:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor$SavedPaymentMethodAction;Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor$Selection;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/uicore/image/StripeImageLoader;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Landroidx/compose/ui/Modifier;III)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9;->f$0:Ljava/util/List;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9;->f$1:Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9;->f$2:Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor$SavedPaymentMethodAction;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9;->f$3:Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor$Selection;

    iput-boolean p5, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9;->f$4:Z

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9;->f$5:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9;->f$6:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9;->f$7:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9;->f$8:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iput-object p10, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9;->f$9:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;

    iput-object p11, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9;->f$10:Landroidx/compose/ui/Modifier;

    iput p12, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9;->f$11:I

    iput p13, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9;->f$12:I

    iput p14, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9;->f$13:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 0
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9;->f$0:Ljava/util/List;

    iget-object v2, v0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9;->f$1:Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    iget-object v3, v0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9;->f$2:Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor$SavedPaymentMethodAction;

    iget-object v4, v0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9;->f$3:Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor$Selection;

    iget-boolean v5, v0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9;->f$4:Z

    iget-object v6, v0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9;->f$5:Lkotlin/jvm/functions/Function0;

    iget-object v7, v0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9;->f$6:Lkotlin/jvm/functions/Function1;

    iget-object v8, v0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9;->f$7:Lkotlin/jvm/functions/Function1;

    iget-object v9, v0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9;->f$8:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iget-object v10, v0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9;->f$9:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;

    iget-object v11, v0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9;->f$10:Landroidx/compose/ui/Modifier;

    iget v12, v0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9;->f$11:I

    iget v13, v0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9;->f$12:I

    iget v14, v0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9;->f$13:I

    move-object/from16 v15, p1

    check-cast v15, Landroidx/compose/runtime/Composer;

    move-object/from16 v16, p2

    check-cast v16, Ljava/lang/Integer;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v16

    invoke-static/range {v1 .. v16}, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodEmbeddedLayoutUIKt;->$r8$lambda$YvMuNm3O7Zkhz8VfT3PhqJbJTrU(Ljava/util/List;Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor$SavedPaymentMethodAction;Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor$Selection;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/uicore/image/StripeImageLoader;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Landroidx/compose/ui/Modifier;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object v1

    return-object v1
.end method
