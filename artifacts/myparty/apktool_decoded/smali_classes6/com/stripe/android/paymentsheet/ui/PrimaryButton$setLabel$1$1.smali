.class final Lcom/stripe/android/paymentsheet/ui/PrimaryButton$setLabel$1$1;
.super Ljava/lang/Object;
.source "PrimaryButton.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setLabel(Lcom/stripe/android/core/strings/ResolvableString;)V
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
.field final synthetic $text:Lcom/stripe/android/core/strings/ResolvableString;

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/ui/PrimaryButton;


# direct methods
.method constructor <init>(Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentsheet/ui/PrimaryButton;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$setLabel$1$1;->$text:Lcom/stripe/android/core/strings/ResolvableString;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$setLabel$1$1;->this$0:Lcom/stripe/android/paymentsheet/ui/PrimaryButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 169
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$setLabel$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 170
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 173
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 170
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.paymentsheet.ui.PrimaryButton.setLabel.<anonymous>.<anonymous> (PrimaryButton.kt:169)"

    const v2, -0x2cf1f55

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 171
    :cond_2
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$setLabel$1$1;->$text:Lcom/stripe/android/core/strings/ResolvableString;

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Lcom/stripe/android/uicore/strings/ResolvableStringComposeUtilsKt;->resolve(Lcom/stripe/android/core/strings/ResolvableString;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object p2

    .line 172
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$setLabel$1$1;->this$0:Lcom/stripe/android/paymentsheet/ui/PrimaryButton;

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->access$getDefaultLabelColor$p(Lcom/stripe/android/paymentsheet/ui/PrimaryButton;)Ljava/lang/Integer;

    move-result-object v1

    .line 170
    invoke-static {p2, v1, p1, v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonKt;->access$LabelUI(Ljava/lang/String;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    return-void
.end method
