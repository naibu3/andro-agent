.class public final Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$Companion;
.super Ljava/lang/Object;
.source "EmbeddedPaymentElement.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u001a\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008J%\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000c2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\tH\u0000\u00a2\u0006\u0002\u0008\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$Companion;",
        "",
        "<init>",
        "()V",
        "default",
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;",
        "immediateAction",
        "didSelectPaymentOption",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;",
        "",
        "getInternalRowSelectionCallback",
        "Lkotlin/Function0;",
        "rowSelectionBehavior",
        "embeddedPaymentElement",
        "getInternalRowSelectionCallback$paymentsheet_release",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic $r8$lambda$C9iRkrczZ6WXA1qur5G1LO-SNfQ(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$Companion;->getInternalRowSelectionCallback$lambda$0(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private constructor <init>()V
    .locals 0

    .line 642
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$Companion;-><init>()V

    return-void
.end method

.method private static final getInternalRowSelectionCallback$lambda$0(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;)Lkotlin/Unit;
    .locals 0

    .line 668
    check-cast p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$ImmediateAction;

    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$ImmediateAction;->getDidSelectPaymentOption()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final default()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;
    .locals 1

    .line 648
    sget-object v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$Default;->INSTANCE:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$Default;

    check-cast v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;

    return-object v0
.end method

.method public final getInternalRowSelectionCallback$paymentsheet_release(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;)Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;",
            "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;",
            ")",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    const-string v0, "rowSelectionBehavior"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "embeddedPaymentElement"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 667
    instance-of v0, p1, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$ImmediateAction;

    if-eqz v0, :cond_0

    .line 668
    new-instance v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$Companion$$ExternalSyntheticLambda0;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$Companion$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final immediateAction(Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;"
        }
    .end annotation

    const-string v0, "didSelectPaymentOption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 660
    new-instance v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$ImmediateAction;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$ImmediateAction;-><init>(Lkotlin/jvm/functions/Function1;)V

    check-cast v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;

    return-object v0
.end method
