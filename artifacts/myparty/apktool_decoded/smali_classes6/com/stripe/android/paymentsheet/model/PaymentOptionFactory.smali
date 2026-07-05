.class public final Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;
.super Ljava/lang/Object;
.source "PaymentOptionFactory.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000e\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;",
        "",
        "iconLoader",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;Landroid/content/Context;)V",
        "create",
        "Lcom/stripe/android/paymentsheet/model/PaymentOption;",
        "selection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
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
.field private final context:Landroid/content/Context;

.field private final iconLoader:Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;Landroid/content/Context;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "iconLoader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;->iconLoader:Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;

    .line 10
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;->context:Landroid/content/Context;

    return-void
.end method

.method public static final synthetic access$getIconLoader$p(Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;)Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;
    .locals 0

    .line 8
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;->iconLoader:Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;

    return-object p0
.end method


# virtual methods
.method public final create(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/paymentsheet/model/PaymentOption;
    .locals 9

    const-string v0, "selection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-static {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelectionKt;->getDrawableResourceId(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)I

    move-result v2

    .line 15
    invoke-static {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelectionKt;->getLabel(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;->context:Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/stripe/android/core/strings/ResolvableString;->resolve(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    .line 16
    invoke-static {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelectionKt;->getPaymentMethodType(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Ljava/lang/String;

    move-result-object v4

    .line 17
    sget-object v0, Lcom/stripe/android/paymentsheet/model/PaymentOptionLabelsFactory;->INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentOptionLabelsFactory;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;->context:Landroid/content/Context;

    invoke-virtual {v0, v1, p1}, Lcom/stripe/android/paymentsheet/model/PaymentOptionLabelsFactory;->create(Landroid/content/Context;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;

    move-result-object v7

    .line 18
    invoke-static {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelectionKt;->getBillingDetails(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/model/PaymentSelectionKt;->toPaymentSheetBillingDetails(Lcom/stripe/android/model/PaymentMethod$BillingDetails;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v0

    move-object v5, v0

    goto :goto_0

    :cond_0
    move-object v5, v1

    .line 19
    :goto_0
    invoke-static {p1}, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactoryKt;->getShippingDetails(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object v6

    move-object v0, v1

    .line 13
    new-instance v1, Lcom/stripe/android/paymentsheet/model/PaymentOption;

    .line 20
    new-instance v8, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$1;

    invoke-direct {v8, p0, p1, v0}, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$1;-><init>(Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lkotlin/coroutines/Continuation;)V

    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 13
    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/paymentsheet/model/PaymentOption;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;Lkotlin/jvm/functions/Function1;)V

    return-object v1
.end method
