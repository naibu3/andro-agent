.class public final Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;
.super Ljava/lang/Object;
.source "TransformSpecToElements.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTransformSpecToElements.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformSpecToElements.kt\ncom/stripe/android/lpmfoundations/luxe/TransformSpecToElements\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n1368#2:91\n1454#2,5:92\n*S KotlinDebug\n*F\n+ 1 TransformSpecToElements.kt\ncom/stripe/android/lpmfoundations/luxe/TransformSpecToElements\n*L\n56#1:91\n56#1:92,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J4\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0008\u0010\t\u001a\u0004\u0018\u00010\n2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00072\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;",
        "",
        "arguments",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;",
        "<init>",
        "(Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;)V",
        "transform",
        "",
        "Lcom/stripe/android/uicore/elements/FormElement;",
        "metadata",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
        "specs",
        "Lcom/stripe/android/ui/core/elements/FormItemSpec;",
        "placeholderOverrideList",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
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
.field private final arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;)V
    .locals 1

    const-string v0, "arguments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    return-void
.end method

.method public static synthetic transform$default(Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 49
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p3

    .line 46
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;->transform(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final transform(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/ui/core/elements/FormItemSpec;",
            ">;",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;"
        }
    .end annotation

    const-string v0, "specs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "placeholderOverrideList"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    sget-object v0, Lcom/stripe/android/paymentsheet/forms/PlaceholderHelper;->INSTANCE:Lcom/stripe/android/paymentsheet/forms/PlaceholderHelper;

    .line 52
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object v1

    .line 54
    iget-object v2, p0, Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {v2}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getRequiresMandate()Z

    move-result v2

    .line 51
    invoke-virtual {v0, p2, p3, v2, v1}, Lcom/stripe/android/paymentsheet/forms/PlaceholderHelper;->specsForConfiguration$paymentsheet_release(Ljava/util/List;Ljava/util/List;ZLcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    .line 91
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    check-cast p3, Ljava/util/Collection;

    .line 92
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 93
    check-cast v0, Lcom/stripe/android/ui/core/elements/FormItemSpec;

    .line 58
    instance-of v1, v0, Lcom/stripe/android/ui/core/elements/StaticTextSpec;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/stripe/android/ui/core/elements/StaticTextSpec;

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/StaticTextSpec;->transform()Lcom/stripe/android/uicore/elements/FormElement;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_1

    .line 59
    :cond_0
    instance-of v1, v0, Lcom/stripe/android/ui/core/elements/AfterpayClearpayTextSpec;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast v0, Lcom/stripe/android/ui/core/elements/AfterpayClearpayTextSpec;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/model/IntentKt;->getCurrency(Lcom/stripe/android/model/StripeIntent;)Ljava/lang/String;

    move-result-object v2

    :cond_1
    invoke-virtual {v0, v2}, Lcom/stripe/android/ui/core/elements/AfterpayClearpayTextSpec;->transform(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/FormElement;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_1

    .line 60
    :cond_2
    instance-of v1, v0, Lcom/stripe/android/ui/core/elements/AffirmTextSpec;

    if-eqz v1, :cond_3

    check-cast v0, Lcom/stripe/android/ui/core/elements/AffirmTextSpec;

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/AffirmTextSpec;->transform()Lcom/stripe/android/uicore/elements/FormElement;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_1

    .line 61
    :cond_3
    instance-of v1, v0, Lcom/stripe/android/ui/core/elements/EmptyFormSpec;

    if-eqz v1, :cond_4

    new-instance v0, Lcom/stripe/android/ui/core/elements/EmptyFormElement;

    const/4 v1, 0x3

    invoke-direct {v0, v2, v2, v1, v2}, Lcom/stripe/android/ui/core/elements/EmptyFormElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/Controller;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_1

    .line 62
    :cond_4
    instance-of v1, v0, Lcom/stripe/android/ui/core/elements/MandateTextSpec;

    if-eqz v1, :cond_5

    check-cast v0, Lcom/stripe/android/ui/core/elements/MandateTextSpec;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {v2}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getMerchantName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lcom/stripe/android/ui/core/elements/MandateTextSpec;->transform([Ljava/lang/String;)Lcom/stripe/android/uicore/elements/FormElement;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_1

    .line 63
    :cond_5
    instance-of v1, v0, Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextSpec;

    if-eqz v1, :cond_6

    check-cast v0, Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextSpec;

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getMerchantName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextSpec;->transform(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/FormElement;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_1

    .line 64
    :cond_6
    instance-of v1, v0, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;

    if-eqz v1, :cond_7

    check-cast v0, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getInitialValues()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;->transform(Ljava/util/Map;)Lcom/stripe/android/uicore/elements/SectionElement;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_1

    .line 65
    :cond_7
    instance-of v1, v0, Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;

    if-eqz v1, :cond_8

    check-cast v0, Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getMerchantName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {v2}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getInitialValues()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;->transform(Ljava/lang/String;Ljava/util/Map;)Lcom/stripe/android/uicore/elements/CheckboxFieldElement;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_1

    .line 66
    :cond_8
    instance-of v1, v0, Lcom/stripe/android/ui/core/elements/BsbSpec;

    if-eqz v1, :cond_9

    check-cast v0, Lcom/stripe/android/ui/core/elements/BsbSpec;

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getInitialValues()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/ui/core/elements/BsbSpec;->transform(Ljava/util/Map;)Lcom/stripe/android/ui/core/elements/BsbElement;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_1

    .line 67
    :cond_9
    instance-of v1, v0, Lcom/stripe/android/ui/core/elements/OTPSpec;

    if-eqz v1, :cond_a

    check-cast v0, Lcom/stripe/android/ui/core/elements/OTPSpec;

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/OTPSpec;->transform()Lcom/stripe/android/uicore/elements/OTPElement;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_1

    .line 68
    :cond_a
    instance-of v1, v0, Lcom/stripe/android/ui/core/elements/NameSpec;

    if-eqz v1, :cond_b

    check-cast v0, Lcom/stripe/android/ui/core/elements/NameSpec;

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getInitialValues()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/ui/core/elements/NameSpec;->transform(Ljava/util/Map;)Lcom/stripe/android/uicore/elements/SectionElement;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_1

    .line 69
    :cond_b
    instance-of v1, v0, Lcom/stripe/android/ui/core/elements/EmailSpec;

    if-eqz v1, :cond_c

    check-cast v0, Lcom/stripe/android/ui/core/elements/EmailSpec;

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getInitialValues()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/ui/core/elements/EmailSpec;->transform(Ljava/util/Map;)Lcom/stripe/android/uicore/elements/SectionElement;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_1

    .line 70
    :cond_c
    instance-of v1, v0, Lcom/stripe/android/ui/core/elements/PhoneSpec;

    if-eqz v1, :cond_d

    check-cast v0, Lcom/stripe/android/ui/core/elements/PhoneSpec;

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getInitialValues()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/ui/core/elements/PhoneSpec;->transform(Ljava/util/Map;)Lcom/stripe/android/uicore/elements/SectionElement;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_1

    .line 71
    :cond_d
    instance-of v1, v0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;

    if-eqz v1, :cond_e

    check-cast v0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getInitialValues()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->transform(Ljava/util/Map;)Lcom/stripe/android/uicore/elements/SectionElement;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_1

    .line 72
    :cond_e
    instance-of v1, v0, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;

    if-eqz v1, :cond_f

    check-cast v0, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getInitialValues()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;->transform(Ljava/util/Map;)Lcom/stripe/android/uicore/elements/SectionElement;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_1

    .line 73
    :cond_f
    instance-of v1, v0, Lcom/stripe/android/ui/core/elements/IbanSpec;

    if-eqz v1, :cond_10

    check-cast v0, Lcom/stripe/android/ui/core/elements/IbanSpec;

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getInitialValues()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/ui/core/elements/IbanSpec;->transform(Ljava/util/Map;)Lcom/stripe/android/uicore/elements/SectionElement;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_1

    .line 74
    :cond_10
    instance-of v1, v0, Lcom/stripe/android/ui/core/elements/KlarnaHeaderStaticTextSpec;

    if-eqz v1, :cond_11

    check-cast v0, Lcom/stripe/android/ui/core/elements/KlarnaHeaderStaticTextSpec;

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/KlarnaHeaderStaticTextSpec;->transform()Lcom/stripe/android/uicore/elements/FormElement;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_1

    .line 75
    :cond_11
    instance-of v1, v0, Lcom/stripe/android/ui/core/elements/DropdownSpec;

    if-eqz v1, :cond_12

    check-cast v0, Lcom/stripe/android/ui/core/elements/DropdownSpec;

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getInitialValues()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/ui/core/elements/DropdownSpec;->transform(Ljava/util/Map;)Lcom/stripe/android/uicore/elements/SectionElement;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_1

    .line 76
    :cond_12
    instance-of v1, v0, Lcom/stripe/android/ui/core/elements/CountrySpec;

    if-eqz v1, :cond_13

    check-cast v0, Lcom/stripe/android/ui/core/elements/CountrySpec;

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getInitialValues()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/ui/core/elements/CountrySpec;->transform(Ljava/util/Map;)Lcom/stripe/android/uicore/elements/SectionElement;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    .line 77
    :cond_13
    instance-of v1, v0, Lcom/stripe/android/ui/core/elements/AddressSpec;

    if-eqz v1, :cond_14

    check-cast v0, Lcom/stripe/android/ui/core/elements/AddressSpec;

    .line 78
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getInitialValues()Ljava/util/Map;

    move-result-object v1

    .line 79
    iget-object v2, p0, Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {v2}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getShippingValues()Ljava/util/Map;

    move-result-object v2

    .line 80
    iget-object v3, p0, Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getAutocompleteAddressInteractorFactory()Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;

    move-result-object v3

    .line 77
    invoke-virtual {v0, v1, v2, v3}, Lcom/stripe/android/ui/core/elements/AddressSpec;->transform(Ljava/util/Map;Ljava/util/Map;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    .line 82
    :cond_14
    instance-of v1, v0, Lcom/stripe/android/ui/core/elements/SepaMandateTextSpec;

    if-eqz v1, :cond_15

    check-cast v0, Lcom/stripe/android/ui/core/elements/SepaMandateTextSpec;

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getMerchantName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/ui/core/elements/SepaMandateTextSpec;->transform(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/FormElement;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    .line 83
    :cond_15
    instance-of v1, v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec;

    if-eqz v1, :cond_16

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_1

    .line 84
    :cond_16
    instance-of v1, v0, Lcom/stripe/android/ui/core/elements/CashAppPayMandateTextSpec;

    if-eqz v1, :cond_17

    check-cast v0, Lcom/stripe/android/ui/core/elements/CashAppPayMandateTextSpec;

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getMerchantName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/ui/core/elements/CashAppPayMandateTextSpec;->transform(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/FormElement;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    .line 85
    :cond_17
    instance-of v1, v0, Lcom/stripe/android/ui/core/elements/KlarnaMandateTextSpec;

    if-eqz v1, :cond_18

    check-cast v0, Lcom/stripe/android/ui/core/elements/KlarnaMandateTextSpec;

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getMerchantName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/ui/core/elements/KlarnaMandateTextSpec;->transform(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/FormElement;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 57
    :goto_1
    check-cast v0, Ljava/lang/Iterable;

    .line 94
    invoke-static {p3, v0}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto/16 :goto_0

    .line 57
    :cond_18
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 96
    :cond_19
    check-cast p3, Ljava/util/List;

    return-object p3
.end method
