.class public final synthetic Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Ljava/util/List;

.field public final synthetic f$1:Z

.field public final synthetic f$2:Z

.field public final synthetic f$3:Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

.field public final synthetic f$4:F

.field public final synthetic f$5:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$6:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$7:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;ZZLcom/stripe/android/paymentsheet/PaymentOptionsItem;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$$ExternalSyntheticLambda0;->f$0:Ljava/util/List;

    iput-boolean p2, p0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$$ExternalSyntheticLambda0;->f$1:Z

    iput-boolean p3, p0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$$ExternalSyntheticLambda0;->f$2:Z

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$$ExternalSyntheticLambda0;->f$3:Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    iput p5, p0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$$ExternalSyntheticLambda0;->f$4:F

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$$ExternalSyntheticLambda0;->f$5:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$$ExternalSyntheticLambda0;->f$6:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$$ExternalSyntheticLambda0;->f$7:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$$ExternalSyntheticLambda0;->f$0:Ljava/util/List;

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$$ExternalSyntheticLambda0;->f$1:Z

    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$$ExternalSyntheticLambda0;->f$2:Z

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$$ExternalSyntheticLambda0;->f$3:Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    iget v4, p0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$$ExternalSyntheticLambda0;->f$4:F

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$$ExternalSyntheticLambda0;->f$5:Lkotlin/jvm/functions/Function0;

    iget-object v6, p0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$$ExternalSyntheticLambda0;->f$6:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$$ExternalSyntheticLambda0;->f$7:Lkotlin/jvm/functions/Function1;

    move-object v8, p1

    check-cast v8, Landroidx/compose/foundation/lazy/LazyListScope;

    invoke-static/range {v0 .. v8}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6;->$r8$lambda$87Lp6xRbK-uaNF3X6MerHIXfsFI(Ljava/util/List;ZZLcom/stripe/android/paymentsheet/PaymentOptionsItem;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/LazyListScope;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
