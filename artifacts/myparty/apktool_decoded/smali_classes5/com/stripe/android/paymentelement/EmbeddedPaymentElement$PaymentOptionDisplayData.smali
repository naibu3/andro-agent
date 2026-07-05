.class public final Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;
.super Ljava/lang/Object;
.source "EmbeddedPaymentElement.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PaymentOptionDisplayData"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001BU\u0008\u0000\u0012\u001c\u0010\u0002\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R+\u0010\u0002\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00038G\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u001c\u0010\u001dR\u001c\u0010 \u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$R\u0011\u0010%\u001a\u00020&8G\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010(\u00a8\u0006)"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;",
        "",
        "imageLoader",
        "Lkotlin/Function1;",
        "Lkotlin/coroutines/Continuation;",
        "Landroid/graphics/drawable/Drawable;",
        "label",
        "",
        "billingDetails",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;",
        "paymentMethodType",
        "mandateText",
        "Landroidx/compose/ui/text/AnnotatedString;",
        "_shippingDetails",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
        "<init>",
        "(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Ljava/lang/String;Landroidx/compose/ui/text/AnnotatedString;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V",
        "getImageLoader",
        "()Lkotlin/jvm/functions/Function1;",
        "Lkotlin/jvm/functions/Function1;",
        "getLabel",
        "()Ljava/lang/String;",
        "getBillingDetails",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;",
        "getPaymentMethodType",
        "getMandateText",
        "()Landroidx/compose/ui/text/AnnotatedString;",
        "iconDrawable",
        "getIconDrawable",
        "()Landroid/graphics/drawable/Drawable;",
        "iconDrawable$delegate",
        "Lkotlin/Lazy;",
        "shippingDetails",
        "getShippingDetails$annotations",
        "()V",
        "getShippingDetails",
        "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
        "iconPainter",
        "Landroidx/compose/ui/graphics/painter/Painter;",
        "getIconPainter",
        "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;",
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


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final _shippingDetails:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

.field private final billingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

.field private final iconDrawable$delegate:Lkotlin/Lazy;

.field private final imageLoader:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroid/graphics/drawable/Drawable;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final label:Ljava/lang/String;

.field private final mandateText:Landroidx/compose/ui/text/AnnotatedString;

.field private final paymentMethodType:Ljava/lang/String;


# direct methods
.method public static synthetic $r8$lambda$KIMbf4QJeg0jUorwduN8sXvfOYg(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;)Lcom/stripe/android/common/ui/DelegateDrawable;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->iconDrawable_delegate$lambda$0(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;)Lcom/stripe/android/common/ui/DelegateDrawable;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Ljava/lang/String;Landroidx/compose/ui/text/AnnotatedString;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroid/graphics/drawable/Drawable;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;",
            "Ljava/lang/String;",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
            ")V"
        }
    .end annotation

    const-string v0, "imageLoader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 544
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 545
    iput-object p1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->imageLoader:Lkotlin/jvm/functions/Function1;

    .line 551
    iput-object p2, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->label:Ljava/lang/String;

    .line 556
    iput-object p3, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->billingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    .line 567
    iput-object p4, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->paymentMethodType:Ljava/lang/String;

    .line 573
    iput-object p5, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->mandateText:Landroidx/compose/ui/text/AnnotatedString;

    .line 574
    iput-object p6, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->_shippingDetails:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    .line 576
    new-instance p1, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData$$ExternalSyntheticLambda0;

    invoke-direct {p1, p0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->iconDrawable$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getIconDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 576
    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->iconDrawable$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public static synthetic getShippingDetails$annotations()V
    .locals 0

    return-void
.end method

.method private static final iconDrawable_delegate$lambda$0(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;)Lcom/stripe/android/common/ui/DelegateDrawable;
    .locals 1

    .line 577
    new-instance v0, Lcom/stripe/android/common/ui/DelegateDrawable;

    iget-object p0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->imageLoader:Lkotlin/jvm/functions/Function1;

    invoke-direct {v0, p0}, Lcom/stripe/android/common/ui/DelegateDrawable;-><init>(Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->imageLoader:Lkotlin/jvm/functions/Function1;

    iget-object v3, p1, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->imageLoader:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->label:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->label:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->billingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    iget-object v3, p1, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->billingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->paymentMethodType:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->paymentMethodType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->mandateText:Landroidx/compose/ui/text/AnnotatedString;

    iget-object v3, p1, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->mandateText:Landroidx/compose/ui/text/AnnotatedString;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->_shippingDetails:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    iget-object p1, p1, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->_shippingDetails:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;
    .locals 1

    .line 556
    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->billingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    return-object v0
.end method

.method public final getIconPainter(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;
    .locals 3

    const v0, 0x636ce564

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentelement.EmbeddedPaymentElement.PaymentOptionDisplayData.<get-iconPainter> (EmbeddedPaymentElement.kt:591)"

    .line 592
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_0
    invoke-direct {p0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->getIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Lcom/stripe/android/uicore/image/DrawablePainterKt;->rememberDrawablePainter(Landroid/graphics/drawable/Drawable;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    move-result-object p2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-object p2
.end method

.method public final getImageLoader()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroid/graphics/drawable/Drawable;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 545
    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->imageLoader:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    .line 551
    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getMandateText()Landroidx/compose/ui/text/AnnotatedString;
    .locals 1

    .line 573
    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->mandateText:Landroidx/compose/ui/text/AnnotatedString;

    return-object v0
.end method

.method public final getPaymentMethodType()Ljava/lang/String;
    .locals 1

    .line 567
    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->paymentMethodType:Ljava/lang/String;

    return-object v0
.end method

.method public final getShippingDetails()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;
    .locals 1

    .line 585
    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->_shippingDetails:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->imageLoader:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->label:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->billingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->paymentMethodType:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->mandateText:Landroidx/compose/ui/text/AnnotatedString;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Landroidx/compose/ui/text/AnnotatedString;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->_shippingDetails:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->imageLoader:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->label:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->billingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    iget-object v3, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->paymentMethodType:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->mandateText:Landroidx/compose/ui/text/AnnotatedString;

    iget-object v5, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;->_shippingDetails:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "PaymentOptionDisplayData(imageLoader="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, ", label="

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", billingDetails="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", paymentMethodType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mandateText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", _shippingDetails="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
