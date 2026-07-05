.class final Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1$1;
.super Ljava/lang/Object;
.source "PaymentMethodScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $onFormFieldValuesChanged:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;

.field final synthetic $uuid:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1$1;->$uuid:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1$1;->$state:Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;

    iput-object p3, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1$1;->$onFormFieldValuesChanged:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 47
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 12

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 48
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 54
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 48
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.link.ui.paymentmenthod.PaymentMethodBody.<anonymous>.<anonymous> (PaymentMethodScreen.kt:47)"

    const v2, -0x3214b1fc

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 49
    :cond_2
    iget-object v3, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1$1;->$uuid:Ljava/lang/String;

    .line 50
    iget-object p2, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1$1;->$state:Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;

    invoke-virtual {p2}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;->getFormArguments()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v4

    .line 52
    iget-object v6, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1$1;->$onFormFieldValuesChanged:Lkotlin/jvm/functions/Function1;

    .line 53
    iget-object p2, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1$1;->$state:Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;

    invoke-virtual {p2}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;->getFormElements()Ljava/util/List;

    move-result-object v7

    const/16 v10, 0x180

    const/16 v11, 0x20

    const/4 v5, 0x1

    const/4 v8, 0x0

    move-object v9, p1

    .line 48
    invoke-static/range {v3 .. v11}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt;->PaymentMethodForm(Ljava/lang/String;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;ZLkotlin/jvm/functions/Function1;Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    return-void
.end method
