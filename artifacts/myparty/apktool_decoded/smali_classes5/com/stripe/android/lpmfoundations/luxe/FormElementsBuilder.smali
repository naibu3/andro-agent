.class public final Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;
.super Ljava/lang/Object;
.source "FormElementsBuilder.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0010 \n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0008J\u0006\u0010\u0015\u001a\u00020\u0000J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\rJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0008J\u0006\u0010\u0019\u001a\u00020\u0000J\u0016\u0010\u001a\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0008J\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;",
        "",
        "arguments",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;",
        "<init>",
        "(Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;)V",
        "headerFormElements",
        "",
        "Lcom/stripe/android/uicore/elements/FormElement;",
        "uiFormElements",
        "footerFormElements",
        "requiredContactInformationCollectionModes",
        "",
        "Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;",
        "requireBillingAddressCollection",
        "",
        "availableCountries",
        "",
        "",
        "header",
        "formElement",
        "ignoreContactInformationRequirements",
        "requireContactInformationIfAllowed",
        "type",
        "element",
        "ignoreBillingAddressRequirements",
        "requireBillingAddressIfAllowed",
        "footer",
        "build",
        "",
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

.field private availableCountries:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final footerFormElements:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;"
        }
    .end annotation
.end field

.field private final headerFormElements:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;"
        }
    .end annotation
.end field

.field private requireBillingAddressCollection:Z

.field private final requiredContactInformationCollectionModes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;",
            ">;"
        }
    .end annotation
.end field

.field private final uiFormElements:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;)V
    .locals 2

    const-string v0, "arguments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    .line 12
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->headerFormElements:Ljava/util/List;

    .line 13
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->uiFormElements:Ljava/util/List;

    .line 14
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->footerFormElements:Ljava/util/List;

    .line 16
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast p1, Ljava/util/Set;

    iput-object p1, p0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->requiredContactInformationCollectionModes:Ljava/util/Set;

    .line 19
    sget-object p1, Lcom/stripe/android/core/model/CountryUtils;->INSTANCE:Lcom/stripe/android/core/model/CountryUtils;

    invoke-virtual {p1}, Lcom/stripe/android/core/model/CountryUtils;->getSupportedBillingCountries()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->availableCountries:Ljava/util/Set;

    .line 23
    invoke-static {}, Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object p1

    invoke-interface {p1}, Lkotlin/enums/EnumEntries;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;

    .line 24
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;->isRequired(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 25
    invoke-virtual {p0, v0}, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->requireContactInformationIfAllowed(Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;)Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;

    goto :goto_0

    .line 30
    :cond_1
    iget-object p1, p0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;

    move-result-object p1

    .line 31
    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;->Full:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;

    if-ne p1, v0, :cond_2

    const/4 p1, 0x1

    const/4 v0, 0x0

    .line 33
    invoke-static {p0, v0, p1, v0}, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->requireBillingAddressIfAllowed$default(Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;Ljava/util/Set;ILjava/lang/Object;)Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;

    :cond_2
    return-void
.end method

.method public static synthetic requireBillingAddressIfAllowed$default(Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;Ljava/util/Set;ILjava/lang/Object;)Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 60
    iget-object p1, p0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->availableCountries:Ljava/util/Set;

    .line 59
    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->requireBillingAddressIfAllowed(Ljava/util/Set;)Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final build()Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;"
        }
    .end annotation

    .line 76
    invoke-static {}, Lkotlin/collections/CollectionsKt;->createListBuilder()Ljava/util/List;

    move-result-object v0

    .line 77
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->headerFormElements:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 79
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->requiredContactInformationCollectionModes:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;

    .line 80
    iget-object v3, p0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getInitialValues()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;->formElement(Ljava/util/Map;)Lcom/stripe/android/uicore/elements/FormElement;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 83
    :cond_0
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->uiFormElements:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 85
    iget-boolean v1, p0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->requireBillingAddressCollection:Z

    if-eqz v1, :cond_1

    .line 86
    new-instance v2, Lcom/stripe/android/ui/core/elements/AddressSpec;

    iget-object v4, p0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->availableCountries:Ljava/util/Set;

    const/16 v9, 0x3d

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lcom/stripe/android/ui/core/elements/AddressSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLcom/stripe/android/uicore/elements/AddressInputMode;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 87
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getInitialValues()Ljava/util/Map;

    move-result-object v1

    .line 88
    iget-object v3, p0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getShippingValues()Ljava/util/Map;

    move-result-object v3

    .line 89
    iget-object v4, p0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {v4}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getAutocompleteAddressInteractorFactory()Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;

    move-result-object v4

    .line 86
    invoke-virtual {v2, v1, v3, v4}, Lcom/stripe/android/ui/core/elements/AddressSpec;->transform(Ljava/util/Map;Ljava/util/Map;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;)Ljava/util/List;

    move-result-object v1

    .line 92
    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 95
    :cond_1
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->footerFormElements:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 76
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->build(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final element(Lcom/stripe/android/uicore/elements/FormElement;)Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;
    .locals 1

    const-string v0, "formElement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;

    .line 52
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->uiFormElements:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final footer(Lcom/stripe/android/uicore/elements/FormElement;)Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;
    .locals 1

    const-string v0, "formElement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;

    .line 72
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->footerFormElements:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final header(Lcom/stripe/android/uicore/elements/FormElement;)Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;
    .locals 1

    const-string v0, "formElement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;

    .line 38
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->headerFormElements:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final ignoreBillingAddressRequirements()Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;
    .locals 1

    .line 55
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;

    const/4 v0, 0x0

    .line 56
    iput-boolean v0, p0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->requireBillingAddressCollection:Z

    return-object p0
.end method

.method public final ignoreContactInformationRequirements()Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;
    .locals 1

    .line 41
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;

    .line 42
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->requiredContactInformationCollectionModes:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-object p0
.end method

.method public final requireBillingAddressIfAllowed(Ljava/util/Set;)Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;"
        }
    .end annotation

    const-string v0, "availableCountries"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;

    .line 62
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {v0}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;

    move-result-object v0

    .line 63
    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;->Never:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    .line 65
    iput-boolean v0, p0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->requireBillingAddressCollection:Z

    .line 67
    iput-object p1, p0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->availableCountries:Ljava/util/Set;

    :cond_0
    return-object p0
.end method

.method public final requireContactInformationIfAllowed(Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;)Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;

    .line 46
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->arguments:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;

    invoke-virtual {v0}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;->isAllowed(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 47
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->requiredContactInformationCollectionModes:Ljava/util/Set;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0
.end method
