.class public final Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataFactory;
.super Ljava/lang/Object;
.source "PaymentOptionDisplayDataFactory.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPaymentOptionDisplayDataFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentOptionDisplayDataFactory.kt\ncom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001a\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000c\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataFactory;",
        "",
        "iconLoader",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;Landroid/content/Context;)V",
        "create",
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;",
        "selection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "paymentMethodMetadata",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
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

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataFactory;->iconLoader:Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;

    .line 21
    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataFactory;->context:Landroid/content/Context;

    return-void
.end method

.method public static final synthetic access$getIconLoader$p(Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataFactory;)Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;
    .locals 0

    .line 19
    iget-object p0, p0, Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataFactory;->iconLoader:Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;

    return-object p0
.end method


# virtual methods
.method public final create(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "paymentMethodMetadata"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    if-nez v1, :cond_0

    return-object v3

    .line 32
    :cond_0
    instance-of v4, v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    if-eqz v4, :cond_3

    .line 34
    invoke-static {v1}, Lcom/stripe/android/paymentsheet/model/PaymentSelectionKt;->getPaymentMethodType(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Ljava/lang/String;

    move-result-object v4

    .line 35
    sget-object v5, Lcom/stripe/android/paymentelement/embedded/content/NullUiDefinitionFactoryHelper;->INSTANCE:Lcom/stripe/android/paymentelement/embedded/content/NullUiDefinitionFactoryHelper;

    invoke-virtual {v5}, Lcom/stripe/android/paymentelement/embedded/content/NullUiDefinitionFactoryHelper;->getNullEmbeddedUiDefinitionFactory()Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory$Default;

    move-result-object v5

    check-cast v5, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory;

    .line 33
    invoke-virtual {v2, v4, v5}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->formElementsForCode(Ljava/lang/String;Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_2

    check-cast v2, Ljava/lang/Iterable;

    .line 36
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/uicore/elements/FormElement;

    invoke-interface {v4}, Lcom/stripe/android/uicore/elements/FormElement;->getMandateText()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_2
    :goto_0
    move-object v4, v3

    goto :goto_1

    .line 38
    :cond_3
    instance-of v4, v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    if-eqz v4, :cond_4

    move-object v4, v1

    check-cast v4, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    invoke-static {v4, v2}, Lcom/stripe/android/paymentsheet/model/PaymentSelectionKt;->mandateTextFromPaymentMethodMetadata(Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v4

    goto :goto_1

    .line 39
    :cond_4
    instance-of v2, v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomPaymentMethod;

    if-nez v2, :cond_2

    .line 40
    instance-of v2, v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$ExternalPaymentMethod;

    if-nez v2, :cond_2

    .line 41
    instance-of v2, v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    if-nez v2, :cond_2

    .line 42
    instance-of v2, v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;

    if-nez v2, :cond_2

    .line 43
    instance-of v2, v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$ShopPay;

    if-eqz v2, :cond_5

    goto :goto_0

    .line 31
    :cond_5
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    .line 47
    :goto_1
    invoke-static {v1}, Lcom/stripe/android/paymentsheet/model/PaymentSelectionKt;->getLabel(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v2

    iget-object v5, v0, Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataFactory;->context:Landroid/content/Context;

    invoke-interface {v2, v5}, Lcom/stripe/android/core/strings/ResolvableString;->resolve(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    .line 55
    invoke-static {v1}, Lcom/stripe/android/paymentsheet/model/PaymentSelectionKt;->getBillingDetails(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-static {v2}, Lcom/stripe/android/paymentsheet/model/PaymentSelectionKt;->toPaymentSheetBillingDetails(Lcom/stripe/android/model/PaymentMethod$BillingDetails;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v2

    move-object v9, v2

    goto :goto_2

    :cond_6
    move-object v9, v3

    .line 56
    :goto_2
    invoke-static {v1}, Lcom/stripe/android/paymentsheet/model/PaymentSelectionKt;->getPaymentMethodType(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Ljava/lang/String;

    move-result-object v10

    if-nez v4, :cond_7

    move-object v11, v3

    goto :goto_3

    .line 57
    :cond_7
    new-instance v11, Landroidx/compose/ui/text/AnnotatedString;

    iget-object v2, v0, Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataFactory;->context:Landroid/content/Context;

    invoke-interface {v4, v2}, Lcom/stripe/android/core/strings/ResolvableString;->resolve(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v12

    const/4 v15, 0x6

    const/16 v16, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v11 .. v16}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 58
    :goto_3
    invoke-static {v1}, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactoryKt;->getShippingDetails(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object v12

    .line 46
    new-instance v6, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;

    .line 48
    new-instance v2, Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataFactory$create$1;

    invoke-direct {v2, v0, v1, v3}, Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataFactory$create$1;-><init>(Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataFactory;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lkotlin/coroutines/Continuation;)V

    move-object v7, v2

    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 46
    invoke-direct/range {v6 .. v12}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Ljava/lang/String;Landroidx/compose/ui/text/AnnotatedString;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V

    return-object v6
.end method
